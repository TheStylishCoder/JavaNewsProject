import React from 'react';
import Journalist from  './Journalist';


const JournalistList = ({allJournalists}) => {

    if (allJournalists.length === 0){
        return(<p>Loading...</p>)
    }


    const journalistListItems = allJournalists.map((journalist, index) => {
        return(
           <li className="journalist-list-item" key={index}>
               <div className="journalist-component">
                   <Journalist journalist={journalist}/>
                </div>
            </li>
        )
    })

    return(
        <div className="journalist-list">
            <ul>
                {journalistListItems}
            </ul>
        </div>
        
    )

}

export default JournalistList;