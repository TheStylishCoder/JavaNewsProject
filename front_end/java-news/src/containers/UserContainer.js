import React from 'react';
import {Route} from 'react-router-dom';
import UserProfile from '../components/users/UserProfile';
import ReadingList from '../components/users/ReadingList';
import RecentlyViewed from '../components/users/RecentlyViewed';
import LocalNews from '../components/users/LocalNews';

const UserContainer = ({currentUser, allUsers, allArticles}) => {

    // const findUserById = function(id){
    //     return allUsers.find((user) => {
    //         return user.id === parseInt(id);
    //     })
    // }

    return(
        <>
        {/* <UserNavBar /> */}

        <Route exact path='/users/profile' render={() => {
            return <UserProfile currentUser={currentUser}/>
        }} />

        <Route exact path='/users/readinglist' render={() => {
            return <ReadingList currentUser={currentUser}/>
        }} />

        <Route exact path='/users/recentlyviewed' render={() => {
            return <RecentlyViewed currentUser={currentUser}/>
        }} />

        <Route exact path='/users/localnews' render={() => {
            return <LocalNews allArticles={allArticles} currentUser={currentUser}/>
        }} />
{/* 
        <Route exact path = '/users/:id' render={(props) => {
                const id = props.match.params.id;
                const user = findUserById(id);
                return <UserProfile user={user}/>
            }}/> */}

        </>
    )

}

export default UserContainer;