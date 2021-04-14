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

    const handleUpdate = (event) => {
        let copiedJournalist = {...stateJournalist} 
        copiedJournalist["name"] = event.target.value; 
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
        <h2 className="heading">{heading}</h2>
        <form onSubmit={handleSubmit}>
            <div className = "journalist-form">
                <br />
                <label htmlFor = "name">Journalist Full Name:</label>
                <br />
                <input className="input-field" type = "text" placeholder="Full Name" name="name" onChange={handleUpdate} value={stateJournalist.name} />
                <br />
                <button type="submit">Save</button>
                <br/>
            </div>
        </form>
        </>
    )

}

export default JournalistForm;