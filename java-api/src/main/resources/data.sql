insert into book(id, name) values (1, 'Trading_book_1');
insert into book(id, name) values (2, 'Trading_book_2');
insert into book(id, name) values (3, 'Trading_book_3');
insert into book(id, name) values (4, 'Trading_book_4');
insert into book(id, name) values (5, 'Trading_book_6');

insert into security(id, isin, cusip, issuer_name, maturity_date, coupon, type, face_value, currency, status) 
values (1, 'ISIN_1', 'CUSIP_1', 'Issuer_1', '2023-08-01', 1.0, 'Type_1', 1.0, 'USD', 'Status_1');
insert into security(id, isin, cusip, issuer_name, maturity_date, coupon, type, face_value, currency, status)
values (2, 'ISIN_2', 'CUSIP_2', 'Issuer_2', '2023-08-07', 2.0, 'Type_2', 2.0, 'USD', 'Status_2');
insert into security(id, isin, cusip, issuer_name, maturity_date, coupon, type, face_value, currency, status)
values (3, 'ISIN_3', 'CUSIP_3', 'Issuer_3', '2023-01-03', 3.0, 'Type_3', 3.0, 'USD', 'Status_3');
insert into security(id, isin, cusip, issuer_name, maturity_date, coupon, type, face_value, currency, status)
values (4, 'ISIN_4', 'CUSIP_4', 'Issuer_4', '2023-01-04', 4.0, 'Type_4', 4.0, 'USD', 'Status_4');

insert into counterparty(id, name) values (1, 'Counterparty_1');
insert into counterparty(id, name) values (2, 'Counterparty_2');
insert into counterparty(id, name) values (3, 'Counterparty_3');
insert into counterparty(id, name) values (4, 'Counterparty_4');

insert into trades(id, book_id, security_id, counterparty_id, currency, status, quantity, unit_price, buy_sell, trade_date, settlement_date)
values (1, 1, 1, 1, 'USD', 'Status_1', 1, 1.0, 'Buy', '2023-01-01', '2023-01-01');
insert into trades(id, book_id, security_id, counterparty_id, currency, status, quantity, unit_price, buy_sell, trade_date, settlement_date)
values (2, 2, 2, 2, 'USD', 'Status_2', 2, 2.0, 'Buy', '2023-01-02', '2023-01-02');
insert into trades(id, book_id, security_id, counterparty_id, currency, status, quantity, unit_price, buy_sell, trade_date, settlement_date)
values (3, 3, 3, 3, 'USD', 'Status_3', 3, 3.0, 'Buy', '2023-01-03', '2023-01-03');
insert into trades(id, book_id, security_id, counterparty_id, currency, status, quantity, unit_price, buy_sell, trade_date, settlement_date)
values (4, 4, 4, 4, 'USD', 'Status_4', 4, 4.0, 'Buy', '2023-01-04', '2023-01-04');
