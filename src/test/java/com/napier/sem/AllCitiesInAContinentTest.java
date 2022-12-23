package com.napier.sem;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class AllCitiesInAContinentTest {
    static AllCitiesInAContinent ccon;

    @BeforeAll
    static void init() {
        ccon = new AllCitiesInAContinent();
    }

    @Test
    void printAllCitiesInAContinentNullTest() {
        ccon.printCitiesInAContinent(null);
    }

    @Test
    void printCitiesInAContinentTestEmpty() {
        ArrayList<City> cities = new ArrayList<>();
        ccon.printCitiesInAContinent(cities);
    }

    @Test
    void printCitiesTestContainsNull() {
        ArrayList<City> cities = new ArrayList<>();
        cities.add(null);
        ccon.printCitiesInAContinent(cities);
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
        ccon.printCitiesInAContinent(cities);
    }

}