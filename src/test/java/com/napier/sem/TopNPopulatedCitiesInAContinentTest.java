package com.napier.sem;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class TopNPopulatedCitiesInAContinentTest {
    static TopNPopulatedCitiesInAContinent tcon;

    @BeforeAll
    static void init() {
        tcon = new TopNPopulatedCitiesInAContinent();
    }

    @Test
    void printAllCitiesInAContinentNullTest() {
        tcon.printCities(null);
    }

    @Test
    void printCitiesInAContinentTestEmpty() {
        ArrayList<City> cities = new ArrayList<>();
        tcon.printCities(cities);
    }

    @Test
    void printCitiesTestContainsNull() {
        ArrayList<City> cities = new ArrayList<>();
        cities.add(null);
        tcon.printCities(cities);
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
        tcon.printCities(cities);
    }

}