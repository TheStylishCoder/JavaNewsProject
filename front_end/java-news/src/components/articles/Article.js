import React from 'react';
import {Link} from 'react-router-dom';


const Article = ({article, currentUser, addToViewCount, addToRecentlyViewed, handleFavouriteToggle}) => {

  if (!article){
    return <p>Loading...</p>
  }

  const handleView = function(){
      console.log("handleView called", article)
      addToViewCount(article);
    // article.viewCount +=1;
     console.log("after modification", article)
    // currentUser.viewedArticles.push(article);
        addToRecentlyViewed(article);
  }


  const url = "/articles/" + article.id;


  return (
    <>
    <Link to = {url} className="name" onClick={handleView}>
    {article.headline}
    </Link>
    <img src={article.image} height="auto" width="300px" />
    <p>Author: {article.journalist.name}</p>
    <p>Date: {article.date}</p>
    <p>Category: {article.category.type}</p>
    <p>Summary: {article.summary}</p>
    </>
  )
}

export default Article;