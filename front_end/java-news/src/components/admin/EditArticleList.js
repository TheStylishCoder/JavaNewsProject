import React from 'react';

const EditArticleList = ({allArticles}) => {

    const articleListItems = allArticles.map((article, index) => {
        return(
            <>
                <li key={index}>
                    {article.headline}
                    <img src={article.image} height="300px" width="auto" />
                    <button>Edit</button>
                    <button>Delete</button>
                </li>
            </>
        )
    })

    return(
        <>
        <h2>Current Articles</h2>
        <ul>
            {articleListItems}
        </ul>
        </>
    )

}

export default EditArticleList;