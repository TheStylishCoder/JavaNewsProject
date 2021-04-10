import React from 'react';
import {Link} from 'react-router-dom';

const AdminNavBar = () => {

    return (
        <>
        <ul>
            <li className="navLink">
                <Link to="/admin/journalists/new">Create Journalist</Link>
            </li>
            <li className="navLink">
                <Link to="/admin/journalists">Edit Journalists</Link>
            </li>
            <li className="navLink">
                <Link to="/admin/articles/new">Create Article</Link>
            </li>
            <li className="navLink">
                <Link to="/admin/articles">Edit Articles</Link>
            </li>
        </ul>
        </>
    )

}

export default AdminNavBar;