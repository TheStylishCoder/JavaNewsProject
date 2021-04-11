import React from 'react';
import UserNavBar from '../components/users/UserNavBar';
import UserProfile from '../components/users/UserProfile';
import ReadingList from '../components/users/ReadingList';
import RecentlyViewed from '../components/users/RecentlyViewed';
import LocalNews from '../components/users/LocalNews';

const UserContainer = () => {

    return(
        <>
        <UserNavBar />

        <Route exact path='/users/profile' render={() => {
            return <UserProfile />
        }} />

        <Route exact path='/users/readinglist' render={() => {
            return <ReadingList />
        }} />

        <Route exact path='/users/recentlyviewed' render={() => {
            return <RecentlyViewed/>
        }} />

        <Route exact path='/users/localnews' render={() => {
            return <LocalNews />
        }} />

        </>
    )

}

export default UserContainer;