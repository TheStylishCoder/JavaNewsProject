import React from 'react';
import {Link} from 'react-router-dom';

const Journalist = ({Journalist}) => {

  if (!journalist){
    return <p>Loading...</p>
  }

  const url = "/journalists/" + journalist.id;

  return (
    <>
    <Link to = {url} className="name">
    {journalist.name} 
    </Link>
    {/* could put image here  */}
    </>
  )
}

export default Journalist;
