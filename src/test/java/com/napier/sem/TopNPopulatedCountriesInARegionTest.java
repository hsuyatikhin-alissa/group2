package com.napier.sem;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

public class TopNPopulatedCountriesInARegionTest {
    static TopNPopulatedCountriesInARegion app;

    @BeforeAll
    static void init() {
        app = new TopNPopulatedCountriesInARegion();
    }

    @Test
    void printCountriesNullTest() {
        app.printCountries(null);
    }

    @Test
    void printCountriesTestEmpty() {
        ArrayList<Country> countries = new ArrayList<>();
        app.printCountries(countries);
    }

    @Test
    void printCountriesTestContainsNull() {
        ArrayList<Country> countries = new ArrayList<>();
        countries.add(null);
        app.printCountries(countries);
    }

    @Test
    void printCountriesTest() {
        ArrayList<Country> countries = new ArrayList<>();
        Country country = new Country();
        country.setCode("KOR");
        country.setName("South Korea");
        country.setContinent("Asia");
        country.setRegion("Eastern Asia");
        country.setPopulation(46844000);
        country.setCapital("Seoul");
        countries.add(country);
        app.printCountries(countries);
    }
}