package com.ols2601.resumebuilder;

public class Resume {
    private int id;     // instance variable
    private String name;
    private Contact contact;
    private String summary;
    private ProfessionalExperience professionalExperience;
    private Education education;

    public Resume() {}  // default or no-argument constructor

    public Resume(int id) { // parameterized constructor
        this.id = id;
        contact = new Contact();
        
    }

    public void setId(int id) {     // setter method
        this.id = id;
    }

    public int getId() {            // getter method
        return id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setContact(Contact contact) {
        this.contact = contact;
    }

    public Contact getContact() {
        return contact;
    }
}