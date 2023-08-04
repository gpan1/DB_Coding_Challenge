// package com.db.grad.javaapi.model;

// import javax.persistence.Column;
// import javax.persistence.Entity;
// import javax.persistence.Id;
// import javax.persistence.OneToOne;
// import javax.persistence.Table;

// @Entity
// @Table(name="trades")
// public class Trades {
//   @Id
//   private long id;

//   @OneToOne
//   private Books book;

//   @OneToOne
//   private Security security;

//   @OneToOne
//   private CounterParty counterParty;

//   private String currency;
//   private String status;
//   private int quantity;
//   private float unitPrice;
//   private String buySell;
//   private String tradeDate;
//   private String settlementDate;

//   @Id
//   @Column(name="id", nullable=false)
//   public long getId(){
//     return id;
//   }

//   public void setId(long id){
//     this.id = id;
//   }

//   public Books getBook() {
//     return book;
//   }

//   public void setBook(Books book) {
//     this.book = book;
//   }

//   public Security getSecurity() {
//     return security;
//   }

//   public void setSecurity(Security security) {
//     this.security = security;
//   }

//   public CounterParty getCounterParty() {
//     return counterParty;
//   }

//   public void setCounterParty(CounterParty counterParty) {
//     this.counterParty = counterParty;
//   }

//   public String getCurrency() {
//     return currency;
//   }

//   public void setCurrency(String currency) {
//     this.currency = currency;
//   }

//   public String getStatus() {
//     return status;
//   }

//   public void setStatus(String status) {
//     this.status = status;
//   }

//   public int getQuantity() {
//     return quantity;
//   }

//   public void setQuantity(int quantity) {
//     this.quantity = quantity;
//   }

//   public float getUnitPrice() {
//     return unitPrice;
//   }

//   public void setUnitPrice(float unitPrice) {
//     this.unitPrice = unitPrice;
//   }

//   public String getBuySell() {
//     return buySell;
//   }

//   public void setBuySell(String buySell) {
//     this.buySell = buySell;
//   }

//   public String getTradeDate() {
//     return tradeDate;
//   }

//   public void setTradeDate(String tradeDate) {
//     this.tradeDate = tradeDate;
//   }

//   public String getSettlementDate() {
//     return settlementDate;
//   }

//   public void setSettlementDate(String settlementDate) {
//     this.settlementDate = settlementDate;
//   }

//     @Override
//     public String toString() {
//         return "Trade{" +
//                 "id=" + id +
//                 ", book=" + book +
//                 ", security=" + security +
//                 ", counterParty=" + counterParty +
//                 ", currency='" + currency + '\'' +
//                 ", status='" + status + '\'' +
//                 ", quantity=" + quantity +
//                 ", unitPrice=" + unitPrice +
//                 ", buySell='" + buySell + '\'' +
//                 ", tradeDate='" + tradeDate + '\'' +
//                 ", settlementDate='" + settlementDate + '\'' +
//                 "}";
//     }
// }