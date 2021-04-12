import React from 'react';
import Journalist from  '../admin/Journalist'


const JournalistList = ({journalists, currentUser}) => {

    if (journalists.length === 0){
        return(<p>Loading...</p>)
    }


    const JournalistListItems = journalists.map((journalist, index) => {
        return(
           <li className="journalist-list-item" key={index}>
               <div className="journalist-component">
                   <Journalist journalist={journalist} currentUser={currentUser} />
                </div>
            </li>
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