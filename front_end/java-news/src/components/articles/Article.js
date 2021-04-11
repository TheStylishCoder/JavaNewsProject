import React from 'react';
import {Link} from 'react-router-dom';


const Article = ({article, currentUser}) => {

  if (!article){
    return <p>Loading...</p>
  }

  const handleView = function(article){
    article.viewCount +=1;
    currentUser.viewedArticles.push(article);

  }


  const url = "/articles/" + article.id;


  return (
    <>
    <Link to = {url} className="name" onClick={handleView}>
    {article.headline}
    </Link>
    <img src={article.image} height="300px" width="auto" />
    <p>Author: {article.journalist.name}</p>
    <p>Date: {article.date}</p>
    <p>Category: {article.category.type}</p>
    <p>Summary: {article.summary}</p>
    </>
  )
}

export default Article;