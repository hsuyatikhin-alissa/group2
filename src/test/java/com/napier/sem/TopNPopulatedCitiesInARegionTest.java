package com.napier.sem;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class TopNPopulatedCitiesInARegionTest {
    static TopNPopulatedCitiesInARegion treg;

    @BeforeAll
    static void init() {
        treg = new TopNPopulatedCitiesInARegion();
    }

    @Test
    void printTopNPopulatedCitiesInARegionNullTest() {
        treg.printCities(null);
    }

    @Test
    void printTopNPopulatedCitiesInARegionTestEmpty() {
        ArrayList<City> cities = new ArrayList<>();
        treg.printCities(cities);
    }

    @Test
    void printCitiesTestContainsNull() {
        ArrayList<City> cities = new ArrayList<>();
        cities.add(null);
        treg.printCities(cities);
    }

    @Test
    void printCitiesTest() {
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
        treg.printCities(cities);
    }

}