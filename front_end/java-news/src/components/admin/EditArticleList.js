import React from 'react';
import Article from './Article';

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

    // const articleListItems = allArticles.map((article, index) => {
    //     return(
    //         <>
    //             <li key={index}>
    //                 {article.headline}
    //                 <img src={article.image} height="300px" width="auto" />
    //                 <button>Edit</button>
    //                 <button>Delete</button>
    //             </li>
    //         </>
    //     )
    // })

    // return(
    //     <>
    //     <h2>Current Articles</h2>
    //     <ul>
    //         {articleListItems}
    //     </ul>
    //     </>
    // )

    return(
        <ul className="component-list">
	        {articleNodes}
	      </ul>

    )

}

export default EditArticleList;