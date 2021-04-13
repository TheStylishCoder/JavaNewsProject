import React from 'react';
import Article from '../articles/Article';

const RecentlyViewed = ({currentUser}) => {

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

    
    const viewed = currentUser.viewedArticles;

    const viewedArticlesNodes = viewed.map((article, index) => {
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
        {viewedArticlesNodes}
        </ul>
    )

}

export default RecentlyViewed;