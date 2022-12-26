package com.napier.sem;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

public class AllCountriesInAContinentTest {
    static com.napier.sem.AllCountriesInAContinent app;

    @BeforeAll
    static void init() {
        app = new com.napier.sem.AllCountriesInAContinent();
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
        country.setCapital(129);
        countries.add(country);
        app.printCountries(countries);
    }
}





