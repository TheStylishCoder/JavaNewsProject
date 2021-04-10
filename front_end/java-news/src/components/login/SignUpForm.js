import React, {useState} from 'react';

const SignUpForm = ({locations, onCreate}) => {


    const [stateUser, setStateUser] = useState(
        {
            username: "",
            password: "",
            roleType: USER,
            location: null
        }
    )



    const handleChange = function(event){
        let propertyName = event.target.name;
        let copiedUser = {...stateUser}
        copiedUser[propertyName]= event.target.value;
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




    const locationOptions = locations.map((location, index) => {
        return <option key={index} value={index}>{location}</option>
    })

  


    return(
        <>
        <div class="sign-up-form">
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