import React from 'react';
import {useState, useEffect} from 'react';

const ArticleForm = ({allJournalists, allCategories, allLocations, article, onCreate, onUpdate}) => {

    const [stateArticle, setStateArticle] = useState(
        {
            headline:"",
            summary:"",
            fullStory:"",
            journalist: null,
            categoryType: null,
            location: null,
            date: null,
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
                categoryType: null,
                location: null,
                date: null,
                viewCount: 0,
                favourite: false,
                image: ""
            }
            setStateArticle(resetArticle)
        }
    }, [article])

    if(!allJournalists.length === 0){ 
        return <p>Loading...</p> 
    }

    const journalistOptions = allJournalists.map((journalist, index) => {
        return <option key={index} value={index}>{journalist.name}</option> 
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

                {/* <label htmlFor = "categoryType">Category:</label>
                <select name="categoryType" onChange={handleCategory} defaultValue={findJournalistIndex() || "select-journalist"}>
                    <option disabled value='select-journalist'>Select a Journalist</option>
                    {journalistOptions}
                </select> */}

            </div>
        </form>
        </>
    )
   

}

export default ArticleForm;