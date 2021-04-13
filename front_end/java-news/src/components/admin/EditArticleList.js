import React from 'react';
import Article from './Article';
import '../../static/css/ArticleList.css';

const EditArticleList = ({allArticles}) => {

    if(allArticles.length === 0){
        return (<p>Loading ...</p>)
    }


    const articleNodes = allArticles.map((article, index) => {
        return (
          <li key={index} className="component-item">
          <div className="component">
          <Article article={article} />
          </div>
          </li>
        )
      })

    return(
        <ul className="article-list">
	        {articleNodes}
	      </ul>

    )

}

export default EditArticleList; 