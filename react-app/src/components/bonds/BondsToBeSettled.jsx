import React, { useState, useEffect } from "react";
import { settlingBonds } from "../../services/BondServices";
import "./Bonds.module.css";
import { DatePicker } from '@mui/x-date-pickers';
import { LocalizationProvider } from '@mui/x-date-pickers';
import { AdapterDateFns } from '@mui/x-date-pickers/AdapterDateFns';
import Form from 'react-bootstrap/Form';


export const SettlingBonds = () => {
    const [bonds, setBonds] = useState([]);
    const [date, setDate] = useState(null);
    
    useEffect(() => {
      if(date !=null && !isNaN(date.getFullYear()) && date.getFullYear().toString().length === 4){
        let month = ("0" + (date.getMonth() + 1)).slice(-2);
        let day = ("0" + date.getDate()).slice(-2);
        settlingBonds(date.getFullYear() + "-" + month + "-" + day)
            .then(({data}) => {
            setBonds(data);
            });
      }
    }, [date]);
  return (
    <>
      <Form>
      <Form.Group className="mb-3" controlId="SettlingDate">
                    <Form.Label>Choose a Date: </Form.Label>
                    <br></br>
                    <LocalizationProvider dateAdapter={AdapterDateFns}>
                        <DatePicker label="Maturity Date" value={date} onChange={(newValue) => {setDate(newValue);}}/>
                    </LocalizationProvider>
                </Form.Group>
      </Form>
      <table>
        <caption>Settling Bonds</caption>
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
            <th>Security Status</th>
            <th>Status</th>
            <th>Quantity</th>
            <th>Unit Price</th>
            <th>Buy/Sell</th>
            <th>Trade Date</th>
            <th>Settlement Date</th>
        </tr>
            {bonds.map((bond, key) => {
              return (
                  <tr key={key}>
                    <td>{bond.security_id.isin}</td>
                    <td>{bond.security_id.cusip} </td>
                    <td>{bond.security_id.issuerName}</td>
                    <td>{bond.security_id.maturityDate}</td>
                    <td>{bond.security_id.coupon}</td>
                    <td>{bond.security_id.type}</td>
                    <td>{bond.security_id.faceValue}</td>
                    <td>{bond.security_id.currency}</td>
                    <td>{bond.security_id.status}</td>
                    <td>{bond.status}</td>
                    <td>{bond.quantity}</td>
                    <td>{bond.unitPrice}</td>
                    <td>{bond.buySell}</td>
                    <td>{bond.tradeDate}</td>
                    <td>{bond.settlementDate}</td>
                  </tr>
              )
          })}
       </tbody>
      </table>
    </>
  )
};