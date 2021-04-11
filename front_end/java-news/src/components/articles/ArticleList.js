import React from 'react';
import {Link} from 'react-router-dom';


const ArticleList = ({allArticles, onArticleSelect}) => {

    if (allArticles.length === 0){
        return (<p>Loading...</p>)
    }

    const articleListItems = allArticles.map((article, index) => {
        return(
            <li onClick={()=> {onArticleSelect(article)}} className="article-list-item" key={index}>
                <h3>{article.headline}</h3>
                <p>{article.summary}</p>
                <img src={article.image} height="200" width="auto" />
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