import React, { useState, useEffect } from "react";
import { Link } from "react-router-dom";
import Article from "./articles/Article";
import '../static/css/HomePage.css';

const HomePage = ({
  allBusiness,
  allPolitics,
  allTechnology,
  allEntertainment,
}) => {
  const [randomArticles, setRandomArticles] = useState([]);
  const [randomArticleNodes, setRandomArticleNodes] = useState("");
  useEffect(() => {
    const randomArticle1 =
      allTechnology[Math.floor(Math.random() * allTechnology.length)];
    console.log("article 1", randomArticle1);
    const randomArticle2 =
      allPolitics[Math.floor(Math.random() * allPolitics.length)];
    const randomArticle3 =
      allEntertainment[Math.floor(Math.random() * allEntertainment.length)];
    const randomArticle4 =
      allBusiness[Math.floor(Math.random() * allBusiness.length)];
    setRandomArticles([
      randomArticle1,
      randomArticle2,
      randomArticle3,
      randomArticle4,
    ]);
  }, [allBusiness, allPolitics, allEntertainment, allTechnology]);
  useEffect(() => {
    const randomArticleNodes = randomArticles.map((randomArticle, index) => {
      console.log("random", randomArticles);
      if (randomArticle) {
        const url = "/articles/" + randomArticle.id;
        return (
          <li key={index}>
            <div className="home-component">
              <Link to={url} className="home-header">
                {randomArticle.headline}
              </Link>
              <img
                src={randomArticle.image}
                height="auto"
                width="300px"
                alt=""
              />
              <p>Author: {randomArticle.journalist.name}</p>
              <p>Category: {randomArticle.category.type}</p>
              <p>Summary: {randomArticle.summary}</p>
            </div>
          </li>
        );
      }
    });
    setRandomArticleNodes(randomArticleNodes);
  }, [randomArticles]);
  if (randomArticles.length === 0) {
    return <p>Loading...</p>;
  }
  // const findArticleById = function(id){
  //     return randomArticles.find((randomArticle) => {
  //       return randomArticle.id === parseInt(id);
  //     })
  //   }
  return (
    <>
    <div className="home-page">
      <h1 className="heading">Welcome To Full Stack News!</h1>
      <h2 className="heading">Featured Articles</h2>
      <ul className="home-list">{randomArticleNodes}</ul>
      {/* <Link to = {url} className="name" >
        {randomArticle.headline}
        </Link>
        <img src={randomArticle.image} height="auto" width="300px" alt=""/>
        <p>Author: {randomArticle.journalist.name}</p>
        <p>Date: {randomArticle.date}</p>
        <p>Category: {randomArticle.category.type}</p>
        <p>Summary: {randomArticle.summary}</p> */}
        
    </div>
    {/* <div className="photoOfDay" >
        <h2>Photo of the Day</h2>
        <img src="https://picsum.photos/200" height="400" width="400" alt="random picture" />
    </div> */}
    </>
  );
};
export default HomePage;