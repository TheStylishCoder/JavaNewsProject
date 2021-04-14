import React, {useState, useEffect} from 'react';
import {BrowserRouter as Router, Route, Switch} from 'react-router-dom';
import Request from '../helpers/request';
import NavBar from '../components/NavBar';
import ArticleContainer from './ArticleContainer';
import JournalistContainer from './JournalistContainer';
import UserContainer from './UserContainer';
import AdminContainer from './AdminContainer';
import LoginContainer from './LoginContainer';
import UserNavBar from '../components/users/UserNavBar';
import AdminNavBar from '../components/admin/AdminNavBar';
import '../App.css';
import HomePage from '../components/HomePage';
import FooterPage from '../components/FooterPage';



const MainContainer = () => {

    const [allArticles, setAllArticles] = useState([]);
    const [allJournalists, setAllJournalists] = useState([]);
    const [allUsers, setAllUsers] = useState([]);
    const [allRoles, setAllRoles] = useState([]);
    const [allLocations, setAllLocations] = useState([]);
    const [allCategories, setAllCategories] = useState([]);
    const [currentUser, setCurrentUser] = useState({
        username: "",
        password: "",
        role: "",
        location: "",
        viewedArticles: []
    });
    const [businessArticles, setBusinessArticles] = useState([]);
    const [politicsArticles, setPoliticsArticles] = useState([]);
    const [technologyArticles, setTechnologyArticles] = useState([]);
    const [entertainmentArticles, setEntertainmentArticles] = useState([]);
    const [lifestyleArticles, setLifestyleArticles] = useState([]);
    const [upliftingArticles, setUpliftingArticles] = useState([]);
    const [sportsArticles, setSportsArticles] = useState([]);


    const requestAll = function(){
        const request = new Request();
        const articlePromise = request.get('/api/articles')
        const journalistPromise = request.get('/api/journalists')
        const userPromise = request.get('/api/users')
        const rolePromise = request.get('/api/roles')
        const locationPromise = request.get('/api/locations')
        const categoryPromise = request.get('/api/categories')
        const businessArticlesPromise = request.get('/api/articles/category?category=Business')
        const politicsArticlesPromise = request.get('/api/articles/category?category=Politics')
        const technologyArticlesPromise = request.get('/api/articles/category?category=Technology')
        const entertainmentArticlesPromise = request.get('/api/articles/category?category=Entertainment')
        const lifestyleArticlesPromise = request.get('/api/articles/category?category=Lifestyle')
        const upliftingArticlesPromise = request.get('/api/articles/category?category=Uplifting')
        const sportsArticlesPromise = request.get('/api/articles/category?category=Sports')
        


        Promise.all([articlePromise, journalistPromise, userPromise, rolePromise, locationPromise, categoryPromise, businessArticlesPromise, 
            politicsArticlesPromise, technologyArticlesPromise, entertainmentArticlesPromise, lifestyleArticlesPromise, upliftingArticlesPromise, sportsArticlesPromise])
        .then((data) => {
            setAllArticles(data[0]);
            setAllJournalists(data[1]);
            setAllUsers(data[2]);
            setAllRoles(data[3]);
            setAllLocations(data[4]);
            setAllCategories(data[5]);
            setBusinessArticles(data[6]);
            setPoliticsArticles(data[7]);
            setTechnologyArticles(data[8]);
            setEntertainmentArticles(data[9]);
            setLifestyleArticles(data[10]);
            setUpliftingArticles(data[11]);
            setSportsArticles(data[12]);
        })
    }

    useEffect(() => {
        requestAll()
    }, [])


    const handleCurrentUser = (user) => {
        console.log("mainContainer user", user);
        setCurrentUser(user)
    }

    const checkForRole = () => {
        console.log("check for user called", currentUser)
        if(currentUser && currentUser.role.role === "User"){
            return <UserNavBar />
        }else if(currentUser && currentUser.role.role === "Admin"){
            return <AdminNavBar />
        }else {
            return null
        }
        
    }





    // const checkFavourite = function(article){
    //     console.log("check faves called")
    //     const readingList = currentUser.favouriteArticles
    //     console.log("reading list - ", readingList)
    //     if(readingList.some(list => list[list.headline] === article.headline)){
    //         article.favourite = true
    //     }else {
    //         article.favourite = false

    //     }
    // }

    const handleFavouriteToggle = (article) => {
        console.log("handleFaveToggle called")
        // if(article.favourite = true){
        //         let copiedUser = {...currentUser}
        //         const index = copiedUser.favouriteArticles.indexOf(article)
        //         copiedUser.favouriteArticles.splice(index,1)
        //         setCurrentUser(copiedUser)
        //         article.favourite = false
        // } else {
            let copiedUser = {...currentUser};
            copiedUser.favouriteArticles.push(article)
            setCurrentUser(copiedUser);
            article.favourite = true;
        // }

    }







    return(
        <Router>
        <div className="content-wrap">
        <NavBar/>
        {checkForRole()}
        <Switch>
          <Route path="/articles"  render={() => {
              return <ArticleContainer handleFavouriteToggle={handleFavouriteToggle} allArticles={allArticles} businessArticles={businessArticles} politicsArticles={politicsArticles} technologyArticles={technologyArticles}
               entertainmentArticles={entertainmentArticles} lifestyleArticles={lifestyleArticles} upliftingArticles={upliftingArticles} sportsArticles={sportsArticles}  currentUser={currentUser} setCurrentUser={setCurrentUser}/>
          }} />

          <Route path="/journalists" render={() => {
              return <JournalistContainer allJournalists={allJournalists} />
          }} />

          <Route path="/users" render={() => {
              return <UserContainer allUsers={allUsers} allArticles={allArticles} allJournalists={allJournalists} currentUser={currentUser}/> 
          }} />

          <Route path="/admin" render={() => {
              return <AdminContainer allArticles={allArticles} allJournalists={allJournalists} allCategories={allCategories} allLocations={allLocations} />
          }} />

          <Route path="/login" render={() => {
              return <LoginContainer allLocations={allLocations} allUsers={allUsers} currentUser={currentUser} setCurrentUser={handleCurrentUser} />
          }} />

        <Route path="/home" render={() => {
              return <HomePage allBusiness={businessArticles} allTechnology={technologyArticles} allEntertainment={entertainmentArticles} allPolitics={politicsArticles} />
          }} />

          
        </Switch>
        </div>
        {/* <FooterPage /> */}
        </Router>
    )

}

export default MainContainer;
