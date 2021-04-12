import React from 'react';
import {Link} from 'react-router-dom';
import '../static/css/NavBar.css';

const NavBar = () => {

 

    return(
        <>
        <header className="navbar">
        <img src="/images/Header.png" alt="Header" width="100%" />
     
           <ul>
                <li className="navLink">
                    <Link to="/home"><i class="fas fa-home fa-2x"></i></Link>
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
       
        </header>
        </>
    )

}

export default NavBar;