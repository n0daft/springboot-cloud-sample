package com.elderbyte.paassample.octocats;

import java.util.Date;

public class OctoCat {

    // *************************************************************
    // Fields
    // *************************************************************

    private int id;
    private String name;
    private Date Date;
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

    public Date getDate() {
        return Date;
    }

    public void setDate(Date date) {
        Date = date;
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
