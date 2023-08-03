package com.db.grad.javaapi.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
// import javax.persistence.JoinColumn;
// import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="book")
public class Book {
  @Id
  @Column(name="book_name")
  private String book_name;

  //foreign key for trade_id in trade table
//   @OneToOne(mappedBy = "book")
//   @JoinColumn(name = "trade_id", referencedColumnName = "trade_id")
//   private Trade trade;


}
