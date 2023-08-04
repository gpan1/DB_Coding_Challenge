package com.db.grad.javaapi.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="counterparty")
public class CounterParty {
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private int id;
    
    private String name;

    @Id
    @Column(name="id", nullable=false)
    public long getId(){
        return id;
    }

    public void setId(int id){
        this.id = id;
    }

    @Column(name="name", nullable=false)
    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }

    @Override
    public String toString() {
        return "CounterParty{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
