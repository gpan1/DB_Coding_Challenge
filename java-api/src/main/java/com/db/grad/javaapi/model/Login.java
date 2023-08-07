package com.db.grad.javaapi.model;

 import javax.persistence.*;

@Entity
@Table(name="login")
public class Login {
    @Id
    @Column(name="email", nullable=false)
    private String email;

    @Column(name="password", nullable=false)
    private String password;

    public String getEmail(){
        return email;
    }

    public Login(){

    }

    public Login(String email, String password){
        this.email = email;
        this.password = password;
    }

    public void setEmail(String email){
        this.email = email;
    }

    public String getPassword(){
        return password;
    }

    public void setPassword(String password){
        this.password = password;
    }

    @Override
    public String toString() {
        return "Login{" +
                "email='" + email + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}
