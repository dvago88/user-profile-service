package com.globant.userprofileservice.model;

import java.time.LocalDate;

public class Lesson {

  private int lessonId;
  private int userId;
  private String description;
  private LocalDate date;
  private String place;

  public Lesson() {
  }

  public Lesson(int lessonId, int userId, String description, LocalDate date, String place) {
    this.lessonId = lessonId;
    this.userId = userId;
    this.description = description;
    this.date = date;
    this.place = place;
  }

  public int getLessonId() {
    return lessonId;
  }

  public void setLessonId(int lessonId) {
    this.lessonId = lessonId;
  }

  public int getUserId() {
    return userId;
  }

  public void setUserId(int userId) {
    this.userId = userId;
  }

  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public LocalDate getDate() {
    return date;
  }

  public void setDate(LocalDate date) {
    this.date = date;
  }

  public String getPlace() {
    return place;
  }

  public void setPlace(String place) {
    this.place = place;
  }
}
