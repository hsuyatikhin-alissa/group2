package com.napier.sem;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

public class TopNPopulatedCountriesinacontinentTest {
    static com.napier.sem.TopNPopulatedCountriesinacontinent app;

    @BeforeAll
    static void init() {
        app = new com.napier.sem.TopNPopulatedCountriesinacontinent();
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
        country.setCapital(2331);
        countries.add(country);
        app.printCountries(countries);
    }
}





