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

--USERS table insertions

insert into USERS  (ID ,NAME,EMAIL,ROLE)
values (1, 'Acme Co', 'AcmeCo@email.com', 'role');
insert into USERS  (ID ,NAME,EMAIL,ROLE)
values (2, 'Astra Trading Ltd', 'Astra_Trading_Ltd@email.com','role');
insert into USERS  (ID ,NAME,EMAIL,ROLE)
values (3, 'AZ Holdings Inc', 'Az_holdings_inc@email.com','role');
insert into USERS  (ID ,NAME,EMAIL,ROLE)
values (4, 'Barclays', 'Barclays@email.com','role');
insert into USERS  (ID ,NAME,EMAIL,ROLE)
values (5, 'British Telecom', 'BritishTelecom@email.com','role');
insert into USERS  (ID ,NAME,EMAIL,ROLE)
values (6, 'Goldman Sachs', 'GoldmanSachs@email.com','role');
insert into USERS  (ID ,NAME,EMAIL,ROLE)
values (7, 'Muncipal Gov Of Orange County', 'Muncipal_Gov_Of_Orange_County@email.com','role');
insert into USERS  (ID ,NAME,EMAIL,ROLE)
values (8, 'Pension Holdings', 'Pension_Holdings@email.com','role');
insert into USERS  (ID ,NAME,EMAIL,ROLE)
values (9, 'Sovereign Investments', 'Sovereign_Investments@email.com','role');
insert into USERS  (ID ,NAME,EMAIL,ROLE)
values (10, 'UBS', 'UBS@email.com','role');
insert into USERS  (ID ,NAME,EMAIL,ROLE)
values (11, 'Zurich Pension fund 4', 'Zurich_Pension_fund_4@email.com','role');


--COUNTERPARTY table insertions

insert into COUNTERPARTY (ID ,NAME)
values (1, 'Acme co');
insert into COUNTERPARTY (ID ,NAME)
values (2, 'Astra Trading Ltd');
insert into COUNTERPARTY (ID ,NAME)
values (3, 'AZ Holdings Inc');
insert into COUNTERPARTY (ID ,NAME)
values (4, 'Barclays');
insert into COUNTERPARTY (ID ,NAME)
values (5, 'British Telecom');
insert into COUNTERPARTY (ID ,NAME)
values (6, 'Goldman Sachs');
insert into COUNTERPARTY (ID ,NAME)
values (7, 'Muncipal Gov Of Orange County');
insert into COUNTERPARTY (ID ,NAME)
values (8, 'Pension Holdings');
insert into COUNTERPARTY (ID ,NAME)
values (9, 'Sovereign Investments');
insert into COUNTERPARTY (ID ,NAME)
values (10, 'UBS');
insert into COUNTERPARTY (ID ,NAME)
values (11, 'Zurich Pension fund 4');



--SECURITY table real insertions

