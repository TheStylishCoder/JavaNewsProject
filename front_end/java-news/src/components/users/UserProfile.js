import React from 'react';

const UserProfile = ({currentUser}) => {

    if(!currentUser){
        return null;
    }

    return(
        <>
        <p>Hello, {currentUser.username}</p>
        </>
    )
}

export default UserProfile;