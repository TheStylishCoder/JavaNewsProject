import React from 'react';
import Article from './Article';

const ArticleDetail = ({article}) => {

    if(!article){
        return <p>Loading...</p>
    }

    return(
    
        <div className="article-detail">
            <Article article={article}/>
        </div>
    
    )
}

export default ArticleDetail;