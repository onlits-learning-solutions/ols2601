package com.ols2601.resumebuilder;

public class Resume {
    private int id;     // instance variable
    private String name;
    private String summary;

    public Resume(int id) { //parameter (like a local variable)
        this.id = id;
    }

    public void setId(int id) {     // setter method
        this.id = id;
    }

    public int getId() {            // getter method
        return id;
    }
}