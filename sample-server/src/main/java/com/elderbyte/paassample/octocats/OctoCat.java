package com.elderbyte.paassample.octocats;

public class OctoCat {

    // *************************************************************
    // Fields
    // *************************************************************

    private int id;
    private String name;
    //private LocalDateTime dateOfBirth;

    // *************************************************************
    // Constructors
    // *************************************************************

    public OctoCat(int id) {
        this.id = id;
    }

    // *************************************************************
    // Getters and Setters
    // *************************************************************

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    /*
    public LocalDateTime getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(LocalDateTime dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }
    */

}
