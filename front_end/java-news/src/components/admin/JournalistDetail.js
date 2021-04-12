import React from 'react';

import {Link} from 'react-router-dom';

const JournalistDetail = ({journalist, onDelete}) => {

    // if (!journalist){
    //   return <p>Loading...</p>
    // }


  // const handleDelete = () => {
  //   onDelete(journalist.id)
  // }

  // const journalistArticles = journalist.articles.map((article, index) => {
  //   return <li key={index}>
  //   {article.headline}
  //   </li>
  // })

  // const editUrl ="/admin/journalists/" + journalist.id + "/edit"


    return (
      <>
      </>
      // <div className = "component">
      // {/* <Journalist journalist = {journalist}/> */}
      // <p>Articles:</p>
      // <ul>
      // {journalistArticles}
      // </ul>
      // <button onClick={handleDelete}>Delete {journalist.name}</button>
      // <Link to={editUrl}><button type="button">Edit {journalist.name}</button></Link>
      // </div>
    )
  }

export default JournalistDetail;
