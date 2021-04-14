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
    <img src={article.image} height="auto" width="300px" alt="Article Image"/>
    <Link to = {url} className="name" onClick={handleView}>
    {article.headline}
    </Link>
    <p><b>Author:</b> {article.journalist.name}</p>
    <p><b>Date:</b> {article.date}</p>
    <p><b>Category:</b> {article.category.type}</p>
    <p><b>Summary:</b> {article.summary}</p>
    </>
  )
}

export default Article;