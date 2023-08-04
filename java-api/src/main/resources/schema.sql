drop table if exists trades;
drop table if exists security;
drop table if exists book_user;
drop table if exists counterparty;
drop table if exists book;
drop table if exists users;

CREATE TABLE book (
  id int NOT NULL AUTO_INCREMENT,
  name varchar(255) NOT NULL,
  PRIMARY KEY (id)
);

CREATE TABLE users (
  id int NOT NULL AUTO_INCREMENT,
  name varchar(255) NOT NULL,
  email varchar(255) NOT NULL,
  role varchar(255) NOT NULL,
  PRIMARY KEY (id)
);

CREATE TABLE counterparty (
  id int NOT NULL AUTO_INCREMENT,
  name varchar(255) NOT NULL,
  PRIMARY KEY (id)
);

CREATE TABLE book_user (
  book_id int NOT NULL,
  users_id int NOT NULL,
  FOREIGN KEY (users_id) REFERENCES users (id),
  FOREIGN KEY (book_id) REFERENCES book (id)
);

CREATE TABLE security (
  id int NOT NULL AUTO_INCREMENT,
  isin varchar(50) DEFAULT NULL,
  cusip varchar(50) DEFAULT NULL,
  issuer_name varchar(255) NOT NULL,
  maturity_date varchar(255) NOT NULL,
  coupon float NOT NULL,
  type varchar(255) NOT NULL,
  face_value float NOT NULL,
  currency varchar(10) NOT NULL,
  status varchar(32) DEFAULT NULL,
  PRIMARY KEY (id)
);

CREATE TABLE trades (
  id int NOT NULL AUTO_INCREMENT,
  book_id int NOT NULL,
  security_id int NOT NULL,
  counterparty_id int NOT NULL,
  currency varchar(10) NOT NULL,
  status varchar(32) NOT NULL,
  quantity int NOT NULL,
  unit_price float NOT NULL,
  buy_sell varchar(32) NOT NULL,
  trade_date varchar(255) NOT NULL,
  settlement_date varchar(255) NOT NULL,
  PRIMARY KEY (id),
  FOREIGN KEY (id) REFERENCES Security (id),
  FOREIGN KEY (id) REFERENCES counterparty (id),
  FOREIGN KEY (id) REFERENCES book (id)
);

ALTER TABLE book_user ADD PRIMARY KEY(book_id, users_id);
