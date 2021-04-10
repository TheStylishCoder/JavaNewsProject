import React from 'react';
import Request from '../helpers/request';
import {Route, Switch} from 'react-router-dom';
import LoginForm from '../components/login/LoginForm';
import SignUpForm from '../components/login/SignUpForm';


const LoginContainer = ({allUsers}) => {


    const handlePost = function(user){
        const request = new Request();
        request.post("/api/users", user)
        .then(() => {
          window.location = '/articles'
        })
      }

    const handleLogin = function(){
            // set user login status to true?
    }

    return(
        <>
        <Switch>
            
            <Route exact path='/login' render={() => {
                return <SignUpForm allUsers={allUsers}  onCreate={handlePost} />
             }}/>

            <Route exact path='/login' render={() => {
                return <LoginForm allUsers={allUsers}  handleLogin={handleLogin} />
            }}/>


        </Switch>
       
        </>
    )

}

export default LoginContainer;
