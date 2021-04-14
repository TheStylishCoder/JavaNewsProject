import React from 'react';
import {Link} from 'react-router-dom';
import '../../static/css/JournalistDetail.css';

const JournalistDetail = ({journalist}) => {

    if(!journalist){
        return <p>Loading</p>
    }

    const journalistArticles = journalist.articles.map((article, index) => {
        const url = "/articles/" + article.id;
        return <li className="journalist-article-list-item" key={index}>
        <Link to = {url} className="name">{article.headline} </Link>
        </li>
      })

    return(
        <>
        <div className = "journalist-detail">
        <h1>{journalist.name}</h1>
        <img src={journalist.image} height="300" width="auto" alt="journalist profile"/>
        <h2>All articles by {journalist.name}:</h2>

        <ul className="journalist-articles">
        {journalistArticles}
        </ul>
       

        </div>

        </>
    )

}

export default JournalistDetail;