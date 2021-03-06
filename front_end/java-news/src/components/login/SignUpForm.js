import React, {useState} from 'react';

const SignUpForm = ({allLocations, onCreate}) => {


    const [stateUser, setStateUser] = useState(
        {
            username: "",
            password: "",
            role: "User",
            location: ""
        }
    )



    const handleChange = function(event){
        let propertyName = event.target.name;
        let copiedUser = {...stateUser}
        copiedUser[propertyName]= event.target.value;
        setStateUser(copiedUser);
    }



    const handleLocation = function(event){
        const index = parseInt(event.target.value);
        const selectedLocation = allLocations[index];
        let copiedUser = {...stateUser};
        copiedUser['location'] = selectedLocation;
        setStateUser(copiedUser);
    }


    const handleSubmit = function(event){
        event.preventDefault();
        if(stateUser){
            onCreate(stateUser)
        } else {
            return null;
        }
        
    }

    if(!allLocations){
        return null;
    }

    const locationOptions = allLocations.map((location, index) => {
        return <option key={index} value={index}>{location.name}</option>
    })


    return(
        <>
        <div className="sign-up-form">
            <h3>Sign Up</h3>
            <form onSubmit={handleSubmit}>
                <input type="text" placeholder="Username" name="username" onChange={handleChange} value={stateUser.username}/>
                <input type="password" placeholder="Password" name="password" onChange={handleChange} value={stateUser.password}/>
                <select name="location" onChange={handleLocation} defaultValue={"select-location"}>
                    <option disabled value="select-location">Select a location</option>
                    {locationOptions}
                </select>
                <button type="submit">Sign Up</button>
            </form>
        </div>
        
        </>
    )

}

export default SignUpForm;