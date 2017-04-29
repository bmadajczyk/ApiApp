package com.sdacademy.madajczyk.bartek.apiapp;

/**
 * Created by RENT on 2017-04-29.
 */

public class Tasks {
    private Boolean completed;
    private Long id;
    private Long user;
    private String value;


    public Tasks(Boolean completed, Long id, Long user, String value) {
        this.completed = completed;
        this.id = id;
        this.user = user;
        this.value = value;
    }

    public Boolean getCompleted() {
        return completed;
    }

    public void setCompleted(Boolean completed) {
        this.completed = completed;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getUser() {
        return user;
    }

    public void setUser(Long user) {
        this.user = user;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }
}
