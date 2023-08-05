package com.db.grad.javaapi.model;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name="book_user")
@IdClass(BookUser.class) // composite key
public class BookUser implements Serializable{
    // primary key is a composite key of book_id and users_id
    @Id
    @ManyToOne // many book_user to one book
    @JoinColumn(name="book_id", nullable=false)
    private Book book_id;

    @Id
    @ManyToOne
    @JoinColumn(name="users_id", nullable=false)
    private User users_id;

    public Book getBook_id() {
        return book_id;
    }

    public void setBook_id(Book book_id) {
        this.book_id = book_id;
    }

    public User getUsers_id() {
        return users_id;
    }

    public void setUsers_id(User users_id) {
        this.users_id = users_id;
    }
    
    @Override
    public String toString() {
        return "BookUser{" +
                "book_id=" + book_id +
                ", users_id=" + users_id +
                '}';
    }
}
