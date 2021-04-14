import React from 'react';
import {Link} from 'react-router-dom';

const Journalist = ({journalist}) => {

  if (!journalist){
    return <p>Loading...</p>
  }

  const url = "/admin/journalists/" + journalist.id;

  return (
    <div className="journalist-component">
      <Link to = {url} className="name">
      {journalist.name} 
      </Link>
      <img src={journalist.image} height="300" width="auto" alt="journalist profile"/>
    </div>
    
    
  )
}

export default Journalist;
