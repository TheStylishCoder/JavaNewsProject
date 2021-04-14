import React, {useState, useEffect} from 'react';
import {Link} from 'react-router-dom';
import Article from './articles/Article';

const HomePage = ({allBusiness, allPolitics, allTechnology, allEntertainment}) => {

    const [randomArticles, setRandomArticles] = useState([])
    const [randomArticleNodes, setRandomArticleNodes] = useState("")

    useEffect(() => {
        setRandomArticles([randomArticle1, randomArticle2, randomArticle3, randomArticle4]);
    }, [])


    useEffect(() => {
        const randomArticleNodes = randomArticles.map((randomArticle, index) => {
            // const url = "/articles/" + randomArticle.id;
            console.log(randomArticle)
            return <li key={index}>  
            <div>
                {/* <Link to = {url} className="name" >
                {randomArticle.headline}
                </Link> */}
                <img src={randomArticle.image} height="auto" width="300px" alt=""/>
                <p>Author: {randomArticle.journalist.name}</p>
                <p>Date: {randomArticle.date}</p>
                <p>Category: {randomArticle.category.type}</p>
                <p>Summary: {randomArticle.summary}</p> 
            </div>    
            </li>
        })
        setRandomArticleNodes(randomArticleNodes)
    }, [randomArticles])


    if(allBusiness.length === 0
        &&
        allEntertainment.length === 0
        && 
        allTechnology === 0
        &&
        allEntertainment === 0){
        return <p>Loading...</p>
    }

    const randomArticle1 = allTechnology[Math.floor(Math.random() * allTechnology.length)]
    const randomArticle2 = allPolitics[Math.floor(Math.random() * allPolitics.length)]
    const randomArticle3 = allEntertainment[Math.floor(Math.random() * allEntertainment.length)]
    const randomArticle4 = allBusiness[Math.floor(Math.random() * allBusiness.length)]

    
 


    // const findArticleById = function(id){
    //     return randomArticles.find((randomArticle) => {
    //       return randomArticle.id === parseInt(id);
    //     })
    //   }



   
    


   


    return(
     <div className="home-page">
         <h1>Welcome To Full Stack News!</h1>
        <h2>Photo of the Day</h2>
        <img src="https://picsum.photos/200" alt=""/>

         <h2>Featured Articles</h2>
         <ul>{randomArticleNodes}</ul>

        {/* <Link to = {url} className="name" >
        {randomArticle.headline}
        </Link>
        <img src={randomArticle.image} height="auto" width="300px" alt=""/>
        <p>Author: {randomArticle.journalist.name}</p>
        <p>Date: {randomArticle.date}</p>
        <p>Category: {randomArticle.category.type}</p>
        <p>Summary: {randomArticle.summary}</p> */}
     </div>

    )
}

export default HomePage;