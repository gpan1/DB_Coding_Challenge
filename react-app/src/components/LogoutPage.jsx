import React from 'react';
import Cookies from 'js-cookie';
import { Link } from 'react-router-dom';

export const LogoutPage = () => {
    Cookies.remove("token");
    console.log(Cookies.get());
    return (
        <>
        <div>You have logged out</div>
        <Link to={'/login'}>
        <button > Click Me </button>
        </Link>
        </>
    )
}