insert into security (id, isin, cusip, issuer_name, maturity_date, coupon, type, face_value, currency, status) 
values (1,'XS1988387210', 'NA', 'BNPParibasIssu 4.37 Microsoft Corp (USD)','05-08-2021',4.37,'CORP',1000,'USD','active');
insert into security (id, isin, cusip, issuer_name, maturity_date, coupon, type, face_value, currency, status) 
values (2, 'USN0280EAR64', '123456780', 'Airbus 3.15%  USD', '30-07-2021', 3.15, 'CORP', 900, 'USD', 'active');
insert into security (id, isin, cusip, issuer_name, maturity_date, coupon, type, face_value, currency, status) 
values (3, 'A12356111', '123456bh0', 'UBS Facebook (USD)', '30-09-2021', 2, 'CORP', 900, 'USD', 'active');
insert into security (id, isin, cusip, issuer_name, maturity_date, coupon, type, face_value, currency, status) 
values (4, 'USU02320AG12', 'AMZN 3.15 08/22/27 REGS', 'Amazon', '03-08-2021', 3.15, 'CORP', 900, 'USD', 'active');
insert into security (id, isin, cusip, issuer_name, maturity_date, coupon, type, face_value, currency, status) 
values (5, 'GB00B6460505', 'BDCHBW8', 'HM Treasury United Kingdon', '09-08-2021', 0.75, 'GOVN', 900, 'GBP', 'active');
insert into security (id, isin, cusip, issuer_name, maturity_date, coupon, type, face_value, currency, status) 
values (6, 'GB00B6460506', 'BDCHBW8', 'HM Treasury United Kingdon', '09-08-2021', 0.75, 'GOVN', 900, 'GBP', 'active');
insert into security (id, isin, cusip, issuer_name, maturity_date, coupon, type, face_value, currency, status) 
values (7, 'GB00B6460507', 'BDCHBW8', 'HM Treasury United Kingdon', '09-08-2021', 0.75, 'GOVN', 900, 'GBP', 'active');
insert into security (id, isin, cusip, issuer_name, maturity_date, coupon, type, face_value, currency, status) 
values (8, 'GB00B6460508', 'BDCHBW8', 'HM Treasury United Kingdon', '09-08-2021', 0.75, 'GOVN', 900, 'GBP', 'active');
insert into security (id, isin, cusip, issuer_name, maturity_date, coupon, type, face_value, currency, status) 
values (9, 'GB00B6460509', 'BDCHBW8', 'HM Treasury United Kingdon', '09-08-2021', 0.75, 'GOVN', 900, 'GBP', 'active');
insert into security (id, isin, cusip, issuer_name, maturity_date, coupon, type, face_value, currency, status) 
values (10, 'GB00B6460510', 'BDCHBW8', 'HM Treasury United Kingdon', '09-08-2021', 0.75, 'GOVN', 900, 'GBP', 'active');
insert into security (id, isin, cusip, issuer_name, maturity_date, coupon, type, face_value, currency, status) 
values (11, 'GB00B6460511', 'BDCHBW8', 'HM Treasury United Kingdon', '09-08-2021', 0.75, 'GOVN', 900, 'GBP', 'active');
insert into security (id, isin, cusip, issuer_name, maturity_date, coupon, type, face_value, currency, status) 
values (12, 'GB00B6460512', 'BDCHBW8', 'HM Treasury United Kingdon', '09-08-2021', 0.75, 'GOVN', 900, 'GBP', 'active');
insert into security (id, isin, cusip, issuer_name, maturity_date, coupon, type, face_value, currency, status) 
values (13, 'GB00B6460513', 'BDCHBW8', 'HM Treasury United Kingdon', '09-08-2021', 0.75, 'GOVN', 900, 'GBP', 'active');
insert into security (id, isin, cusip, issuer_name, maturity_date, coupon, type, face_value, currency, status) 
values (14, 'GB00B6460514', 'BDCHBW8', 'HM Treasury United Kingdon', '09-08-2021', 0.75, 'GOVN', 900, 'GBP', 'active');
insert into security (id, isin, cusip, issuer_name, maturity_date, coupon, type, face_value, currency, status) 
values (15, 'GB00B6460515', 'BDCHBW8', 'HM Treasury United Kingdon', '09-08-2021', 0.75, 'GOVN', 900, 'GBP', 'active');
insert into security (id, isin, cusip, issuer_name, maturity_date, coupon, type, face_value, currency, status) 
values (16, 'US87973RAA86', '87973RAA8', 'TEMASEK FINL I LTD GLOBAL MEDIUM TERM NTS BOOK ENTRY REG S', '06-08-2021', 2.02, 'SOVN', 690, 'USD', 'active');
insert into security (id, isin, cusip, issuer_name, maturity_date, coupon, type, face_value, currency, status) 
values (17, 'IE00B29LNP31', '87973RAA8', 'First Norway Alpha Kl.IV', '22-12-2030', 1.123, 'SOVN', 340, 'USD', 'active');



--insert into trades table

