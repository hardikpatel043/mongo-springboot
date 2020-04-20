package com.dm.demomongodb.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Location {
    private String type;
    private Double[] coordinates;
    private boolean isLocationExact;

    @JsonProperty("type")
    public String getType() { return type; }
    @JsonProperty("type")
    public void setType(String value) { this.type = value; }

    @JsonProperty("coordinates")
    public Double[] getCoordinates() { return coordinates; }
    @JsonProperty("coordinates")
    public void setCoordinates(Double[] value) { this.coordinates = value; }

    @JsonProperty("is_location_exact")
    public boolean getIsLocationExact() { return isLocationExact; }
    @JsonProperty("is_location_exact")
    public void setIsLocationExact(boolean value) { this.isLocationExact = value; }
}
