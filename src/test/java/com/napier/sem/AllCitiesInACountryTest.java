package com.napier.sem;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class AllCitiesInACountryTest {
    static AllCitiesInACountry ccon;

    @BeforeAll
    static void init() {
        ccon = new AllCitiesInACountry();
    }

    @Test
    void printAllCitiesInACountryNullTest() {
        ccon.printCities(null);
    }

    @Test
    void printCitiesTestEmpty() {
        ArrayList<City> cities = new ArrayList<>();
        ccon.printCities(cities);
    }

    @Test
    void printCitiesTestContainsNull() {
        ArrayList<City> cities = new ArrayList<>();
        cities.add(null);
        ccon.printCities(cities);
    }

    @Test
    void printCitiesInACountryTest() {
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
        ccon.printCities(cities);
    }

}