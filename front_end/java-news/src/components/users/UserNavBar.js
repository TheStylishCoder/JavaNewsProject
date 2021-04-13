import React from 'react';
import {Link} from 'react-router-dom';

const UserNavBar = () => {

    return(
        <>
        <div className='navbar'>
            <ul>
                <li className="navLink">
                    <Link to="/users/profile">PROFILE</Link>
                </li>
                <li className="navLink">
                    <Link to="/users/readinglist">READING LIST</Link>
                </li>
                <li className="navLink">
                    <Link to="/users/recentlyviewed">RECENTLY VIEWED</Link>
                </li>
                <li className="navLink">
                    <Link to="/users/localnews">NEWS IN MY AREA</Link>
                </li>
            </ul>
        </div>
        </>
    )

}

export default UserNavBar;