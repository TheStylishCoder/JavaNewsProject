import React from 'react';
// import { BrowserRouter as Router, Route, Switch } from 'react-router-dom';
// import { useState, useEffect } from "react";
// import JournalistList from '../components/journalist/JournalistList';
// import JournalistForm from '../components/journalist/JournalistForm';
// import JournalistDetail from '../components/journalist/JournalistDetail';
// import Request from '../helpers/request';
// import { Button } from '@material-ui/core';



const JournalistContainer = () => {
    // const [journalist, setJournalist] = useState([]);
    // const [articles, setArticles] = useState([]);


    // const requestAll = function () {
    //     const request = new Request();
    //     const journalistPromise = request.get('http://localhost:8080/api/journalist')
    //     const articlePromise = request.get('http://localhost:8080/api/articles')

    //     Promise.all([journalistPromise, articlePromise])
    //         .then((data) => {
    //             setJournalist(data[0]);
    //             setArticles(data[1]);
    //         })
    // }

    // useEffect(() => {
    //     requestAll()
    // }, [])

    // const findJournalistById = function (id) {
    //     return journalist.find((journalist) => {
    //         return journalist.id === parseInt(id);
    //     })
    // }

    // const handleDelete = function (id) {
    //     const request = new Request();
    //     const url = "http://localhost:8080/api/journalist/" + id
    //     request.delete(url)
    //         .then(() => window.location = "/journalist")
    // }

    // const handlePost = function (journalist) {
    //     const request = new Request();
    //     request.post("http://localhost:8080/api/journalist", journalist)
    //         .then(() => window.location = '/journalist')
    // }

    // const handleUpdate = function (journalist) {
    //     const request = new Request();
    //     request.patch('http://localhost:8080/api/journalist/' + journalist.id, journalist)
    //         .then(() => {
    //             window.location = '/journalist/' + journalist.id
    //         })
    // }



    // if (!journalist) {
    //     return null
    // }
    return (
        // <Router>
            <>
                {/* <Switch>

                    <Route exact path='/journalist/new' render={() => {
                        return <JournalistForm articles={articles} onCreate={handlePost} />
                    }} />

                    <Route exact path="/journalist/:id/edit" render={(props) => {
                        const id = props.match.params.id;
                        const journalist = findJournalistById(id);
                        return <JournalistForm journalist={journalist} articles={articles} onUpdate={handleUpdate} />
                    }} />


                    <Route exact path="/journalist/:id" render={(props) => {
                        const id = props.match.params.id;
                        const journalist = findJournalistById(id);
                        return <JournalistDetail journalist={journalist}
                            onDelete={handleDelete}
                            onUpdate={handleUpdate}
                            articles={articles}
                        />
                    }} />

                    <Route render={() => {
                        return <>
                        <h1>Create / Edit Journalist</h1>
                        <Button variant="contained" color="primary"  href="/journalist/new">Create New Journalist</Button>
                        <JournalistList journalist={journalist} />
                        </>
                    }} />
                </Switch> */}
            </>
        // </Router>
    )
}

export default JournalistContainer;