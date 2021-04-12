import React, { useState } from 'react';

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
                handleLogin(user);
            } else {
                return null;
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

       
       
    


    return(
        <>
        <div className="login-form">
        <h3>Login</h3>
            <form onSubmit={loginSubmit} >
                <input type="text" placeholder="Username" name="username" onChange={handleChange} value={stateUser.username} />
                <input type="Password" placeholder="Password" name="password" onChange={handleChange} value={stateUser.password}/>
                <button type="submit">Login</button>
            </form>
        </div>
        </>
    )

}

export default LoginForm;