import React, {useState} from 'react';
import './App.css';
import {
    createBrowserRouter,
    RouterProvider,
} from "react-router-dom";
import HomePage from './homepage';
import Login from   './authorization/Login/index';
import Signup from "./authorization/Signup";
import UserProfile from "./userPage/UserProfile";
import NavBar from './homepage/NavBar';
import UserPage from './userPage';
import EditCard from "./recipePage/EditCard";
import Search from "./search";
import History from "./userPage/History";
import FavList from "./userPage/FavList";
import {Recipe} from "./models/recipe";

const router = createBrowserRouter([

    {
        path: '/',
        element: <Login />
    },
    {
        path: 'homepage',
        element: <HomePage />
    },
    {
        path: 'login',
        element: <Login />
    },
    {
        path: 'signup',
        element: <Signup />
    },
    {
        path: 'userProfile',
        element: <UserPage />
    },
    {
        path: 'search',
        element: <Search />
    },
    {
        path: 'history',
        element: <History/>
    },
    {
        path: 'favList',
        element: <FavList/>
    }
])

function App() {
    return (
        <div>
            <RouterProvider router={router} />
        </div>
    );
}

export default App;