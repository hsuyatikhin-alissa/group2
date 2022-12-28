package com.napier.sem;

/**
 * Represents a country
 */
public class Country {
    /**
     * Country Code
     */
    private String Code;

    /**
     * Country Name
     */
    private String Name;

    /**
     * Country Continent
     */
    private String Continent;

    /**
     * Country Region
     */
    private String Region;

    /**
     * Country Population
     */
    private int Population;

    /**
     * Country Capital
     */
    private String Capital;

    public String getCode() {
        return Code;
    }

    public void setCode(String code) {
        Code = code;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getContinent() {
        return Continent;
    }

    public void setContinent(String continent) {
        Continent = continent;
    }

    public String getRegion() {
        return Region;
    }

    public void setRegion(String region) {
        Region = region;
    }

    public int getPopulation() {
        return Population;
    }

    public void setPopulation(int population) {
        Population = population;
    }

    public String getCapital() {
        return Capital;
    }

    public void setCapital(String capital) {
        Capital = capital;
    }
}