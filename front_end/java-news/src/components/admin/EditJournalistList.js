import React from 'react';
import Journalist from './Journalist';

const EditJournalistList = ({allJournalists}) => {

    if (allJournalists.length === 0){
        return (<p>Loading ...</p>)
    }

    const journalistNodes = allJournalists.map((journalist, index) => {
        return (
          <li key={index} className="journalist-list-item">
          <div className="journalist-component">
          <Journalist journalist={journalist} />
          </div>
          </li>
        )
      })

    // const journalistListItems = allJournalists.map((journalist, index) => {
    //     return(
    //         <>
    //             <li key={index}>
    //                 {journalist.name}
    //                 <button>Edit</button>
    //                 <button>Delete</button>
    //             </li>
    //         </>
    //     )
    // })

    return(
        <ul className="journalist-list">
	        {journalistNodes}
	      </ul>

        // <>
        // <h2>Current Journalists</h2>
        // <ul>
        //     {journalistListItems}
        // </ul>
        // </>
    )

}

export default EditJournalistList;