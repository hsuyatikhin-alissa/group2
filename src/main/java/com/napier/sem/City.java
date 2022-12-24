package com.napier.sem;


/**
 * Represents an city
 */
public class City
{

    /**
     * Country to get country name
     */
    private Country country;
    /**
     * City ID
     */
    public Country getCountry() {
        return country;
    }


    public void setCountry(Country country) {
        this.country = country;
    }

    /**
     * City ID
     */
    private int ID;

    /**
     * City Name
     */
    private String Name;

    /**
     * CountryCode
     */
    private String CountryCode;

    /**
     * Region
     */
    private String Region;

    /**
     * City District
     */
    private String District;

    /**
     * City Population
     */
    private int Population;

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getCountryCode() {
        return CountryCode;
    }

    public void setCountryCode(String code) {
        CountryCode = code;
    }

    public String getRegion() {
        return Region;
    }

    public void setRegion(String region) {
        Region = region;
    }

    public String getDistrict() {
        return District;
    }

    public void setDistrict(String district) {
        District = district;
    }

    public int getPopulation() {
        return Population;
    }

    public void setPopulation(int population) {
        Population = population;
    }
}
