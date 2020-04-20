package com.dm.demomongodb.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Address {
    private String street;
    private String suburb;
    private String governmentArea;
    private String market;
    private String country;
    private String countryCode;
    private Location location;

    @JsonProperty("street")
    public String getStreet() { return street; }
    @JsonProperty("street")
    public void setStreet(String value) { this.street = value; }

    @JsonProperty("suburb")
    public String getSuburb() { return suburb; }
    @JsonProperty("suburb")
    public void setSuburb(String value) { this.suburb = value; }

    @JsonProperty("government_area")
    public String getGovernmentArea() { return governmentArea; }
    @JsonProperty("government_area")
    public void setGovernmentArea(String value) { this.governmentArea = value; }

    @JsonProperty("market")
    public String getMarket() { return market; }
    @JsonProperty("market")
    public void setMarket(String value) { this.market = value; }

    @JsonProperty("country")
    public String getCountry() { return country; }
    @JsonProperty("country")
    public void setCountry(String value) { this.country = value; }

    @JsonProperty("country_code")
    public String getCountryCode() { return countryCode; }
    @JsonProperty("country_code")
    public void setCountryCode(String value) { this.countryCode = value; }

    @JsonProperty("location")
    public Location getLocation() { return location; }
    @JsonProperty("location")
    public void setLocation(Location value) { this.location = value; }
}