import React from 'react';
import Article from '../articles/Article';

const LocalNews = ({allArticles, currentUser}) => {

    if(!currentUser){
        return (<p>Loading...</p>)
    }
    
    const addToViewCount = function(article){
        console.log("addToViewCount called", article, article.viewCount)
        article.viewCount += 1;
        console.log("after modification", article, article.viewCount)
    }

    const addToRecentlyViewed = function(article){
        console.log("addToRecentlyViewed called", currentUser.viewedArticles)
        currentUser.viewedArticles.push(article);
        console.log("after modification", currentUser.viewedArticles)
    }

   
   
    const results = allArticles.filter(article => article.location.name === currentUser.location.name);


    const localNewsNodes = results.map((article, index) => {
        return (
            <li key={index} className="component-item">
            <div className="component">
            <Article article={article} currentUser={currentUser} addToViewCount={addToViewCount} addToRecentlyViewed={addToRecentlyViewed}/>
            </div>
            </li>
        )
        
    })

    

    return(
        <ul className="article-list">
        {localNewsNodes}
        </ul>
    )

}

export default LocalNews;