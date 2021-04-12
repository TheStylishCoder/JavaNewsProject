import React from 'react';


const JournalistDetail = ({journalist}) => {

    if(!journalist){
        return <p>Select a Journalist</p>
    }

    const journalistArticles = journalist.articles.map((article, index) => {
        return <li key={index}>
        {article.headline}
        </li>
      })

    return(
        <>
        <div className="journalist-detail">
            <div>
                <p>Journalists</p>
                <h2>{journalist.name}</h2>
                <p>{ journalist.article} </p>
            
            </div>

        </div>

        </>
    )

}

export default JournalistDetail;