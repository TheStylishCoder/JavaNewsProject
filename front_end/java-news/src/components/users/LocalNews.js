import React from 'react';
import Article from '../articles/Article';

const LocalNews = ({allArticles, currentUser}) => {

    if(!currentUser){
        return (<p>Loading...</p>)
    }
    
   
    const results = allArticles.filter(article => article.location.name === currentUser.location.name);


    const localNewsNodes = results.map((article, index) => {
        return (
            <li key={index} className="component-item">
            <div className="component">
            <Article article={article} />
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