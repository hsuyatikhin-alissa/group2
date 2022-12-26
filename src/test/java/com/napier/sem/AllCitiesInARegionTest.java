package com.napier.sem;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class AllCitiesInARegionTest {
    static AllCitiesInARegion creg;

    @BeforeAll
    static void init() {
        creg = new AllCitiesInARegion();
    }

    @Test
    void printAllCitiesInARegionNullTest() {
        creg.printCitiesInARegion(null);
    }

    @Test
    void printCitiesInARegionTestEmpty() {
        ArrayList<City> cities = new ArrayList<>();
        creg.printCitiesInARegion(cities);
    }

    @Test
    void printCitiesTestContainsNull() {
        ArrayList<City> cities = new ArrayList<>();
        cities.add(null);
        creg.printCitiesInARegion(cities);
    }

    @Test
    void printCitiesInARegionTest() {
        ArrayList<City> cities = new ArrayList<>();
        City city = new City();
        Country country = new Country();

        city.setName("Seoul");
        country.setName("South Korea");
        country.setRegion("Eastern Asia");
        city.setDistrict("Seoul");
        city.setPopulation(9981619);
        city.setCountry(country);


        cities.add(city);
        creg.printCitiesInARegion(cities);
    }

}