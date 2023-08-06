package com.db.grad.javaapi.model;

import javax.persistence.*;

@Entity
@Table(name="trades")
public class Trade {
  @Id
  @GeneratedValue(strategy=GenerationType.AUTO)
  @Column(name="id", nullable=false)
  private int id;

  @ManyToOne
  @JoinColumn(name="book_id", nullable=false)
  private Book book_id;

  @ManyToOne
  @JoinColumn(name="security_id", nullable=false)
  private Security security_id;

  @ManyToOne
  @JoinColumn(name="counterparty_id", nullable=false)
  private CounterParty counterparty_id;

  @Column(name="currency", nullable=false)
  private String currency;

  @Column(name="status", nullable=false)
  private String status;

  @Column(name="quantity", nullable=false)
  private int quantity;

  @Column(name="unit_price", nullable=false)
  private float unitPrice;

  @Column(name="buy_sell", nullable=false)
  private String buySell;

  @Column(name="trade_date", nullable=false)
  private String tradeDate;

  @Column(name="settlement_date", nullable=false)
  private String settlementDate;

  public int getId() {
    return id;
  }

  public void setId(int id) {
    this.id = id;
  }

  public Book getBook_id() {
    return book_id;
  }

  public void setBook_id(Book book_id) {
    this.book_id = book_id;
  }

  public Security getSecurity_id() {
    return security_id;
  }

  public void setSecurity_id(Security security_id) {
    this.security_id = security_id;
  }

  public CounterParty getCounterparty_id() {
    return counterparty_id;
  }

  public void setCounterparty_id(CounterParty counterparty_id) {
    this.counterparty_id = counterparty_id;
  }

  public String getCurrency() {
    return currency;
  }

  public void setCurrency(String currency) {
    this.currency = currency;
  }

  public String getStatus() {
    return status;
  }

  public void setStatus(String status) {
    this.status = status;
  }

  public int getQuantity() {
    return quantity;
  }

  public void setQuantity(int quantity) {
    this.quantity = quantity;
  }

  public float getUnitPrice() {
    return unitPrice;
  }

  public void setUnitPrice(float unitPrice) {
    this.unitPrice = unitPrice;
  }

  public String getBuySell() {
    return buySell;
  }

  public void setBuySell(String buySell) {
    this.buySell = buySell;
  }

  public String getTradeDate() {
    return tradeDate;
  }

  public void setTradeDate(String tradeDate) {
    this.tradeDate = tradeDate;
  }

  public String getSettlementDate() {
    return settlementDate;
  }

  public void setSettlementDate(String settlementDate) {
    this.settlementDate = settlementDate;
  }
  
  @Override
  public String toString() {
    return "Trade{" +
            "id=" + id +
            ", book_id=" + book_id +
            ", security_id=" + security_id +
            ", counterparty_id=" + counterparty_id +
            ", currency='" + currency + '\'' +
            ", status='" + status + '\'' +
            ", quantity=" + quantity +
            ", unitPrice=" + unitPrice +
            ", buySell='" + buySell + '\'' +
            ", tradeDate='" + tradeDate + '\'' +
            ", settlementDate='" + settlementDate + '\'' +
            '}';
  }
}