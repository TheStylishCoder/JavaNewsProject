import React from 'react';
import Request from '../helpers/request';
import {Route, Switch} from 'react-router-dom';
import LoginForm from '../components/login/LoginForm';
import SignUpForm from '../components/login/SignUpForm';
import UserProfile from '../components/users/UserProfile';


const LoginContainer = ({currentUser, setCurrentUser, allUsers, allLocations}) => {

  


    const handlePost = function(user){
        const request = new Request();
        request.post("/api/users", user)
        .then(() => {
          window.location = '/users/profile'
        })
        setCurrentUser(user);
      }

    const handleLogin = function(user){
            setCurrentUser(user)
        }


    return(
        <>
        <Switch>
         
            <Route exact path='/login' render={() => 
            <>
            <div className="login-container">
                <SignUpForm allUsers={allUsers}  onCreate={handlePost} allLocations={allLocations} />
                <LoginForm allUsers={allUsers}  handleLogin={handleLogin} currentUser={currentUser}/>
            </div>

             </>
            }/>
           
           

        </Switch>
       
        </>
    )

}

export default LoginContainer;
