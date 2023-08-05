-- INSERT INTO dogs (dog_id, name, age) VALUES (1, 'Einstein', 3);
-- INSERT INTO dogs (dog_id, name, age) VALUES (2, 'Kaya', 5);
-- INSERT INTO dogs (dog_id, name, age) VALUES (3, 'Lassie', 7);

--BOOK table insertions

insert into book(id, name) values (1, 'Trading_book_1');
insert into book(id, name) values (2, 'Trading_book_2');
insert into book(id, name) values (3, 'Trading_book_3');
insert into book(id, name) values (4, 'Trading_book_4');
insert into book(id, name) values (5, 'Trading_book_5');
insert into book(id, name) values (6, 'Trading_book_6');

---security table fake insertions

-- insert into security(id, isin, cusip, issuer_name, maturity_date, coupon, type, face_value, currency, status) 
-- values (1, 'ISIN_1', 'CUSIP_1', 'Issuer_1', '2020-01-01', 1.0, 'Type_1', 1.0, 'USD', 'Status_1');
-- insert into security(id, isin, cusip, issuer_name, maturity_date, coupon, type, face_value, currency, status)
-- values (2, 'ISIN_2', 'CUSIP_2', 'Issuer_2', '2020-01-02', 2.0, 'Type_2', 2.0, 'USD', 'Status_2');
-- insert into security(id, isin, cusip, issuer_name, maturity_date, coupon, type, face_value, currency, status)
-- values (3, 'ISIN_3', 'CUSIP_3', 'Issuer_3', '2020-01-03', 3.0, 'Type_3', 3.0, 'USD', 'Status_3');
-- insert into security(id, isin, cusip, issuer_name, maturity_date, coupon, type, face_value, currency, status)
-- values (4, 'ISIN_4', 'CUSIP_4', 'Issuer_4', '2020-01-04', 4.0, 'Type_4', 4.0, 'USD', 'Status_4');

--SECURITY table real insertions

insert into security (id, isin, cusip, issuer_name, maturity_date, coupon, type, face_value, currency, status) 
values (1,'XS1988387210', 'BNPParibasIssu', '4.37 Microsoft Corp (USD)','5/8/2021',4.37,'CORP',1000,'USD','open');
insert into security (id, isin, cusip, issuer_name, maturity_date, coupon, type, face_value, currency, status) 
values (2, 'XS1988387210', 'BNPParibasIssu', '4.37 Microsoft Corp (USD)', '5/8/2021', 4.37, 'CORP', 1000, 'GBP', 'open');


--COUNTERPARTY table insertions

insert into COUNTERPARTY (ID ,NAME)
values (1, 'AZ Holdings Inc')
insert into COUNTERPARTY (ID ,NAME)
values (2, 'Acme co')

--USERS table insertions

insert into USERS  (ID ,NAME,EMAIL,ROLE)
values (1, 'AZ Holdings Inc', 'AZ@email.com','role')
insert into USERS  (ID ,NAME,EMAIL,ROLE)
values (2, 'AcmeCo', 'AcmeCo@email.com','role')


-- insert into TRADES (ID , BOOK_ID, SECURITY_ID, COUNTERPARTY_ID, CURRENCY , STATUS, QUANTITY , UNIT_PRICE, BUY_SELL ,TRADE_DATE ,SETTLEMENT_DATE )
-- values (1, 1, 'XS1988387210', 1, 'USD', 'open', 50,90,'buy','13/05/2021','4/8/2021')