import React, { useState, useEffect } from "react";
import { findBonds } from "../../services/BondServices";
import "./Bonds.module.css";

export const Bonds = () => {
    const [bonds, setBonds] = useState([]);

    useEffect(() => {
      findBonds()
            .then(({data}) => {
            setBonds(data);
            });
    }, []);
  return (
    <>
      <table>
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
    </>
  )
};
