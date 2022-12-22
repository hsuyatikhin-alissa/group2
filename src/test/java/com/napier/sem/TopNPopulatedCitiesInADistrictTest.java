package com.napier.sem;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

public class TopNPopulatedCitiesInADistrictTest {
    static com.napier.sem.TopNPopulatedCitiesInADistrict app;

    @BeforeAll
    static void init() {
        app = new com.napier.sem.TopNPopulatedCitiesInADistrict();
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
    void printCitiesInAContinentTest() {
        ArrayList<City> cities = new ArrayList<>();
        City city = new City();
        Country country = new Country();
        city.setName("Seoul");
        country.setName("South Korea");
        country.setContinent("Asia");
        city.setDistrict("Seoul");
        city.setPopulation(9981619);
        city.setCountry(country);
        cities.add(city);
        app.printCities(cities);
    }
}
