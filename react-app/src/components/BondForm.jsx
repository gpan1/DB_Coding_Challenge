import React from 'react'
import Form from 'react-bootstrap/Form'
import Row from 'react-bootstrap/Row';
import Button from 'react-bootstrap/esm/Button';
import { useState } from 'react';
import { DatePicker } from '@mui/x-date-pickers';
import { LocalizationProvider } from '@mui/x-date-pickers';
import { AdapterDateFns } from '@mui/x-date-pickers/AdapterDateFns';

export const BondForm = () => {
    const [tradeType, setTradeType] = useState('');
    const [tradeCurrency, setCurrency] = useState('');
    const [quantity, setQuantity] = useState('');

    const [tradeSettlementDate, setTradeSettlementDate] = useState(null);

    const handleTradeType = (event)=>{
        setTradeType(event.target.value)
    }

    const handleCurrencyChange = (event)=> {
        setCurrency(event.target.value);
    }

    const handleQuantity = (event)=> {
        setQuantity(event.target.value);
    }

    const handleSubmit =(event)=>{
        event.preventDefault();
        let bond = {};
        bond.tradeType = tradeType;
        bond.currency = tradeCurrency;
        bond.quantity = quantity;
        bond.tradeSettlementDate = tradeSettlementDate.toLocaleDateString('en-GB');

        console.log(bond);      
    }


    return (
        <Row className='bondForm'>
            <Form >
                <Form.Label>Trade Type: </Form.Label>
                <Form.Select aria-label="Trade Type" value={tradeType}
                    onChange={handleTradeType}>
                        <option>Choose One</option>
                        <option value="Buy">Buy</option>
                        <option value="Sell">Sell</option>
                </Form.Select>
                <br />
                <Form.Group className="mb-3" controlId="currency">
                    <Form.Label>Currency: </Form.Label>
                    <Form.Control type="text" placeholder="Currency" value={tradeCurrency}
                    onChange={handleCurrencyChange} />
                </Form.Group>
                <Form.Group className="mb-3" controlId="quantity">
                    <Form.Label>Quantity: </Form.Label>
                    <Form.Control type="text" placeholder="Quantity" value={quantity}
                    onChange={handleQuantity} />
                </Form.Group>
                {/* <Form.Group className="mb-3" controlId="tradeSettlementDate">
                    <DatePicker selected={tradeSettlementDate} onChange={(date) => setTradeSettlementDate(date)} />
                </Form.Group> */}
                <Form.Group className="mb-3" controlId="tradeSettlementDate">
                    <Form.Label>Trade Settlement Date: </Form.Label>
                    <br></br>
                    <LocalizationProvider dateAdapter={AdapterDateFns}>
                        <DatePicker  label="Trade Settlement Date" value={tradeSettlementDate} onChange={(newValue) => {setTradeSettlementDate(newValue);}}/>
                    </LocalizationProvider>
                </Form.Group>
                <Button variant="primary" type="submit" onClick={handleSubmit}>
                    Submit
                </Button>
            </Form>
        </Row>
    )
}

export default BondForm;
