import React from 'react';
import JournalistForm from '../components/admin/JournalistForm';
import Request from '../helpers/request';
import {Route, Switch} from 'react-router-dom';
import AdminNavBar from '../components/admin/AdminNavBar';
import EditJournalistList from '../components/admin/EditJournalistList';
import ArticleForm from '../components/admin/ArticleForm';
import EditArticleList from '../components/admin/EditArticleList';

const AdminContainer = ({allArticles, allJournalists, allCategories, allLocations}) => {

    const handleJournalistPost = function(journalist){
        const request = new Request();
        request.post("/api/journalists", journalist)
        .then(() => {
            window.location = '/journalists'
        })
    }

    const handleJournalistUpdate = function(journalist){
        const request = new Request();
        request.patch('/api/journalists' + journalist.id, journalist)
        .then(() => {
            window.location = '/journalists' + journalist.id
        })
    }

    const handleArticlePost = function(article){
        const request = new Request();
        request.post("/api/articles", article)
        .then(() => {
            window.location = '/articles'
        })
    }

    if(!allJournalists && !allArticles){
        return null
    }
    return(
        <>
        <AdminNavBar />

        <Route exact path='/admin/journalists/new' render={() => {
            return <JournalistForm onCreate={handleJournalistPost} />
        }} />

        <Route exact path='/admin/journalists' render={() => {
            return <EditJournalistList allJournalists={allJournalists} />
        }} />

        <Route exact path='/admin/articles/new' render={() => {
            return <ArticleForm allJournalists={allJournalists} allCategories={allCategories} allLocations={allLocations} onCreate={handleArticlePost} />
        }} />

        <Route exact path='/admin/articles' render={() => {
            return <EditArticleList allArticles={allArticles} />
        }} />

        {/* <Route exact path='/journalists/:id/edit' render={(props) => {
            const id = props.match.params.id;
            // const journalist = findJournalistById(id);
            return <JournalistForm journalist={journalist} onUpdate={handleJournalistUpdate} />
        }} /> */}
        </>
    )

}

export default AdminContainer;