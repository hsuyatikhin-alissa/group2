package com.napier.sem;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;


public class AllCitiesInTheWorldTest {

        static AllCitiesInTheWorld app;

        @BeforeAll
        static void init() {
            app = new AllCitiesInTheWorld();
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
            city.setName("Kabul");
            city.setCountryCode("AFG");
            city.setPopulation(1780000);
            cities.add(city);
            app.printCities(cities);
        }
    }

