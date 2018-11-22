package com.programminghub.upapp;

import com.fasterxml.jackson.annotation.JsonProperty;

public class BuildingModel {
    @JsonProperty("BuildingID")
    private int BuildingID;
    @JsonProperty("BuildingName")
    private String BuildingName;
    @JsonProperty("BuildingType")
    private String BuildingType;
    @JsonProperty("Abbreviation")
    private String Abbreviation;
    @JsonProperty("Latitude")
    private float Latitude;
    @JsonProperty("Longitude")
    private float Longitude;
}
