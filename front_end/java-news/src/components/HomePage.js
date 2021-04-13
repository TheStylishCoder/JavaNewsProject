import React from 'react';
import {Link} from 'react-router-dom';

const HomePage = ({allArticles, article, addToViewCount, addToRecentlyViewed}) => {

    if(allArticles.length === 0){
        return <p>Loading...</p>
    }

    const randomArticle = allArticles[Math.floor(Math.random() * allArticles.length)]
    

    // const handleView = function(){
    //     console.log("handleView called", randomArticle)
    //     addToViewCount(randomArticle);
    //   // article.viewCount +=1;
    //    console.log("after modification", randomArticle)
    //   // currentUser.viewedArticles.push(article);
    //       addToRecentlyViewed(randomArticle);
    // }

 
 

    const url = "/articles/" + randomArticle.id;


    return(
     <div className="home-page">
         <h1>Welcome To Full Stack News!</h1>
        <h2>Photo of the Day</h2>
        <img src="https://picsum.photos/200" alt=""/>

         <h2>Featured Article</h2>
        <Link to = {url} className="name" >
        {randomArticle.headline}
        </Link>
        <img src={randomArticle.image} height="auto" width="300px" alt=""/>
        <p>Author: {randomArticle.journalist.name}</p>
        <p>Date: {randomArticle.date}</p>
        <p>Category: {randomArticle.category.type}</p>
        <p>Summary: {randomArticle.summary}</p>
     </div>
    )
}

export default HomePage;