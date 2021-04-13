import React from 'react';
import {Link} from 'react-router-dom';

const Article = ({article}) => {

  if (!article){
    return <p className="hide-loading">Loading...</p>
  }

  const url = "/admin/articles/" + article.id;

  return (
    <>
    <img src={article.image} height="auto" width="300px" alt=""/>
    <Link to = {url} className="name">
    {article.headline} 
    </Link>
    <p><b>Author:</b> {article.journalist.name}</p>
    <p><b>Date: </b>{article.date}</p>
    <p><b>Category:</b> {article.category.type}</p>
    <p><b>Summary:</b> {article.summary}</p>
    
    </>
  )
}

export default Article;
