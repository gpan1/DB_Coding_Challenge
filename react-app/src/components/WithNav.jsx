import React from 'react';
import Container from 'react-bootstrap/Container';
import Nav from 'react-bootstrap/Nav';
import Navbar from 'react-bootstrap/Navbar';
import { Outlet } from 'react-router';
import './WithNavCss.css';
import logo from '../images/Deutsche_Bank_logo.png';

export const withNav = () => {
    return (
        <>
        <a class="navbar-brand" href="/"><img style={{resizeMode: 'contain', height: 100, width: 100,}} src={logo} alt = "Deutscge Bank Logo"/></a>
          {/* <Navbar.Brand href="/">Bonds</Navbar.Brand> */}
          <Navbar expand="lg" className="bg-body-tertiary">
            <Container>
              <Navbar.Toggle aria-controls="basic-navbar-nav" />
              <Navbar.Collapse id="basic-navbar-nav">
                <Nav className="me-auto">
                  <Nav.Link href="/allbonds">All Bonds</Nav.Link>
                  <Nav.Link href="/matureBonds">Due For Maturity</Nav.Link>
                  <Nav.Link href="/settlingBonds">Settling Bonds</Nav.Link>
                  <Nav.Link href="/bondById">Search Bond</Nav.Link>
                  <Nav.Link href="/bondsAndBooks">Bonds in Books</Nav.Link>
                  <Nav.Link href="/clientId">View Client</Nav.Link>
                  <Nav.Link href="/addBond">Add Bond</Nav.Link>
                  <Nav.Link href="/logout">Log out</Nav.Link>
                </Nav>
              </Navbar.Collapse>
            </Container>
          </Navbar>
          <Outlet />
        </>
      );
};

export default withNav;