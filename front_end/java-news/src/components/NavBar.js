import React from 'react';
import {Link} from 'react-router-dom';

const NavBar = () => {

    return(
        <>
           <ul>
            <li className="navLink">
                <Link to="/home">Home</Link>
            </li>
            <li className="navLink">
                <Link to="/articles/politics">Politics</Link>
            </li>
            <li className="navLink">
                <Link to="/articles/business">Business</Link>
            </li>
            <li className="navLink">
                <Link to="/articles/technology">Technology</Link>
            </li>
            <li className="navLink">
                <Link to="/articles/entertainment">Entertainment</Link>
            </li>
            <li className="navLink">
                <Link to="/articles/lifestyle">Lifestyle</Link>
            </li>
            <li className="navLink">
                <Link to="/articles/uplifting">Uplifting</Link>
            </li>
            <li className="navLink">
                <Link to="/articles/sports">Sports</Link>
            </li>
            <li className="navLink">
                <Link to="/journalists">Journalist</Link>
            </li>
            <li className="navLink">
                <Link to="/login">Login</Link>
            </li>
        </ul>
        </>
    )

}

export default NavBar;