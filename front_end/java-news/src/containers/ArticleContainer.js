import React, {useState} from 'react';
import {Route, Switch} from 'react-router-dom';
import ArticleDetail from '../components/articles/ArticleDetail';
import ArticleList from '../components/articles/ArticleList';

const ArticleContainer = ({allArticles}) => {

    const[selectedArticle, setSelectedArticle] = useState({})

    const handleSelectedArticle = (article) => {
        setSelectedArticle(article)
    }


    return(
        <>
        <Switch>
            <Route exact path='/articles' render={() =>{
                return <ArticleList allArticles={allArticles} onArticleSelect={handleSelectedArticle} />
            }}/>
            <Route exact path='/articles/:id' render={() => {
                return <ArticleDetail article={selectedArticle}/>
            }}/>

        </Switch>
        </>
    )

}

export default ArticleContainer;