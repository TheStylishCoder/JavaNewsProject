import React, { useState } from 'react';
import {Link} from 'react-router-dom';

const LoginForm = ({allUsers, handleLogin}) => {

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




    const loginSubmit = function(){
        for( let user of allUsers){
            if(stateUser.name === user.name && stateUser.password === user.password){
                handleLogin(user)
                // .then(() => {
                //     window.location = '/users/:id'
                //   })
        }
    }
}
    //     const userList = allUsers.map((user, index) => {
    //         if(stateUser.name === user.name && stateUser.password === user.password){
    //             return user;
    //         }
    //         handleLogin(user);

    //         }
    //         return null;
    //     })
    // }

       
       
    
    const url = "/users/profile"

    return(
        <>
        <div className="login-form">
        <h3>Login</h3>
            <form onSubmit={loginSubmit} >
                <input type="text" placeholder="Username" name="username" onChange={handleChange} value={stateUser.username} />
                <input type="Password" placeholder="Password" name="password" onChange={handleChange} value={stateUser.password}/>
                <Link to={url}><button type="submit">Login</button></Link> 
            </form>
        </div>
        </>
    )

}

export default LoginForm;