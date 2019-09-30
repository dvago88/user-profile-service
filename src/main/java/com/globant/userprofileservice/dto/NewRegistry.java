package com.globant.userprofileservice.dto;

import java.util.Date;

public class NewRegistry {

  private int userId;
  private String name;
  private String identification;
  private String phone;
  private int lessonsReceived;
  private int lessonsRemained;
  private Date lastClass;
  private double amountPaid;
  private Date paymentDate;
  private int numberOfLessons;

  public NewRegistry() {
  }

  public int getUserId() {
    return userId;
  }

  public void setUserId(int userId) {
    this.userId = userId;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getIdentification() {
    return identification;
  }

  public void setIdentification(String identification) {
    this.identification = identification;
  }

  public String getPhone() {
    return phone;
  }

  public void setPhone(String phone) {
    this.phone = phone;
  }

  public int getLessonsReceived() {
    return lessonsReceived;
  }

  public void setLessonsReceived(int lessonsReceived) {
    this.lessonsReceived = lessonsReceived;
  }

  public int getLessonsRemained() {
    return lessonsRemained;
  }

  public void setLessonsRemained(int lessonsRemained) {
    this.lessonsRemained = lessonsRemained;
  }

  public Date getLastClass() {
    return lastClass;
  }

  public void setLastClass(Date lastClass) {
    this.lastClass = lastClass;
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
}
