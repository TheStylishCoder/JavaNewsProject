import React from 'react';

const EditJournalistList = ({allJournalists}) => {

    const journalistListItems = allJournalists.map((journalist, index) => {
        return(
            <>
                <li key={index}>
                    {journalist.name}
                    <button>Edit</button>
                    <button>Delete</button>
                </li>
            </>
        )
    })

    return(
        <>
        <h2>Current Journalists</h2>
        <ul>
            {journalistListItems}
        </ul>
        </>
    )

}

export default EditJournalistList;