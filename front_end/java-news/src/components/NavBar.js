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
                    <Link to="/articles/politics">POLITICS</Link>
                </li>
                <li className="navLink">
                    <Link to="/articles/business">BUSINESS</Link>
                </li>
                <li className="navLink">
                    <Link to="/articles/technology">TECHNOLOGY</Link>
                </li>
                <li className="navLink">
                    <Link to="/articles/entertainment">ENTERTAINMENT</Link>
                </li>
                <li className="navLink">
                    <Link to="/articles/lifestyle">LIFESTYLE</Link>
                </li>
                <li className="navLink">
                    <Link to="/articles/uplifting">UPLIFTING</Link>
                </li>
                <li className="navLink">
                    <Link to="/articles/sports">SPORTS</Link>
                </li>
                <li className="navLink">
                    <Link to="journalists">JOURNALISTS</Link>
                    
                </li>
                <li className="navLink">
                    <Link to="/login">LOGIN</Link>
                </li>
            </ul>
       
        </header>
        </>
    )

}

export default NavBar;