INSERT INTO trades (id, book_id, security_id, counterparty_id, currency, status, quantity, unit_price, buy_sell, trade_date, settlement_date) VALUES
  (1, 1, 1, 3, 'USD', 'open', 50, 90, 'buy', '13-05-2021', '04-08-2021'),
  (2, 1, 1, 3, 'GBP', 'open', 40, 89.56, 'sell', '04-02-2021', '04-08-2021'),
  (3, 2, 2, 1, 'USD', 'open', 1000, 105.775, 'buy', '13-05-2021', '23-08-2021'),
  (4, 2, 2, 1, 'GBP', 'open', 900, 105.775, 'sell', '04-02-2021', '10-09-2021'),
  (5, 3, 3, 9, 'USD', 'open', 50, 90, 'buy', '13-05-2021', '23-08-2021'),
  (6, 2, 2, 2, 'USD', 'open', 1000, 105.775, 'buy', '13-05-2021', '23-08-2021');


  
  -- (7, 2, 3, 9, 'USD', 'open', 50, 90, 'sell', '13-05-2021', '23-08-2021'),
  -- (8, 4, 4, 7, 'USD', 'open', 60, 98.56, 'buy', '04-02-2021', '27-09-2021'),
  -- (9, 4, 4, 7, 'USD', 'open', 50, 98.56, 'buy', '23-08-2021', '23-08-2021'),
  -- (10, 6, 5, 6, 'GBP', 'open', 1100, 110.35,'buy', '27-09-2021', '27-09-2021'),
  -- (11, 6, 6, 6, 'GBP', 'open', 900, 110.35,'sell', '28-09-2021', '28-09-2021'),
  -- (12, 6, 7, 10, 'GBP', 'open', 2000, 110.35,'buy', '29-09-2021', '29-09-2021'),
  -- (13, 6, 8, 10, 'GBP', 'open', 2000, 110.35,'sell', '30-09-2021', '30-09-2021'),
  -- (14, 6, 9, 4, 'GBP', 'open', 1000, 110.35,'buy', '01-10-2021', '01-10-2021'),
  -- (15, 6, 10, 4, 'GBP', 'open', 900, 110.35,'buy', '02-10-2021', '02-10-2019'),
  -- (16, 6, 11, 4, 'GBP', 'open', 1900, 110.35,'sell', '03-10-2019', '03-10-2019'),
  -- (17, 6, 12, 5, 'GBP', 'open', 600, 110.35,'buy', '04-10-2018', '04-10-2018'),
  -- (18, 6, 13, 8, 'GBP', 'open', 600, 110.35,'buy', '05-10-2019', '05-10-2019'),
  -- (19, 6, 14, 8, 'GBP', 'open', 700, 110.35,'buy', '06-06-2021', '06-06-2021'),
  -- (20, 6, 15, 8, 'GBP', 'open', 1300, 110.35,'sell', '07-10-2021', '07-10-2021'),
  -- (21, 4, 16, 11, 'USD', 'open', 60, 100.13,'buy', '04-02-2012', '27-09-2021'),
  -- (22, 4, 16, 11, 'USD', 'open', 50, 100.13,'buy', '23-08-2012', '23-08-2021'),
  -- (23, 4, 16, 11, 'USD', 'open', 75, 100.13,'buy', '04-02-2013', '27-09-2021'),
  -- (24, 4, 16, 11, 'USD', 'open', 50, 100.13,'buy', '23-08-2014', '23-08-2021'),
  -- (25, 4, 16, 11, 'USD', 'open', 300, 98.76,'buy', '04-02-2016', '27-09-2021'),
  -- (26, 4, 17, 11, 'USD', 'open', 300, 98.76,'buy', '04-02-2013', '27-09-2021'),
  -- (27, 4, 17, 11, 'USD', 'open', 300, 98.76,'buy', '23-08-2012', '23-08-2021'),
  -- (28, 4, 17, 11, 'USD', 'open', 300, 98.76,'sell', '23-08-2015', '23-08-2021');



--insert into book_user table

INSERT INTO book_user (book_id, users_id) 
VALUES (1, 1),(2, 2);







---security table fake insertions

-- insert into security(id, isin, cusip, issuer_name, maturity_date, coupon, type, face_value, currency, status) 
-- values (1, 'ISIN_1', 'CUSIP_1', 'Issuer_1', '2020-01-01', 1.0, 'Type_1', 1.0, 'USD', 'Status_1');
-- insert into security(id, isin, cusip, issuer_name, maturity_date, coupon, type, face_value, currency, status)
-- values (2, 'ISIN_2', 'CUSIP_2', 'Issuer_2', '2020-01-02', 2.0, 'Type_2', 2.0, 'USD', 'Status_2');
-- insert into security(id, isin, cusip, issuer_name, maturity_date, coupon, type, face_value, currency, status)
-- values (3, 'ISIN_3', 'CUSIP_3', 'Issuer_3', '2020-01-03', 3.0, 'Type_3', 3.0, 'USD', 'Status_3');
-- insert into security(id, isin, cusip, issuer_name, maturity_date, coupon, type, face_value, currency, status)
-- values (4, 'ISIN_4', 'CUSIP_4', 'Issuer_4', '2020-01-04', 4.0, 'Type_4', 4.0, 'USD', 'Status_4');






