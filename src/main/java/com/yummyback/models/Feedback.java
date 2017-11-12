package com.yummyback.models;

public class Feedback {
    private String feedback_id;
    private int service;
    private int quality;
    private int cleanliness;
    private int food_value;
    private int res_time;
    private String comments;
    private String email;
    private String mobile;

    public int getRes_time() {
        return res_time;
    }

    public void setRes_time(int res_time) {
        this.res_time = res_time;
    }

    private String datetime;

    public String getFeedback_id() {
        return feedback_id;
    }

    public void setFeedback_id(String feedback_id) {
        this.feedback_id = feedback_id;
    }

    public int getService() {
        return service;
    }

    public void setService(int service) {
        this.service = service;
    }

    public int getQuality() {
        return quality;
    }

    public void setQuality(int quality) {
        this.quality = quality;
    }

    public int getCleanliness() {
        return cleanliness;
    }

    public void setCleanliness(int cleanliness) {
        this.cleanliness = cleanliness;
    }

    public int getFood_value() {
        return food_value;
    }

    public void setFood_value(int food_value) {
        this.food_value = food_value;
    }

    public String getComments() {
        return comments;
    }

    public void setComments(String comments) {
        this.comments = comments;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public String getDatetime() {
        return datetime;
    }

    public void setDatetime(String datetime) {
        this.datetime = datetime;
    }
}
