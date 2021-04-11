import React from 'react';
import Article from './Article';

const ArticleDetail = ({article}) => {

    if(!article){
        return <p>Loading...</p>
    }

    return(
    
        <div className="article-detail">
            <h1>{article.headline}</h1>
            <img src={article.image} height="400px" width="auto" />
            <p>Author: {article.journalist.name}</p>
            <p>Date: {article.date}</p>
            <p>Category: {article.category.type}</p>
            <p>{article.fullStory}</p> 
        </div>
    
    )
}

export default ArticleDetail;