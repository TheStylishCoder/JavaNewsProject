import React from 'react';
import Journalist from './Journalist';
import {Link} from 'react-router-dom';

const JournalistDetail = ({journalist, onDelete}) => {


    if (!journalist){
      return <p className="hide-loading">Loading...</p>
    }


  const handleDelete = () => {
    onDelete(journalist.id)
  }

  const journalistArticles = journalist.articles.map((article, index) => {
    return <li className="journalist-article-list-item" key={index}>
    {article.headline}
    </li>
  })

  const editUrl ="/admin/journalists/" + journalist.id + "/edit"


    return (
     
 
      <div className = "journalist-detail">
      <Journalist journalist = {journalist}/>
      <p>Articles:</p>
      <ul className="journalist-articles">
      {journalistArticles}
      </ul>
      <button onClick={handleDelete}>Delete {journalist.name}</button>
      <Link to={editUrl}><button type="button">Edit {journalist.name}</button></Link>
      </div>
    )
  }

export default JournalistDetail;
