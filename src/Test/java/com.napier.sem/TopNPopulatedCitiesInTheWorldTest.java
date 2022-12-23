package com.napier.sem;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;


public class TopNPopulatedCitiesInTheWorldTest {

    static TopNPopulatedCitiesInTheWorld app;

    @BeforeAll
    static void init() {
        app = new TopNPopulatedCitiesInTheWorld();
    }

    @Test
    void printCitiesNullTest() {
        app.printCities(null);
    }

    @Test
    void printCitiesTestEmpty() {
        ArrayList<City> cities = new ArrayList<>();
        app.printCities(cities);
    }

    @Test
    void printCitiesTestContainsNull() {
        ArrayList<City> cities = new ArrayList<>();
        cities.add(null);
        app.printCities(cities);
    }

    @Test
    void printCitiesTest() {
        ArrayList<City> cities = new ArrayList<>();
        City city = new City();
        Country country = new Country();
        city.setName("China");
        country.setContinent("Asia");
        country.setRegion("Eastern Asia");
        city.setCountry(country);
        city.setCountryCode("CHN");
        city.setPopulation(1277558000);
        cities.add(city);
        app.printCities(cities);
    }
}

