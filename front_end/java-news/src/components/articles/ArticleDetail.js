import React from 'react';
import Article from './Article';

const ArticleDetail = ({article, currentUser}) => {

    if(!article){
        return <p>Loading...</p>
    }

    const favouriteClick = function(article){
        if(currentUser.role === "User"){
            return <button>Add To Reading List</button>
        }else{
            return null
        }

    }

    return(
    
        <div className="article-detail">
            <h1>{article.headline}</h1>
            <img src={article.image} height="400px" width="auto" />
            <p>Author: {article.journalist.name}</p>
            <p>Date: {article.date}</p>
            <p>Category: {article.category.type}</p>
            <p>{article.fullStory}</p> 
            <p>{article.viewCount}</p>
            {favouriteClick()}
        </div>
    
    )
}

export default ArticleDetail;