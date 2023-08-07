import React from 'react';
import { useState} from 'react';
import { login, signup } from "../services/BondServices";
import Cookies from 'js-cookie';
import { useNavigate } from "react-router-dom";
const bcrypt = require('bcryptjs');
var salt = bcrypt.genSaltSync(10);
// import logo from '../images/Deutsche_Bank_logo.png';

export default function LoginPage() {
    let [authMode, setAuthMode] = useState("signin");
    const [username, setUsername] = useState('');
    const [password, setPassword] = useState('');
    const [name, setName] = useState('');
    const navigate = useNavigate();

    const handleUsername = (event)=>{
      setUsername(event.target.value)
    }

    const handlePassword = (event)=> {
      setPassword(event.target.value);
    }

    const handleName = (event)=> {
      setName(event.target.value);
    }

    const changeAuthMode = () => {
      setAuthMode(authMode === "signin" ? "signup" : "signin")
    }

    const handleSubmitSignIn = async (event)=>{
      event.preventDefault();
      let hashedPass = await login(username);
      var inFifteenMinutes = new Date(new Date().getTime() + 15 * 60 * 1000);
      if(bcrypt.compareSync(password, hashedPass.data.toString())){
        Cookies.set("token", 'Gavin is Cool', {
          expires: inFifteenMinutes
      });
      navigate("/");
      }
      else{
        window.location.reload(false);
      }
  }
  const handleSubmitSignup = async (event)=>{
    event.preventDefault();
    let user = {};
    user.username = username;
    user.password = bcrypt.hashSync(password, salt);
    user.name = name;
    let sign = await signup(name, username, user.password);
    console.log(sign);
    console.log(user);      
}
  
    if (authMode === "signin") {
      return (
        <>
        {/* <img style={{resizeMode: 'contain', height: 100, width: 100,}} src= {logo} alt = "Deutsche Bank Logo"></img> */}
        <div className="Auth-form-container">
          <form className="Auth-form">
            <div className="Auth-form-content">
              <h3 className="Auth-form-title">Sign In</h3>
              <div className="text-center">
                Not registered yet?{" "}
                <span className="link-primary" onClick={changeAuthMode}>
                  Sign Up
                </span>
              </div>
              <div className="form-group mt-3">
                <label>Email address</label>
                <input
                  type="email"
                  className="form-control mt-1"
                  placeholder="Enter email"
                  value = {username}
                  onChange={e => handleUsername(e)}
                />
              </div>
              <div className="form-group mt-3">
                <label>Password</label>
                <input
                  type="password"
                  className="form-control mt-1"
                  placeholder="Enter password"
                  value = {password}
                  onChange={e => handlePassword(e)}
                />
              </div>
              <div className="d-grid gap-2 mt-3">
                <button type="submit" className="btn btn-primary" onClick={handleSubmitSignIn}>
                  Submit
                </button>
              </div>
            </div>
          </form>
        </div>
      </>
      )
    }
  
    return (
      <div className="Auth-form-container">
        <form className="Auth-form">
          <div className="Auth-form-content">
            <h3 className="Auth-form-title">Sign Up</h3>
            <div className="text-center">
              Already registered?{" "}
              <span className="link-primary" onClick={changeAuthMode}>
                Sign In
              </span>
            </div>
            <div className="form-group mt-3">
              <label>Full Name</label>
              <input
                type="email"
                className="form-control mt-1"
                placeholder="e.g Gavin Pan"
                value = {name}
                onChange={e => handleName(e)}
              />
            </div>
            <div className="form-group mt-3">
              <label>Email address</label>
              <input
                type="email"
                className="form-control mt-1"
                placeholder="Email Address"
                value = {username}
                onChange={e => handleUsername(e)}
              />
            </div>
            <div className="form-group mt-3">
              <label>Password</label>
              <input
                type="password"
                className="form-control mt-1"
                placeholder="Password"
                value = {password}
                onChange={e => handlePassword(e)}
              />
            </div>
            <div className="d-grid gap-2 mt-3">
              <button type="submit" className="btn btn-primary" onClick={handleSubmitSignup}>
                Submit
              </button>
            </div>
          </div>
        </form>
      </div>
    )
}
