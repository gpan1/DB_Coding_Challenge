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
                        <DatePicker label="Settling Date" value={date} onChange={(newValue) => {setDate(newValue);}}/>
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
              let str = bond.security_id.maturityDate;
              var result = str.substr(5) + "-" + str.substr(0, 5);
              result = result.substring(0, result.length-1);
              let str2 = bond.tradeDate;
              var result2 = str2.substr(5) + "-" + str2.substr(0, 5);
              result2 = result2.substring(0, result2.length-1);
              let str3 = bond.settlementDate;
              var result3 = str3.substr(5) + "-" + str3.substr(0, 5);
              result3 = result3.substring(0, result3.length-1);
              return (
                  <tr key={key}>
                    <td>{bond.security_id.isin}</td>
                    <td>{bond.security_id.cusip} </td>
                    <td>{bond.security_id.issuerName}</td>
                    <td>{result}</td>
                    <td>{bond.security_id.coupon}</td>
                    <td>{bond.security_id.type}</td>
                    <td>{bond.security_id.faceValue}</td>
                    <td>{bond.security_id.currency}</td>
                    <td>{bond.security_id.status}</td>
                    <td>{bond.status}</td>
                    <td>{bond.quantity}</td>
                    <td>{bond.unitPrice}</td>
                    <td>{bond.buySell}</td>
                    <td>{result2}</td>
                    <td>{result3}</td>
                  </tr>
              )
          })}
       </tbody>
      </table>
    </>
  )
};