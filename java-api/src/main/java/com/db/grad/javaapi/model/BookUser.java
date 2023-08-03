// package com.db.grad.javaapi.model;

// import javax.persistence.Column;
// import javax.persistence.Entity;
// import javax.persistence.Id;
// import javax.persistence.Table;

// // CREATE TABLE book_user (
// // --   book_id int NOT NULL,
// // --   user_id int NOT NULL,
// // --   KEY FK1_book_id (book_id),
// // --   KEY FK_user_id (user_id)
// // -- );
// // -- ALTER TABLE book_user ADD PRIMARY KEY(book_id, user_id);

// @Entity
// @Table(name="book_user")
// public class BookUser {
//     @Id
//     private long book_id;
//     @Id
//     private long user_id;

//     @Column(name="book_id", nullable=false)
//     public long getBook_id() {
//         return book_id;
//     }

//     public void setBook_id(long book_id) {
//         this.book_id = book_id;
//     }

//     @Column(name="user_id", nullable=false)
//     public long getUser_id() {
//         return user_id;
//     }

//     public void setUser_id(long user_id) {
//         this.user_id = user_id;
//     }

//     @Override
//     public String toString() {
//         return "BookUser{" +
//                 "book_id=" + book_id +
//                 ", user_id=" + user_id +
//                 '}';
//     }
// }
