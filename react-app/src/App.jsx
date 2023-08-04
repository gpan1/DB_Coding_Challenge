import React from "react";
import { Pets } from "./components/pets/Pets";
import 'bootstrap/dist/css/bootstrap.min.css';
import './App.css';
import {Route, Routes } from 'react-router-dom';
import BondForm from './components/BondForm';
import LoginPage from "./components/LoginPage";
import AuthChecker from "./components/AuthChecker";
import WithNav from "./components/WithNav";
import WithoutNav from "./components/WithoutNav";


function App() {
  
  return (
    <>
        <Routes>
          <Route element = {<WithoutNav/>}>
            <Route path="/login" element={<LoginPage/>} />
          </Route>
          <Route element = {<WithNav/>}>
          <Route path="allbonds" element={<AuthChecker><Pets/></AuthChecker>} />
          <Route path="addBond" element={<AuthChecker><BondForm/></AuthChecker>} />
          <Route path="/" element={<AuthChecker><Pets/></AuthChecker>} />
          </Route>
        </Routes>
      
    </>
  );
}

export default App;
