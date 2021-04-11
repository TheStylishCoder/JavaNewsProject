import React from 'react';
import Article from './Article';


const ArticleList = ({allArticles, currentUser}) => {

    if (allArticles.length === 0){
        return (<p>Loading...</p>)
    }

    const articleListItems = allArticles.map((article, index) => {
        return(
          
             <li className="article-list-item" key={index}>
                 <div className="article-component">
                    <Article article={article} currentUser={currentUser} />
                 </div>
            </li>
        )
    })

    return(
        <>
        <ul className="article-list">
            {articleListItems}
        </ul>
        </>
    )
}

export default ArticleList;