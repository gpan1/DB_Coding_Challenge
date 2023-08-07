import React from "react";
import { Bonds } from "./components/bonds/Bonds";
import 'bootstrap/dist/css/bootstrap.min.css';
import './App.css';
import {Route, Routes } from 'react-router-dom';
import BondForm from './components/BondForm';
import LoginPage from "./components/LoginPage";
import AuthChecker from "./components/AuthChecker";
import WithNav from "./components/WithNav";
import WithoutNav from "./components/WithoutNav";
import { MatureBonds } from "./components/bonds/MatureBonds";
import { BondById } from "./components/bonds/BondById";
import { FindClient } from "./components/bonds/FindClient";
import { SettlingBonds } from "./components/bonds/BondsToBeSettled";
import { BondsAndBooks } from "./components/bonds/bondsAndBooks";
import { LogoutPage } from "./components/LogoutPage";


function App() {
  
  return (
    <>
        <Routes>
          <Route element = {<WithoutNav/>}>
            <Route path="/login" element={<LoginPage/>} />
            <Route path="/logout" element={<LogoutPage/>} />
          </Route>
          <Route element = {<WithNav/>}>
          <Route path="allbonds" element={<AuthChecker><Bonds/></AuthChecker>} />
          <Route path="addBond" element={<AuthChecker><BondForm/></AuthChecker>} />
          <Route path="bondById" element={<AuthChecker><BondById/></AuthChecker>} />
          <Route path="matureBonds" element={<AuthChecker><MatureBonds/></AuthChecker>} />
          <Route path="settlingBonds" element={<AuthChecker><SettlingBonds/></AuthChecker>} />
          <Route path="clientId" element={<AuthChecker><FindClient/></AuthChecker>} />
          <Route path="bondsAndBooks" element={<AuthChecker><BondsAndBooks/></AuthChecker>} />
          <Route path="/" element={<AuthChecker><Bonds/></AuthChecker>} />
          </Route>
        </Routes>
      
    </>
  );
}

export default App;
