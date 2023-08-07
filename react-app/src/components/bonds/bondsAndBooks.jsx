import React, { useState, useEffect } from "react";
import { bondsAndBooks } from "../../services/BondServices";
import "./Bonds.module.css";
import Form from 'react-bootstrap/Form';
import Button from 'react-bootstrap/esm/Button';
import Row from 'react-bootstrap/Row';

export const BondsAndBooks = () => {
    const [bonds, setBonds] = useState([]);
    const [id, setId] = useState(0);
    const [id2, setId2] = useState(null);
    const handleId = (event)=>{
        setId(event.target.value)
    }

    const handleSubmit =(event)=>{
        event.preventDefault();
        setId2(id);
    }

    useEffect(() => {
        if(id2 != null){
            bondsAndBooks(id2)
            .then(({data}) => {
            setBonds(data);
            });}
    }, [id2]);
  return (
    <>
    <Row className='bondForm'>
        <Form>
            <Form.Group className="mb-3" controlId="userid">
                <Form.Label>User Id: </Form.Label>
                <Form.Control type="text" placeholder="User Id" value={id}
                onChange={handleId} />
            </Form.Group>
            <Button variant="primary" type="submit" onClick={handleSubmit}>
                Submit
            </Button>
        </Form>
    </Row>
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
