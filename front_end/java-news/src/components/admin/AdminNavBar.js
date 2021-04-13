import React from 'react';
import {Link} from 'react-router-dom';

const AdminNavBar = () => {

    return (
        <>
        <div className="navbar">
            <ul>
                <li className="navLink">
                    <Link to="/admin/journalists/new">NEW JOURNALIST</Link>
                </li>
                <li className="navLink">
                    <Link to="/admin/journalists">EDIT JOURNALIST</Link>
                </li>
                <li className="navLink">
                    <Link to="/admin/articles/new">NEW ARTICLE</Link>
                </li>
                <li className="navLink">
                    <Link to="/admin/articles">EDIT ARTICLE</Link>
                </li>
            </ul>
        </div>
        </>
    )

}

export default AdminNavBar;