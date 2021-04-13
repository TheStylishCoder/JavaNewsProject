import React from 'react';
import {Route, Switch} from 'react-router-dom';
import LoginForm from '../components/login/LoginForm';


const LoginContainer = ({currentUser, setCurrentUser, allUsers}) => {

  


    // const handlePost = function(user){
    //     const request = new Request();
    //     request.post("/api/users", user)
    //     .then(() => {
    //       window.location = '/users/profile'
    //     })
    //     setCurrentUser(user);
    //   }

    const handleLogin = function(user){
        console.log("handleLogin called", user)
            setCurrentUser(user)
        }


    return(
        <>
        <Switch>
         
            <Route exact path='/login' render={() => 
            <>
            <div className="login-container">
                {/* <SignUpForm allUsers={allUsers}  onCreate={handlePost} allLocations={allLocations} /> */}
                <LoginForm allUsers={allUsers}  handleLogin={handleLogin} currentUser={currentUser}/>
            </div>

             </>
            }/>
           
           

        </Switch>
       
        </>
    )

}

export default LoginContainer;
