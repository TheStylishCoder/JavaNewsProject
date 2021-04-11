import React from 'react';
import Article from './Article';

const ArticleDetail = ({article, currentUser}) => {

    if(!article){
        return <p>Loading...</p>
    }

    const checkFavourite = function(article){
        const readingList = currentUser.favouriteArticles;
        if(readingList.some(article)){
            {article.favourite = true}
        }else {
            {article.favourite = false}

        }
    }

    const handleFavouriteToggle = (article) => {
        checkFavourite();
        const readingList = currentUser.favouriteArticles.map((favourite) => {
            if(favourite.headline === article.headline){
                article.favourite = false
                const index = currentUser.favouriteArticles.indexOf(article)
                currentUser.favouriteArticles.splice(index,1)
            }
            currentUser.favouriteArticles.push(article)
        })
    }

    const favouriteDisplay = function(article){
        if(currentUser.role === "User"){
            return <button onClick={() => {onFavouriteToggle(article)}}>
                {article.favourite ? 'Delete from Reading List' : 'Add to Reading List'}</button>
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
            {favouriteDisplay()}
        </div>
    
    )
}

export default ArticleDetail;