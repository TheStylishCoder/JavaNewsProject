import React from 'react';
import Journalist from  './Journalist';
import {Link} from 'react-router-dom';
import '../../static/css/JournalistList.css';


const JournalistList = ({journalist, allJournalists}) => {

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
        <>
        <Link to="/journalists"><p>journalists</p></Link>
        <div className="journalist-list">
    
            <ul>
                
                {journalistListItems}
            </ul>
        </div>
        </>
        
    )

}

export default JournalistList;