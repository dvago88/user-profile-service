package com.globant.userprofileservice.model;

import java.util.Date;

public class UserProfile {

    private int userId;
    private String name;
    private String phone;
    private int lessonsReceived;
    private int lessonsRemained;
    private Date lastClass;

    public UserProfile() {
        super();
    }

    public UserProfile(User user, UserNumberOfLessons userNumberOfLessons, int lessonsReceived) {
        this.userId = user.getUserId();
        this.name = user.getName();
        this.phone = user.getPhone();
        this.lessonsRemained = userNumberOfLessons.getNumberOfRemainingLessons();
        this.lessonsReceived = lessonsReceived;
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
}
