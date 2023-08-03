drop table if exists book;
CREATE TABLE book (
  id int NOT NULL AUTO_INCREMENT,
  name varchar(255) NOT NULL,
  PRIMARY KEY (id)
);

drop table if exists users;
CREATE TABLE users (
  id int NOT NULL AUTO_INCREMENT,
  name varchar(255) NOT NULL,
  email varchar(255) NOT NULL,
  role varchar(255) NOT NULL,
  PRIMARY KEY (id)
);

drop table if exists counterparty;
CREATE TABLE counterparty (
  id int NOT NULL AUTO_INCREMENT,
  name varchar(255) NOT NULL,
  PRIMARY KEY (id)
);

drop table if exists book_user;
CREATE TABLE book_user (
  book_id int NOT NULL,
  users_id int NOT NULL,
  FOREIGN KEY (users_ID) REFERENCES Users (ID),
  FOREIGN KEY (book_ID) REFERENCES Book (ID)
);

drop table if exists security;
CREATE TABLE security (
  id int NOT NULL AUTO_INCREMENT,
  isin varchar(50) DEFAULT NULL,
  cusip varchar(50) DEFAULT NULL,
  issuer_name varchar(255) NOT NULL,
  maturity_date datetime NOT NULL,
  coupon float NOT NULL,
  type varchar(255) NOT NULL,
  face_value float NOT NULL,
  currency varchar(10) NOT NULL,
  status varchar(32) DEFAULT NULL,
  PRIMARY KEY (id)
);

drop table if exists trades;
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
  trade_date datetime NOT NULL,
  settlement_date datetime NOT NULL,
  PRIMARY KEY (id),
  FOREIGN KEY (ID) REFERENCES Security (ID),
  FOREIGN KEY (ID) REFERENCES Counterparty (ID),
  FOREIGN KEY (ID) REFERENCES Book (ID)
);

ALTER TABLE book_user ADD PRIMARY KEY(book_id, users_id);
