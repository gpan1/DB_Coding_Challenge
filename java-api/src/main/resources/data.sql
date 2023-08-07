--BOOK table insertions

insert into book(id, name) values (1, 'Trading_book_1');
insert into book(id, name) values (2, 'Trading_book_2');
insert into book(id, name) values (3, 'Trading_book_3');
insert into book(id, name) values (4, 'Trading_book_4');
insert into book(id, name) values (5, 'Trading_book_6');


--USERS table insertions

insert into USERS  (ID ,NAME,EMAIL,ROLE) values (1, 'Acme Co', 'AcmeCo@email.com', 'role');
insert into USERS  (ID ,NAME,EMAIL,ROLE) values (2, 'Astra Trading Ltd', 'Astra_Trading_Ltd@email.com','role');
insert into USERS  (ID ,NAME,EMAIL,ROLE) values (3, 'AZ Holdings Inc', 'Az_holdings_inc@email.com','role');
insert into USERS  (ID ,NAME,EMAIL,ROLE) values (4, 'Barclays', 'Barclays@email.com','role');
insert into USERS  (ID ,NAME,EMAIL,ROLE) values (5, 'British Telecom', 'BritishTelecom@email.com','role');
insert into USERS  (ID ,NAME,EMAIL,ROLE) values (6, 'Goldman Sachs', 'GoldmanSachs@email.com','role');
insert into USERS  (ID ,NAME,EMAIL,ROLE) values (7, 'Muncipal Gov Of Orange County', 'Muncipal_Gov_Of_Orange_County@email.com','role');
insert into USERS  (ID ,NAME,EMAIL,ROLE) values (8, 'Pension Holdings', 'Pension_Holdings@email.com','role');
insert into USERS  (ID ,NAME,EMAIL,ROLE) values (9, 'Sovereign Investments', 'Sovereign_Investments@email.com','role');
insert into USERS  (ID ,NAME,EMAIL,ROLE) values (10, 'UBS', 'UBS@email.com','role');
insert into USERS  (ID ,NAME,EMAIL,ROLE) values (11, 'Zurich Pension fund 4', 'Zurich_Pension_fund_4@email.com','role');


---LOGIN table insertions
insert into login (email, password) values ('AcmeCo@email.com', '$2a$10$DkNF/jUEdV5skZe3r1CSRe5XNOucWMu7jT6lcyOzgbdQ8Q5HJknNO');


--COUNTERPARTY table insertions

insert into COUNTERPARTY (ID ,NAME) values (1, 'Acme co');
insert into COUNTERPARTY (ID ,NAME) values (2, 'Astra Trading Ltd');
insert into COUNTERPARTY (ID ,NAME) values (3, 'AZ Holdings Inc');
insert into COUNTERPARTY (ID ,NAME) values (4, 'Barclays');
insert into COUNTERPARTY (ID ,NAME) values (5, 'British Telecom');
insert into COUNTERPARTY (ID ,NAME) values (6, 'Goldman Sachs');
insert into COUNTERPARTY (ID ,NAME) values (7, 'Muncipal Gov Of Orange County');
insert into COUNTERPARTY (ID ,NAME) values (8, 'Pension Holdings');
insert into COUNTERPARTY (ID ,NAME) values (9, 'Sovereign Investments');
insert into COUNTERPARTY (ID ,NAME) values (10, 'UBS');
insert into COUNTERPARTY (ID ,NAME) values (11, 'Zurich Pension fund 4');


--SECURITY table insertions

insert into security (id, isin, cusip, issuer_name, maturity_date, coupon, type, face_value, currency, status) 
values (1,'XS1988387210', 'BNPParibasIssu', '4.37 Microsoft Corp (USD)','2021-08-05',4.37,'CORP',1000,'USD','open');
insert into security (id, isin, cusip, issuer_name, maturity_date, coupon, type, face_value, currency, status) 
values (2, 'XS1988387210', 'BNPParibasIssu', '4.37 Microsoft Corp (USD)', '2021-08-05', 4.37, 'CORP', 1000, 'GBP', 'open'); 

--insert into trades table

INSERT INTO trades (book_id, security_id, counterparty_id, currency, status, quantity, unit_price, buy_sell, trade_date, settlement_date) VALUES 
(1, '1', 1, 'USD', 'open', 50, 90, 'buy', '2021-05-13', '2021-08-04'),
(2, '2', 2, 'GBP', 'open', 40, 89.56, 'sell', '2021-02-04', '2021-08-04');

--insert into book_user table

INSERT INTO book_user (book_id, users_id) VALUES (1, 1);
INSERT INTO book_user (book_id, users_id) VALUES (2, 2);


