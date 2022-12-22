package com.napier.sem;

/**
 * Represents a city
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
     * City District
     */
    private String District;

    /**
     * City Population
     */
    private int Population;

    public Country getCountry() {
        return country;
    }

    public void setCountry(Country country) {
        this.country = country;
    }

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

    public void setCountryCode(String countryCode) {
        CountryCode = countryCode;
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

