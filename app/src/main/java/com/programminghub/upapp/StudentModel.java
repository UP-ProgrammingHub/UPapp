package com.programminghub.upapp;

import com.fasterxml.jackson.annotation.JsonProperty;

public class StudentModel {
    @JsonProperty("StudentID")
    private String StudentID;
    @JsonProperty("Password")
    private String Password;
    @JsonProperty("FirstName")
    private String FirstName;
    @JsonProperty("LastName")
    private String LastName;
}
