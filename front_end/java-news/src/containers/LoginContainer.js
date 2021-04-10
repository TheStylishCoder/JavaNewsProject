import React from 'react';
import Request from '../helpers/request';
import {Route, Switch} from 'react-router-dom';
import LoginForm from '../components/login/LoginForm';
import SignUpForm from '../components/login/SignUpForm';


const LoginContainer = ({allUsers, allLocations}) => {


    const handlePost = function(user){
        const request = new Request();
        request.post("/api/users", user)
        .then(() => {
          window.location = '/users/profile'
        })
      }

    const handleLogin = function(){
            // set user login status to true?
    }

    return(
        <>
        <Switch>
            
            <Route exact path='/login' render={() => 
            <> 
            <div className="login-container">
                <SignUpForm allUsers={allUsers}  onCreate={handlePost} allLocations={allLocations} />
                <LoginForm allUsers={allUsers}  handleLogin={handleLogin} />
            </div>
            </>
            }/>

        </Switch>
       
        </>
    )

}

export default LoginContainer;
