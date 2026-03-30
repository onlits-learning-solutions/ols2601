package com.ols2601.resumebuilder;

class Contact {
    private int id;
    private String street;
    private String city;
    private String state;
    private String country;
    private String pin;
    private String contactNo;
    private String email;

    public Contact(int id, String street, String state) {
        this.id = id;
        this.street = street;
        this.state = state;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getStreet() {
        return street;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getCity() {
        return city;
    }
}