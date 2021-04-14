import React from 'react';
import {Link} from 'react-router-dom';

const Journalist = ({journalist}) => {

  if (!journalist){
    return <p>Loading...</p>
  }

  const url = "/admin/journalists/" + journalist.id;

  return (
    <div className="edit-journalist-component">
      <Link to = {url} className="name">
      {journalist.name} 
      <br/>
      <br/>
      <img src={journalist.image} height="300" width="auto" alt="journalist profile"/>
      </Link>
      
    </div>
    
    
  )
}

export default Journalist;
