import React from 'react';
import Article from './Article';
import {Link} from 'react-router-dom';

const ArticleDetail = ({article, onDelete}) => {

    if (!article){
      return <p className="hide-loading">Loading...</p>
    }


  const handleDelete = () => {
    onDelete(article.id)
  }

  

  const editUrl ="/admin/articles/" + article.id + "/edit"


    return (
      <div className = "article-detail">
      <Article article = {article}/>
      <p>Full Story: {article.fullStory}</p>
      <p>Location: {article.location.name}</p>
      
      <button onClick={handleDelete}>Delete</button>
      <Link to={editUrl}><button type="button">Edit</button></Link>
      </div>
    )
  }

export default ArticleDetail; 
