import React from 'react';

const ArticleDetail = ({selectedArticle}) => {

    return(
        <>
        <div className="article-detail">
            {selectedArticle.location} {selectedArticle.category}
            {selectedArticle.headline}
            {selectedArticle.journalist} {selectedArticle.date}
            {selectedArticle.fullStory}
        </div>
        </>
    )

}

export default ArticleDetail;