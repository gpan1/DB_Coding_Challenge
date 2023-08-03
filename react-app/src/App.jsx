import React from "react";
import { Pets } from "./components/pets/Pets";
import 'bootstrap/dist/css/bootstrap.min.css';
import './App.css';
import Container from 'react-bootstrap/Container';
import Nav from 'react-bootstrap/Nav';
import Navbar from 'react-bootstrap/Navbar';
import {Route, Routes } from 'react-router-dom';
import BondForm from './components/BondForm';
import LoginPage from "./components/LoginPage";


function App() {
  return (
    <>
      <Navbar expand="lg" className="bg-body-tertiary">
        <Container>
          <Navbar.Brand href="/">Bonds</Navbar.Brand>
          <Navbar.Toggle aria-controls="basic-navbar-nav" />
          <Navbar.Collapse id="basic-navbar-nav">
            <Nav className="me-auto">
              
              <Nav.Link href="/allbonds">All Bonds</Nav.Link>
              <Nav.Link href="/addBond">Add Bond</Nav.Link>
              <Nav.Link href="/login">Login(Testing)</Nav.Link>
            </Nav>
          </Navbar.Collapse>
        </Container>
      </Navbar>
      
        <Routes>
          <Route path="/login" element={<LoginPage/>} />
          <Route path="allbonds" element={<Pets/>} />
          <Route path="addBond" element={<BondForm/>} />
          <Route path="/" element={<LoginPage/>} />
        </Routes>
      
    </>
  );
}

export default App;
