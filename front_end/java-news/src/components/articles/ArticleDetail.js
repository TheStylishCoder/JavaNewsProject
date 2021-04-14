import React from 'react';
import '../../static/css/ArticleDetail.css';


const ArticleDetail = ({article, currentUser, handleFavouriteToggle}) => {

    if(!article){
        return <p>Loading...</p>
    }



    

    const favouriteDisplay = function(article){
        console.log("favouriteDisplay called" )
        console.log(currentUser);
        if(currentUser.role.role === "User"){
            // return <p>button here</p>
            return <button onClick={() => {handleFavouriteToggle(article)}}>
                {article.favourite ? 'Delete from Reading List' : 'Add to Reading List'}</button>
        }else{
            return null
        }

    }

    return(
    
        <div className="article-detail">
            <h1>{article.headline}</h1>
            <img src={article.image} height="400px" width="auto" alt=""/>
            <p><b>Author:</b> {article.journalist.name}</p>
            <p><b>Date:</b> {article.date}</p>
            <p><b>Category:</b> {article.category.type}</p>
            <p><b>Full Story: </b>{article.fullStory}</p> 
            {favouriteDisplay(article)}
        </div>
    
    )
}

export default ArticleDetail;