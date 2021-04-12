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

    const checkFavourite = function(article){
        const readingList = currentUser.favouriteArticles;
        if(readingList.some(article)){
            {article.favourite = true}
        }else {
            {article.favourite = false}

        }
    }

    const handleFavouriteToggle = (article) => {
        checkFavourite();
        const readingList = currentUser.favouriteArticles.map((favourite) => {
            if(favourite.headline === article.headline){
                article.favourite = false
                const index = currentUser.favouriteArticles.indexOf(article)
                currentUser.favouriteArticles.splice(index,1)
            }
            currentUser.favouriteArticles.push(article)
            article.favourite = true;
        })
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
        return <ArticleDetail article={article} onFavouriteToggle={handleFavouriteToggle}/>
        }}/>

        <Route render={() => {
        return <ArticleList allArticles={allArticles} currentUser={currentUser}/>
        }} />

        </Switch>
        </>
    )

}

export default ArticleContainer;