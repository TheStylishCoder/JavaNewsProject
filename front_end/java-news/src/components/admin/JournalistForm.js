import React from 'react';
import {useState, useEffect} from 'react';

const JournalistForm = ({journalist, onCreate, onUpdate}) => {

    const [stateJournalist, setStateJournalist] = useState(
        {
            name: ""
        }
    )

    let heading=""
    if(!journalist){
        heading = "Create Journalist"
    } else{
        heading = "Edit " + journalist.name;
    }

    useEffect(() => {
        if(journalist){
            let copiedJournalist = {...journalist}
            setStateJournalist(copiedJournalist);
        }else{
            let resetJournalist = {
                name: ""
            }
            setStateJournalist(resetJournalist)
        }
    }, [journalist])

    const handleChange = function (event){
        let copiedJournalist = {...stateJournalist} 
        copiedJournalist[propertyName] = event.target.value; 
        setStateJournalist(copiedJournalist);
    }

    const handleSubmit = function(event){
        event.preventDefault();
        if(stateJournalist.id){
            onUpdate(stateJournalist)
        }else{
            onCreate(stateJournalist)
        }
    }
    


    return(
        <>
        <h2>{heading}</h2>
        <form onSubmit={handleSubmit}>
            <div className = "journalist-form">
                <label htmlFor = "name">Journalist Full Name:</label>
                <input type = "text" placeholder="Full Name" name="name" onChange={handleChange} value={stateJournalist.name} />
                <button type="submit">Save</button>
            </div>
        </form>
        </>
    )

}

export default JournalistForm;