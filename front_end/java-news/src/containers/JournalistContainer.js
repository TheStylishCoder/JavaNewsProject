import React, { useState, useEffect } from 'react';
import {Route, Switch} from 'react-router-dom';
import Journalist from  '../components/journalists/Journalist';
import JournalistDetail from '../components/journalists/JournalistDetail';
import JournalistList from '../components/journalists/JournalistList';
import Request from '../helpers/request';


const JournalistContainer = ({journalist, currentUser, allJournalists}) => {
    // const [allJournalists, setAllJournalists] = useState([]);
    // const [allArticles, setArticles] = useState ([]);
    


    // const requestAll = function(){
    //     const request = new Request();
    //     const journalistPromise = request.get('/api/journalists')
    //     const articlePromise = request.get('/api/articles')
      
    
    //     Promise.all([journalistPromise, articlePromise])
    //     .then((data) => {
    //         setAllJournalists(data[0]);
    //         setArticles(data[1]);
            
    //     })
    //   }

    //   useEffect(()=>{
    //     requestAll()
    //   }, [])

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

        {/* <Route render={() => {
        return <JournalistList allJournalists={allJournalists} currentUser={currentUser}/>
        }} /> */}

       
        </Switch>
        </>
    )

}

export default JournalistContainer;