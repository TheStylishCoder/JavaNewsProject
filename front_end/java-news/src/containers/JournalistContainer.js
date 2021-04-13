import React from 'react';
import JournalistDetail from '../components/journalists/JournalistDetail';
import JournalistList from '../components/journalists/JournalistList';
import {Route, Switch} from 'react-router-dom';




const JournalistContainer = ({journalist, currentUser, allJournalists}) => {

      const findJournalistById = function(id){
        return allJournalists.find((journalist) => {
            return journalist.id === parseInt(id);
        })
    }


      if(!allJournalists){
          return null
      }
    
       return(
        <>
        <Switch>
         
        <Route exact path='/journalists' render={() =>{
            return <JournalistList allJournalists={allJournalists}/>
        }}/>

       <Route exact path="/journalists/:id" render={(props) =>{
        const id = props.match.params.id;
        const journalist = findJournalistById(id);
        return <JournalistDetail journalist={journalist} currentUser={currentUser}/>
        }}/>

        <Route render={() => {
        return <JournalistList allJournalists={allJournalists} currentUser={currentUser}/>
        }} />

       
        </Switch>
        </>
    )

}

export default JournalistContainer;