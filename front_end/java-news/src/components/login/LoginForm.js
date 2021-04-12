import React, { useState } from 'react';
import {Link} from 'react-router-dom';

const LoginForm = ({currentUser, allUsers, handleLogin}) => {

    const [stateUser, setStateUser] = useState(
        {
            username: "",
            password: ""
        }
    )

    const handleChange = function(event){
        let propertyName = event.target.name;
        let copiedUser = {...stateUser}
        copiedUser[propertyName]= event.target.value;
        setStateUser(copiedUser);
    }




    const loginSubmit = function(event){
        event.preventDefault();
        console.log("login submit called")
        for( let user of allUsers){
            if(stateUser.name === user.name && stateUser.password === user.password){
                handleLogin(user)
                const profileLink = (currentUser ? (<Link to="/users/profile">Go to Profile</Link>) : (null));
        }
    }   
}



       
       
 

    return(
        <>

        <div className="login-form">
        <h3>Login</h3>
        <form onSubmit={loginSubmit} >
            <input type="text" placeholder="Username" name="username" onChange={handleChange} value={stateUser.username} />
            <input type="Password" placeholder="Password" name="password" onChange={handleChange} value={stateUser.password}/>
            <button type="submit">Login</button> 
        </form>
        <Link to="/users/profile">Go to Profile</Link>
        </div>
        </>
    )

}

export default LoginForm;