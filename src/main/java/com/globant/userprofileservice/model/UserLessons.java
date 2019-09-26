package com.globant.userprofileservice.model;

public class UserLessons {

  private int userId;
  private int numberOfRemainingLessons;

  public UserLessons() {
    super();
  }

  public int getUserId() {
    return userId;
  }

  public void setUserId(int userId) {
    this.userId = userId;
  }

  public synchronized int getNumberOfRemainingLessons() {
    return numberOfRemainingLessons;
  }

  public synchronized void setNumberOfRemainingLessons(int numberOfRemainingLessons) {
    this.numberOfRemainingLessons = numberOfRemainingLessons;
  }
}
