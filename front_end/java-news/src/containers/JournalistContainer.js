import React, { useState, useEffect } from 'react';
import JournalistDetail from '../components/journalists/JournalistDetail';
import JournalistList from '../components/journalists/JournalistList';


const JournalistContainer = () => {

    const [allJournalists, setAllJournalists] = useState([])
    const [selectedJournalist, setSelectedJournalist] = useState(null)

    const getJournalists = () => {

    }

    useEffect(() => {
        getJournalists()
    }, [])

    const handleSelectedJournalist = (journalist) => {
        setSelectedJournalist(journalist)
        .then(() => {
            window.location = '/journalists'
        })
    }

    return(
        <>
        <h1>Journalists</h1>
        <div className="beers-container">
        <JournalistList allJournalists={allJournalists} onSelectedJournalist={handleSelectedJournalist}/>
        <JournalistDetail journalist={selectedJournalist}/>
        </div>
        </>
    )

}

export default JournalistContainer;