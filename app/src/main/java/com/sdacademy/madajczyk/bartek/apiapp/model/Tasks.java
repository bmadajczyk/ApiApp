package com.sdacademy.madajczyk.bartek.apiapp.model;

/**
 * Created by RENT on 2017-04-29.
 */

public class Tasks {
    private Boolean completed;
    private Long id;
    private String value;

    public Tasks(Boolean completed, Long id, String value) {

        this.completed = completed;
        this.id = id;
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

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }


}
