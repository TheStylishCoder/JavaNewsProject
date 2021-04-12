import React from 'react';
import {Link} from 'react-router-dom';
import '../static/css/NavBar.css';

const NavBar = () => {

 

    return(
        <>
        <div className="navbar">
           <ul>
                <li className="navLink">
                    <Link to="/home"><i class="fas fa-home"></i></Link>
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
                    <Link to="/login">Login</Link>
                </li>
            </ul>
        </div>
        </>
    )

}

export default NavBar;