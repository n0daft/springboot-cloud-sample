package com.elderbyte.paassample.octocats;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.time.LocalDateTime;

public class OctoCat {

    // *************************************************************
    // Fields
    // *************************************************************

    @JsonProperty("id")
    private int id;
    @JsonProperty("name")
    private String name;
    @JsonProperty("dateOfBirth")
    private LocalDateTime dateOfBirth;

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

    public LocalDateTime getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(LocalDateTime dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }


}
