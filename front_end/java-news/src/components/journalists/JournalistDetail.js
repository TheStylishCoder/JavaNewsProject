import React from 'react';
import {Link} from 'react-router-dom';


const JournalistDetail = ({journalist}) => {

    if(!journalist){
        return <p>Loading</p>
    }

    const journalistArticles = journalist.articles.map((article, index) => {
        const url = "/articles/" + article.id;
        return <li key={index}>
        <Link to = {url} className="name">{article.headline} </Link>
        </li>
      })

    return(
        <>
        <div className = "journalist-detail">
        <h1>Journalist: {journalist.name}</h1>
        <h2>All articles by {journalist.name}:</h2>

        <ul>
        {journalistArticles}
        </ul>
       

        </div>

        </>
    )

}

export default JournalistDetail;