// package com.db.grad.javaapi.model;

// import javax.persistence.Column;
// import javax.persistence.Entity;
// import javax.persistence.Id;
// import javax.persistence.Table;

// // drop table if exists book_user;
// // CREATE TABLE book_user (
// //   book_id int NOT NULL,
// //   users_id int NOT NULL,
// //   FOREIGN KEY (users_ID) REFERENCES Users (ID),
// //   FOREIGN KEY (book_ID) REFERENCES Book (ID)
// // );
// // ALTER TABLE book_user ADD PRIMARY KEY(book_id, users_id);

// @Entity
// @Table(name="book_user")
// public class BookUser {
//     @Id
//     private long id;
    
//     @Column(name="book_id", nullable=false)
//     private long bookId;
    
//     @Column(name="users_id", nullable=false)
//     private long usersId;
    
//     public long getId(){
//         return id;
//     }
    
//     public void setId(long id){
//         this.id = id;
//     }
    
//     public long getBookId(){
//         return bookId;
//     }
    
//     public void setBookId(long bookId){
//         this.bookId = bookId;
//     }
    
//     public long getUsersId(){
//         return usersId;
//     }
    
//     public void setUsersId(long usersId){
//         this.usersId = usersId;
//     }
// }
