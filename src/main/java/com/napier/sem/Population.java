package com.napier.sem;

/**
 *Represents a Population: Class for Population model which included getter setter methods.
 */
public class Population {

    /**
     * The name of the continent/region/country.
     */
    private String name;

    /**
     * The total population of the continent/region/country.
     */
    private long population;

    /**
     * The population not living in city
     */
    private long populationNotInCity;

    /**
     * The population living in city
     */
    private long populationInCity;


    /**
     * method to get continent/region/country name
     * @return name of continent/region/country
     */
    public String getName() {
        return name;
    }

    /**
     * method to set continent/region/country name
     * @param name of continent/region/country
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * method to get population of the continent/region/country
     * @return population of the continent/region/country
     */
    public long getPopulation() {
        return population;
    }

    /**
     * method to set population of the continent/region/country
     * @param population of the continent/region/country
     */
    public void setPopulation(long population) {
        this.population = population;
    }

    /**
     * method to get population not in city
     * @return population not in city
     */
    public long getPopNotInCity() {
        return populationNotInCity;
    }

    /**
     * method to set population not in city
     * @param popNotInCity population not in city
     */
    public void setPopNotInCity(long popNotInCity) {
        this.populationNotInCity = popNotInCity;
    }

    /**
     * method to get population in city
     * @return population in city
     */
    public long getPopInCity() {
        return populationInCity;
    }

    /**
     * method to set population in city
     * @param popInCity population in city
     */
    public void setPopInCity(long popInCity) {
        this.populationInCity = popInCity;
    }


}