import React, {useState, useEffect} from 'react';
import {BrowserRouter as Router, Route, Switch} from 'react-router-dom';
import Request from '../helpers/request';
import NavBar from '../components/NavBar';
import ArticleContainer from './AdminContainer';
import JournalistContainer from './JournalistContainer';
import UserContainer from './UserContainer';
import AdminContainer from './AdminContainer';
import LoginContainer from './LoginContainer';



const MainContainer = () => {

    const [allArticles, setAllArticles] = useState([]);
    const [allJournalists, setAllJournalists] = useState([]);
    const [allUsers, setAllUsers] = useState([]);
    const [allRoles, setAllRoles] = useState([]);
    const [allLocations, setAllLocations] = useState([]);
    const [allCategories, setAllCategories] = useState([]);

    const requestAll = function(){
        const request = new Request();
        const articlePromise = request.get('/api/articles')
        const journalistPromise = request.get('/api/journalists')
        const userPromise = request.get('/api/users')
        const rolePromise = request.get('/api/roles')
        const locationPromise = request.get('/api/locations')
        const categoryPromise = request.get('/api/categories')

        Promise.all([articlePromise, journalistPromise, userPromise, rolePromise, locationPromise, categoryPromise])
        .then((data) => {
            setAllArticles(data[0]);
            setAllJournalists(data[1]);
            setAllUsers(data[2]);
            setAllRoles(data[3]);
            setAllLocations(data[4]);
            setAllCategories(data[5]);
        })
    }

    useEffect(() => {
        requestAll()
    }, [])

    return(
        <Router>
        <>
        <NavBar/>
        <Switch>
          <Route path="/articles"  render={() => {
              return <ArticleContainer allArticles={allArticles} />
          }} />

          <Route path="/journalists" render={() => {
              return <JournalistContainer allJournalists={allJournalists} />
          }} />

          <Route path="/users" render={() => {
              return <UserContainer allUsers={allUsers} allArticles={allArticles} allJournalists={allJournalists} /> 
          }} />

          <Route path="/admin" render={() => {
              return <AdminContainer allArticles={allArticles} allJournalists={allJournalists} />
          }} />

          <Route path="/login" render={() => {
              return <LoginContainer allUsers={allUsers} />
          }} />
          
        </Switch>
        </>
        </Router>
    )

}

export default MainContainer;
