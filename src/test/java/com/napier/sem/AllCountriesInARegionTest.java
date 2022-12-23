package com.napier.sem;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

public class AllCountriesInARegionTest {
    static AllCountriesInARegion app;

    @BeforeAll
    static void init() {
        app = new AllCountriesInARegion();
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
        country.setCode("ABW");
        country.setName("Aruba");
        country.setContinent("North America");
        country.setRegion("Caribbean");
        country.setPopulation(103000);
        country.setCapital("Oranjestad");
        countries.add(country);
        app.printCountries(countries);
    }
}