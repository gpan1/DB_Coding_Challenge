import React, { useState, useEffect } from "react";
import { findMatureBonds, findMaturingBonds } from "../../services/BondServices";
import "./Bonds.module.css";
import { DatePicker } from '@mui/x-date-pickers';
import { LocalizationProvider } from '@mui/x-date-pickers';
import { AdapterDateFns } from '@mui/x-date-pickers/AdapterDateFns';
import Form from 'react-bootstrap/Form';


export const MatureBonds = () => {
    const [bonds, setBonds] = useState([]);
    const [bonds2, setBonds2] = useState([]);
    const [date, setDate] = useState(null);
    
    useEffect(() => {
      if(date !=null && !isNaN(date.getFullYear()) && date.getFullYear().toString().length === 4){
        let month = ("0" + (date.getMonth() + 1)).slice(-2);
        let day = ("0" + date.getDate()).slice(-2);
        findMatureBonds(date.getFullYear() + "-" + month + "-" + day)
            .then(({data}) => {
            setBonds(data);
            });
      }
    }, [date]);
    useEffect(() => {
        if(date!=null && !isNaN(date.getFullYear()) && date.getFullYear().toString().length === 4){
          let month = ("0" + (date.getMonth() + 1)).slice(-2);
          let day = ("0" + date.getDate()).slice(-2);
          findMaturingBonds(date.getFullYear() + "-" + month + "-" + day)
              .then(({data}) => {
              setBonds2(data);
              });
        }
      }, [date]);
  return (
    <>
      <Form>
      <Form.Group className="mb-3" controlId="MaturityDate">
                    <Form.Label>Choose a Date: </Form.Label>
                    <br></br>
                    <LocalizationProvider dateAdapter={AdapterDateFns}>
                        <DatePicker label="Maturity Date" value={date} onChange={(newValue) => {setDate(newValue);}}/>
                    </LocalizationProvider>
                </Form.Group>
      </Form>
      <table>
        <caption>Matured Bonds</caption>
        <tbody>
        <tr>
            <th>Isin</th>
            <th>Cusip</th>
            <th>Issuer Name</th>
            <th>Maturity Date</th>
            <th>Coupon</th>
            <th>Type</th>
            <th>Face Value</th>
            <th>Currency</th>
            <th>Status</th>
        </tr>
            {bonds.map((bond, key) => {
              return (
                  <tr key={key}>
                    <td>{bond.isin}</td>
                    <td>{bond.cusip} </td>
                    <td>{bond.issuerName}</td>
                    <td>{bond.maturityDate}</td>
                    <td>{bond.coupon}</td>
                    <td>{bond.type}</td>
                    <td>{bond.faceValue}</td>
                    <td>{bond.currency}</td>
                    <td>{bond.status}</td>
                  </tr>
              )
          })}
       </tbody>
      </table>

      <table>
        <caption>Maturing Bonds</caption>
        <tbody>
        <tr>
            <th>Isin</th>
            <th>Cusip</th>
            <th>Issuer Name</th>
            <th>Maturity Date</th>
            <th>Coupon</th>
            <th>Type</th>
            <th>Face Value</th>
            <th>Currency</th>
            <th>Status</th>
        </tr>
        {bonds2.map((bond, key) => {
            return (
                <tr key={key}>
                  <td>{bond.isin}</td>
                  <td>{bond.cusip} </td>
                  <td>{bond.issuerName}</td>
                  <td>{bond.maturityDate}</td>
                  <td>{bond.coupon}</td>
                  <td>{bond.type}</td>
                  <td>{bond.faceValue}</td>
                  <td>{bond.currency}</td>
                  <td>{bond.status}</td>
                </tr>
            )
          })}
       </tbody>
      </table>
    </>
  )
};