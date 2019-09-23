package com.globant.userprofileservice.model;

import java.util.List;

public class Record {

  private List<Lesson> lessons;

  public Record() {
  }

  public Record(List<Lesson> lessons) {
    this.lessons = lessons;
  }

  public List<Lesson> getLessons() {
    return lessons;
  }

  public void setLessons(List<Lesson> lessons) {
    this.lessons = lessons;
  }
}
