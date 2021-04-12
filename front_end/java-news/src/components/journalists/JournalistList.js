import React from 'react';
import {Link} from 'react-router-dom';

const JournalistList = ({selectedJournalist, allJournalists, onSelectedJournalist}) => {

    const url = "/journalists/" + selectedJournalist.id;

    const JournalistListItems = allJournalists.map((journalist, index) => {
        return(
            <Link to = {url}>
             <li onClick={() => {onSelectedJournalist(journalist)}} key={index}>{journalist.name}</li>
             </Link>
        )
    })

    return(
        <div className="journalist-list">
            <ul>
                {JournalistListItems}
            </ul>
        </div>
        
    )

}

export default JournalistList;