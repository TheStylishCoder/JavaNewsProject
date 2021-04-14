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
             
        }
    }   
}



       
       
 

    return(
        <>

        <div className="form">
        <h3>LOGIN</h3>
        <form onSubmit={loginSubmit} >
            <label htmlFor = "username">Enter Your Username:</label>
            <br />
            <input className="input-field" type="text" placeholder="Username" name="username" onChange={handleChange} value={stateUser.username} />
            <br />
            <label htmlFor = "password">Enter Your Password:</label>
            <br />
            <input className="input-field" type="Password" placeholder="Password" name="password" onChange={handleChange} value={stateUser.password}/>
            <br />
            <button type="submit">Login</button> 
        </form>
       
        </div>
        </>
    )

}

export default LoginForm;