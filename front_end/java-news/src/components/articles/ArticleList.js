import React from 'react';
import Article from './Article';


const ArticleList = ({allArticles, currentUser}) => {

    if (allArticles.length === 0){
        return (<p>Loading...</p>)
    }


    const addToViewCount = function(article){
        console.log("addToViewCount called", article, article.viewCount)
        article.viewCount += 1;
        console.log("after modification", article, article.viewCount)
    }

    const addToRecentlyViewed = function(article){
        console.log("addToRecentlyViewed called", currentUser.viewedArticles)
        currentUser.viewedArticles.push(article);
        console.log("after modification", currentUser.viewedArticles)
    }


    // const checkFavourite = function(article){
    //     console.log("checkFavourite called", article)
    //     const readingList = currentUser.favouriteArticles;
    //     if(readingList.some(article)){
    //         {article.favourite = true}
    //     }else {
    //         {article.favourite = false}

    //     }
    //     console.log("after checking if fave", article.favourite)
    // }

    // const handleFavouriteToggle = (article) => {
    //     console.log("handleFavouriteToggle called")
    //     checkFavourite();
    //     const readingList = currentUser.favouriteArticles.map((favourite) => {
    //         if(favourite.headline === article.headline){
    //             article.favourite = false
    //             const index = currentUser.favouriteArticles.indexOf(article)
    //             currentUser.favouriteArticles.splice(index,1)
    //         }
    //         currentUser.favouriteArticles.push(article)
    //         article.favourite = true;
    //     })
    // }



    const articleListItems = allArticles.map((article, index) => {
        return(
          
             <li className="article-list-item" key={index}>
                 <div className="component">
                    <Article article={article} currentUser={currentUser} addToRecentlyViewed={addToRecentlyViewed} addToViewCount={addToViewCount} />
                 </div>
            </li>
        )
    })

    return(
        
        <ul className="article-list">
            {articleListItems}
        </ul>
       
    )
}

export default ArticleList;