import React from 'react';
import Article from '../articles/Article';

const RecentlyViewed = ({currentUser}) => {

    if(!currentUser){
        return (<p>Loading...</p>)
    }
    
    const viewed = currentUser.viewedArticles;

    const viewedArticlesNodes = viewed.map((article, index) => {
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
        {viewedArticlesNodes}
        </ul>
    )

}

export default RecentlyViewed;