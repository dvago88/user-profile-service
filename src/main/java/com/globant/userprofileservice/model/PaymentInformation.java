package com.globant.userprofileservice.model;

import java.util.Date;

public class PaymentInformation {

  private int paymentId;
  private double amountPaid;
  private Date paymentDate;
  private int numberOfLessons;
  private int userId;

  public PaymentInformation() {
    super();
  }

  public PaymentInformation(double amountPaid, Date paymentDate, int numberOfLessons, int userId) {
    this.amountPaid = amountPaid;
    this.paymentDate = paymentDate;
    this.numberOfLessons = numberOfLessons;
    this.userId = userId;
  }

  public int getPaymentId() {
    return paymentId;
  }

  public void setPaymentId(int paymentId) {
    this.paymentId = paymentId;
  }

  public double getAmountPaid() {
    return amountPaid;
  }

  public void setAmountPaid(double amountPaid) {
    this.amountPaid = amountPaid;
  }

  public Date getPaymentDate() {
    return paymentDate;
  }

  public void setPaymentDate(Date paymentDate) {
    this.paymentDate = paymentDate;
  }

  public int getNumberOfLessons() {
    return numberOfLessons;
  }

  public void setNumberOfLessons(int numberOfLessons) {
    this.numberOfLessons = numberOfLessons;
  }

  public int getUserId() {
    return userId;
  }

  public void setUserId(int userId) {
    this.userId = userId;
  }
}
