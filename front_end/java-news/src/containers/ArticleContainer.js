import React, {useState} from 'react';
import {Route, Switch} from 'react-router-dom';
import ArticleDetail from '../components/articles/ArticleDetail';
import ArticleList from '../components/articles/ArticleList';

const ArticleContainer = ({allArticles, businessArticles, politicsArticles, technologyArticles, entertainmentArticles, lifestyleArticles, upliftingArticles, sportsArticles, currentUser}) => {

    const findArticleById = function(id){
        return allArticles.find((article) => {
          return article.id === parseInt(id);
        })
      }


    if(!allArticles){
        return null
    }

    return(
        <>
        <Switch>

        <Route exact path='/articles/business' render={() =>{
            return <ArticleList allArticles={businessArticles} currentUser={currentUser}/>
        }}/>

        <Route exact path='/articles/politics' render={() =>{
            return <ArticleList allArticles={politicsArticles} currentUser={currentUser}/>
        }}/>

        <Route exact path='/articles/technology' render={() =>{
            return <ArticleList allArticles={technologyArticles} currentUser={currentUser}/>
        }}/>

        <Route exact path='/articles/entertainment' render={() =>{
            return <ArticleList allArticles={entertainmentArticles} currentUser={currentUser}/>
        }}/>

        <Route exact path='/articles/lifestyle' render={() =>{
            return <ArticleList allArticles={lifestyleArticles} currentUser={currentUser}/>
        }}/>

        <Route exact path='/articles/uplifting' render={() =>{
            return <ArticleList allArticles={upliftingArticles} currentUser={currentUser}/>
        }}/>

        <Route exact path='/articles/sports' render={() =>{
            return <ArticleList allArticles={sportsArticles} currentUser={currentUser}/>
        }}/>

        <Route exact path="/articles/:id" render={(props) =>{
        const id = props.match.params.id;
        const article = findArticleById(id);
        return <ArticleDetail article={article}/>
        }}/>

        <Route render={() => {
        return <ArticleList allArticles={allArticles} currentUser={currentUser}/>
        }} />

        </Switch>
        </>
    )

}

export default ArticleContainer;