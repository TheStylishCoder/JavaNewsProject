import React from 'react';
import {Link} from 'react-router-dom';

const Article = ({article}) => {

  if (!article){
    return <p>Loading...</p>
  }

  const url = "/admin/articles/" + article.id;

  return (
    <>
    <Link to = {url} className="name">
    {article.headline} 
    </Link>
    <p>Author: {article.journalist.name}</p>
    <p>Date: {article.date}</p>
    <p>Category: {article.category.type}</p>
    <p>Summary: {article.summary}</p>
    
    </>
  )
}

export default Article;
