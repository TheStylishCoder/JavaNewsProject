import React from 'react';
import {useState, useEffect} from 'react';

const ArticleForm = ({allJournalists, allCategories, allLocations, article, onCreate, onUpdate}) => {

    const [stateArticle, setStateArticle] = useState(
        {
            headline:"",
            summary:"",
            fullStory:"",
            journalist: null,
            category: null,
            location: null,
            date: "",
            viewCount: 0,
            favourite: false,
            image: ""
        }
    )

    let heading=""
    if(!article){
        heading = "Create New Article"
    }else{
        heading = "Edit " + article.headline;
    }

    useEffect(() => {
        if(article){
            let copiedArticle = {...article}
            setStateArticle(copiedArticle);
        }else{
            let resetArticle = {
                headline:"",
                summary:"",
                fullStory:"",
                journalist: null,
                category: null,
                location: null,
                date: "",
                viewCount: 0,
                favourite: false,
                image: ""
            }
            setStateArticle(resetArticle)
        }
    }, [article])

    if(!allJournalists.length === 0 && !allCategories.length === 0 && !allLocations.length ===0){ 
        return <p>Loading...</p> 
    }

    const journalistOptions = allJournalists.map((journalist, index) => {
        return <option key={index} value={index}>{journalist.name}</option> 
    })

    const categoryOptions = allCategories.map((category, index) => {
        return <option key={index} value={index}>{category.type}</option>
    })

    const locationOptions = allLocations.map((location, index) => {
        return <option key={index} value={index}>{location.name}</option>
    })

    const handleChange = function (event){
        let propertyName = event.target.name; 
        let copiedArticle= {...stateArticle} 
        copiedArticle[propertyName] = event.target.value; 
        setStateArticle(copiedArticle);
    }

    const handleJournalist = function(event){
        const index = parseInt(event.target.value);
        const selectedJournalist = allJournalists[index];
        let copiedArticle = {...stateArticle};
        copiedArticle['journalist'] = selectedJournalist;
        setStateArticle(copiedArticle);
    }

    const handleCategory = function(event){
        const index = parseInt(event.target.value);
        const selectedCategory = allCategories[index];
        let copiedArticle = {...stateArticle};
        copiedArticle['category'] = selectedCategory;
        setStateArticle(copiedArticle);
    }

    const handleLocation= function(event){
        const index = parseInt(event.target.value);
        const selectedLocation = allCategories[index];
        let copiedArticle = {...stateArticle};
        copiedArticle['location'] = selectedLocation;
        setStateArticle(copiedArticle);
    }

    const handleSubmit = function(event){
        event.preventDefault();
        if(stateArticle.id){
            onUpdate(stateArticle)
        }else{
            onCreate(stateArticle)
        }
    }

    const findJournalistIndex = function(){ 
        if(article){
            return allJournalists.findIndex(journalist => article.journalist.id === journalist.id)
        }else{
            return null;
        }
    }

    const findCategoryIndex = function(){ 
        if(article){
            return allCategories.findIndex(category => article.category.id === category.id)
        }else{
            return null;
        }
    }

    const findLocationIndex = function(){ 
        if(article){
            return allLocations.findIndex(location => article.location.id === location.id)
        }else{
            return null;
        }
    }

    return(
        <>
        <h2>{heading}</h2>
        <form onSubmit={handleSubmit}>
            <div className = "article-form">

                <label htmlFor = "headline">Headline:</label>
                <input type="text" placeholder="Headline" name="headline" onChange={handleChange} value={stateArticle.headline} />
              
                <label htmlFor = "summary">Summary:</label>
                <input type="text" placeholder="Summary" name="summary" onChange={handleChange} value={stateArticle.summary} />
                
                <label htmlFor = "fullStory">Main Content:</label>
                <input type="text" placeholder="Main Content" name="fullStory" onChange={handleChange} value={stateArticle.fullStory} />
                
                <label htmlFor = "journalist">Author:</label>
                <select name="journalist" onChange={handleJournalist} defaultValue={findJournalistIndex() || "select-journalist"}>
                    <option disabled value='select-journalist'>Select a Journalist</option>
                    {journalistOptions}
                </select>

                <label htmlFor = "category">Category:</label>
                <select name="category" onChange={handleCategory} defaultValue={findCategoryIndex() || "select-category"}>
                    <option disabled value='select-category'>Select a Category</option>
                    {categoryOptions}
                </select>

                <label htmlFor = "location">Location:</label>
                <select name="location" onChange={handleLocation} defaultValue={findLocationIndex() || "select-location"}>
                    <option disabled value='select-location'>Select a Location</option>
                    {locationOptions}
                </select>

                <label htmlFor = "date">Date:</label>
                <input type="date" name="date" onChange={handleChange} value={stateArticle.date} />
                  

                <label htmlFor = "image">Image Link/URL:</label>
                <input type="text" placeholder="Image URL" name="image" onChange={handleChange} value={stateArticle.image} />

                <button type="submit">Save</button>
            </div>
        </form>
        </>
    )
   

}

export default ArticleForm;