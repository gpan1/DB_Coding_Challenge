--BOOK table insertions

insert into book(id, name) values (1, 'Trading_book_1');
insert into book(id, name) values (2, 'Trading_book_2');
insert into book(id, name) values (3, 'Trading_book_3');
insert into book(id, name) values (4, 'Trading_book_4');
insert into book(id, name) values (5, 'Trading_book_6');

--USERS table insertions

insert into USERS  (ID ,NAME,EMAIL,ROLE) values (1, 'AZ Holdings Inc', 'AZ@email.com','role');
insert into USERS  (ID ,NAME,EMAIL,ROLE) values (2, 'AcmeCo', 'AcmeCo@email.com','role');

--COUNTERPARTY table insertions

insert into COUNTERPARTY (ID ,NAME) values (1, 'AZ Holdings Inc');
insert into COUNTERPARTY (ID ,NAME) values (2, 'Acme co');


--SECURITY table real insertions

insert into security (id, isin, cusip, issuer_name, maturity_date, coupon, type, face_value, currency, status) 
values (1,'XS1988387210', 'BNPParibasIssu', '4.37 Microsoft Corp (USD)','2021-08-05',4.37,'CORP',1000,'USD','open');
insert into security (id, isin, cusip, issuer_name, maturity_date, coupon, type, face_value, currency, status) 
values (2, 'XS1988387210', 'BNPParibasIssu', '4.37 Microsoft Corp (USD)', '2021-08-05', 4.37, 'CORP', 1000, 'GBP', 'open'); --repeated?

--insert into trades table

INSERT INTO trades (book_id, security_id, counterparty_id, currency, status, quantity, unit_price, buy_sell, trade_date, settlement_date) VALUES 
(1, '1', 1, 'USD', 'open', 50, 90, 'buy', '2021-05-13', '2021-08-04'),
(2, '2', 2, 'GBP', 'open', 40, 89.56, 'sell', '2021-02-04', '2021-08-04');

--insert into book_user table

INSERT INTO book_user (book_id, users_id) VALUES (1, 1);
INSERT INTO book_user (book_id, users_id) VALUES (2, 2);


-- insert into book(id, name) values (1, 'Trading_book_1');
-- insert into book(id, name) values (2, 'Trading_book_2');
-- insert into book(id, name) values (3, 'Trading_book_3');
-- insert into book(id, name) values (4, 'Trading_book_4');
-- insert into book(id, name) values (5, 'Trading_book_6');

-- insert into security(id, isin, cusip, issuer_name, maturity_date, coupon, type, face_value, currency, status) 
-- values (1, 'ISIN_1', 'CUSIP_1', 'Issuer_1', '2023-08-01', 1.0, 'Type_1', 1.0, 'USD', 'Status_1');
-- insert into security(id, isin, cusip, issuer_name, maturity_date, coupon, type, face_value, currency, status)
-- values (2, 'ISIN_2', 'CUSIP_2', 'Issuer_2', '2023-08-07', 2.0, 'Type_2', 2.0, 'USD', 'Status_2');
-- insert into security(id, isin, cusip, issuer_name, maturity_date, coupon, type, face_value, currency, status)
-- values (3, 'ISIN_3', 'CUSIP_3', 'Issuer_3', '2023-08-03', 3.0, 'Type_3', 3.0, 'USD', 'Status_3');
-- insert into security(id, isin, cusip, issuer_name, maturity_date, coupon, type, face_value, currency, status)
-- values (4, 'ISIN_4', 'CUSIP_4', 'Issuer_4', '2023-08-04', 4.0, 'Type_4', 4.0, 'USD', 'Status_4');

-- insert into counterparty(id, name) values (1, 'Counterparty_1');
-- insert into counterparty(id, name) values (2, 'Counterparty_2');
-- insert into counterparty(id, name) values (3, 'Counterparty_3');
-- insert into counterparty(id, name) values (4, 'Counterparty_4');

-- insert into trades(id, book_id, security_id, counterparty_id, currency, status, quantity, unit_price, buy_sell, trade_date, settlement_date)
-- values (1, 1, 1, 1, 'USD', 'Status_1', 1, 1.0, 'Buy', '2023-08-01', '2023-08-03');
-- insert into trades(id, book_id, security_id, counterparty_id, currency, status, quantity, unit_price, buy_sell, trade_date, settlement_date)
-- values (2, 2, 2, 2, 'USD', 'Status_2', 2, 2.0, 'Buy', '2023-08-02', '2023-08-04');
-- insert into trades(id, book_id, security_id, counterparty_id, currency, status, quantity, unit_price, buy_sell, trade_date, settlement_date)
-- values (3, 3, 3, 3, 'USD', 'Status_3', 3, 3.0, 'Buy', '2023-08-03', '2023-08-05');
-- insert into trades(id, book_id, security_id, counterparty_id, currency, status, quantity, unit_price, buy_sell, trade_date, settlement_date)
-- values (4, 4, 4, 4, 'USD', 'Status_4', 4, 4.0, 'Buy', '2023-08-04', '2023-08-06');