-- insert into security (id, isin, cusip, issuer_name, maturity_date, coupon, type, face_value, currency, status) 
-- values (1, 'XS1988387210', 'NA', 'BNPParibasIssu 4.37 Microsoft Corp (USD)','2021-08-05',4.37,'CORP',1000,'USD','active');
-- insert into security (id, isin, cusip, issuer_name, maturity_date, coupon, type, face_value, currency, status) 
-- values (2, 'USN0280EAR64', '123456780', 'Airbus 3.15%  USD', '2021-07-30', 3.15, 'CORP', 900, 'USD', 'active');
-- insert into security (id, isin, cusip, issuer_name, maturity_date, coupon, type, face_value, currency, status) 
-- values (3, 'A12356111', '123456bh0', 'UBS Facebook (USD)', '2021-09-30', 2, 'CORP', 900, 'USD', 'active');
-- insert into security (id, isin, cusip, issuer_name, maturity_date, coupon, type, face_value, currency, status) 
-- values (4, 'USU02320AG12', 'AMZN 3.15 08/22/27 REGS', 'Amazon', '2021-08-03', 3.15, 'CORP', 900, 'USD', 'active');
-- insert into security (id, isin, cusip, issuer_name, maturity_date, coupon, type, face_value, currency, status) 
-- values (5, 'GB00B6460505', 'BDCHBW8', 'HM Treasury United Kingdon', '2021-08-09', 0.75, 'GOVN', 900, 'GBP', 'active');
-- insert into security (id, isin, cusip, issuer_name, maturity_date, coupon, type, face_value, currency, status) 
-- values (6, 'GB00B6460506', 'BDCHBW8', 'HM Treasury United Kingdon', '2021-08-09', 0.75, 'GOVN', 900, 'GBP', 'active');
-- insert into security (id, isin, cusip, issuer_name, maturity_date, coupon, type, face_value, currency, status) 
-- values (7, 'GB00B6460507', 'BDCHBW8', 'HM Treasury United Kingdon', '2021-08-09', 0.75, 'GOVN', 900, 'GBP', 'active');
-- insert into security (id, isin, cusip, issuer_name, maturity_date, coupon, type, face_value, currency, status) 
-- values (8, 'GB00B6460508', 'BDCHBW8', 'HM Treasury United Kingdon', '2021-08-09', 0.75, 'GOVN', 900, 'GBP', 'active');
-- insert into security (id, isin, cusip, issuer_name, maturity_date, coupon, type, face_value, currency, status) 
-- values (9, 'GB00B6460509', 'BDCHBW8', 'HM Treasury United Kingdon', '2021-08-09', 0.75, 'GOVN', 900, 'GBP', 'active');
-- insert into security (id, isin, cusip, issuer_name, maturity_date, coupon, type, face_value, currency, status) 
-- values (10, 'GB00B6460510', 'BDCHBW8', 'HM Treasury United Kingdon', '2021-08-09', 0.75, 'GOVN', 900, 'GBP', 'active');
-- insert into security (id, isin, cusip, issuer_name, maturity_date, coupon, type, face_value, currency, status) 
-- values (11, 'GB00B6460511', 'BDCHBW8', 'HM Treasury United Kingdon', '2021-08-09', 0.75, 'GOVN', 900, 'GBP', 'active');
-- insert into security (id, isin, cusip, issuer_name, maturity_date, coupon, type, face_value, currency, status) 
-- values (12, 'GB00B6460512', 'BDCHBW8', 'HM Treasury United Kingdon', '2021-08-09', 0.75, 'GOVN', 900, 'GBP', 'active');
-- insert into security (id, isin, cusip, issuer_name, maturity_date, coupon, type, face_value, currency, status) 
-- values (13, 'GB00B6460513', 'BDCHBW8', 'HM Treasury United Kingdon', '2021-08-09, 0.75, 'GOVN', 900, 'GBP', 'active');
-- insert into security (id, isin, cusip, issuer_name, maturity_date, coupon, type, face_value, currency, status) 
-- values (14, 'GB00B6460514', 'BDCHBW8', 'HM Treasury United Kingdon', '2021-08-09, 0.75, 'GOVN', 900, 'GBP', 'active');
-- insert into security (id, isin, cusip, issuer_name, maturity_date, coupon, type, face_value, currency, status) 
-- values (15, 'GB00B6460515', 'BDCHBW8', 'HM Treasury United Kingdon', '2021-08-09', 0.75, 'GOVN', 900, 'GBP', 'active');
-- insert into security (id, isin, cusip, issuer_name, maturity_date, coupon, type, face_value, currency, status) 
-- values (16, 'US87973RAA86', '87973RAA8', 'TEMASEK FINL I LTD GLOBAL MEDIUM TERM NTS BOOK ENTRY REG S', '2021-08-06', 2.02, 'SOVN', 690, 'USD', 'active');
-- insert into security (id, isin, cusip, issuer_name, maturity_date, coupon, type, face_value, currency, status) 
-- values (17, 'IE00B29LNP31', '87973RAA8', 'First Norway Alpha Kl.IV', '2030-12-22', 1.123, 'SOVN', 340, 'USD', 'active');


--insert into trades table

-- INSERT INTO trades (book_id, security_id, counterparty_id, currency, status, quantity, unit_price, buy_sell, trade_date, settlement_date) VALUES
--   (1, 'XS1988387210', 1, 'USD', 'open', 50, 90, 'buy', '2021-05-13', '2021-08-04'),
--   (1, 'XS1988387210', 2, 'GBP', 'open', 40, 89.56, 'sell', '2021-02-04', '2021-08-04');
--   (0, 'XS1988387210', 2, 'GBP', 'open', 40, 89.56, 'sell', '2021-02-04', '2021-08-04');
--   (0, 'XS1988387210', 2, 'GBP', 'open', 40, 89.56, 'sell', '2021-02-04', '2021-08-04');
--   (0, 'XS1988387210', 2, 'GBP', 'open', 40, 89.56, 'sell', '2021-02-04', '2021-08-04');
--   (0, 'XS1988387210', 2, 'GBP', 'open', 40, 89.56, 'sell', '2021-02-04', '2021-08-04');
--   (2, 'XS1988387210', 2, 'GBP', 'open', 40, 89.56, 'sell', '2021-02-04', '2021-08-04');
--   (2, 'XS1988387210', 2, 'GBP', 'open', 40, 89.56, 'sell', '2021-02-04', '2021-08-04');
--   (2, 'XS1988387210', 2, 'GBP', 'open', 40, 89.56, 'sell', '2021-02-04', '2021-08-04');
--   (2, 'XS1988387210', 2, 'GBP', 'open', 40, 89.56, 'sell', '2021-02-04', '2021-08-04');
--   (2, 'XS1988387210', 2, 'GBP', 'open', 40, 89.56, 'sell', '2021-02-04', '2021-08-04');
--   (2, 'XS1988387210', 2, 'GBP', 'open', 40, 89.56, 'sell', '2021-02-04', '2021-08-04');
--   (2, 'XS1988387210', 2, 'GBP', 'open', 40, 89.56, 'sell', '2021-02-04', '2021-08-04');
--   (2, 'XS1988387210', 2, 'GBP', 'open', 40, 89.56, 'sell', '2021-02-04', '2021-08-04');
--   (2, 'XS1988387210', 2, 'GBP', 'open', 40, 89.56, 'sell', '2021-02-04', '2021-08-04');
--   (2, 'XS1988387210', 2, 'GBP', 'open', 40, 89.56, 'sell', '2021-02-04', '2021-08-04');
--   (2, 'XS1988387210', 2, 'GBP', 'open', 40, 89.56, 'sell', '2021-02-04', '2021-08-04');
--   (2, 'XS1988387210', 2, 'GBP', 'open', 40, 89.56, 'sell', '2021-02-04', '2021-08-04');
--   (2, 'XS1988387210', 2, 'GBP', 'open', 40, 89.56, 'sell', '2021-02-04', '2021-08-04');
--   (2, 'XS1988387210', 2, 'GBP', 'open', 40, 89.56, 'sell', '2021-02-04', '2021-08-04');
--   (2, 'XS1988387210', 2, 'GBP', 'open', 40, 89.56, 'sell', '2021-02-04', '2021-08-04');
--   (2, 'XS1988387210', 2, 'GBP', 'open', 40, 89.56, 'sell', '2021-02-04', '2021-08-04');
--   (2, 'XS1988387210', 2, 'GBP', 'open', 40, 89.56, 'sell', '2021-02-04', '2021-08-04');
--   (2, 'XS1988387210', 2, 'GBP', 'open', 40, 89.56, 'sell', '2021-02-04', '2021-08-04');
--   (2, 'XS1988387210', 2, 'GBP', 'open', 40, 89.56, 'sell', '2021-02-04', '2021-08-04');
--   (2, 'XS1988387210', 2, 'GBP', 'open', 40, 89.56, 'sell', '2021-02-04', '2021-08-04');
--   (2, 'XS1988387210', 2, 'GBP', 'open', 40, 89.56, 'sell', '2021-02-04', '2021-08-04');




