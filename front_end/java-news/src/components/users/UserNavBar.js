import React from 'react';
import {Link} from 'react-router-dom';

const UserNavBar = () => {

    return(
        <>
        <ul>
            <li className="navLink">
                <Link to="/users/profile">Profile</Link>
            </li>
            <li className="navLink">
                <Link to="/users/readinglist">Reading List</Link>
            </li>
            <li className="navLink">
                <Link to="/users/recentlyviewed">Recently Viewed</Link>
            </li>
            <li className="navLink">
                <Link to="/users/localnews">News In My Area</Link>
            </li>
        </ul>
        </>
    )

}

export default UserNavBar;