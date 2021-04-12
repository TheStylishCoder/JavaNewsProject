import React from 'react';
import Journalist from  '../admin/Journalist';

const JournalistDetail = ({journalist}) => {

    if(!journalist){
        return <p>Loading</p>
    }

    const journalistArticles = journalist.articles.map((article, index) => {
        return <li key={index}>
        {article.headline}
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