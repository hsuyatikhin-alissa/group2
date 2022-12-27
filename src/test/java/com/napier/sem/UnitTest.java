package com.napier.sem;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

public class UnitTest {

    static CityReport ctyrpt;
    static CountryReport cntryrpt;
    static CapitalCityReport cctyrpt;
    static PopulationReport poprpt;

    @BeforeAll
    static void init() {
        ctyrpt = new CityReport();
        cntryrpt = new CountryReport();
        cctyrpt = new CapitalCityReport();
        poprpt = new PopulationReport();
    }

    /**
     * 1. Unit tests for all the countries in the world organised by largest population to smallest.
     */





    /**
     * 2. Unit tests for all the countries in a continent organised by largest population to smallest.
     */




    /**
     * 3. Unit tests for all the countries in a region organised by largest population to smallest.
     */




    /**
     * 4. Unit tests for the top N populated countries in the world where N is provided by the user.
     */






    /**
     * 5. Unit tests for the top N populated countries in a continent where N is provided by the user.
     */





    /**
     * 6. Unit tests for the top N populated countries in a region where N is provided by the user.
     */







    /**
     * 7. Unit tests for all the cities in the world organised by largest population to smallest.
     */








    /**
     * 8. Unit tests for all the cities in a continent organised by largest population to smallest.
     */

    @Test
    void printAllCitiesInAContinentNullTest() {
        ctyrpt.printAllCitiesInAContinent(null);
    }

    @Test
    void printAllCitiesInAContinentTestEmpty() {
        ArrayList<City> cities = new ArrayList<>();
        ctyrpt.printAllCitiesInAContinent(cities);
    }

    @Test
    void printAllCitiesTestContainsNull() {
        ArrayList<City> cities = new ArrayList<>();
        cities.add(null);
        ctyrpt.printAllCitiesInAContinent(cities);
    }

    @Test
    void printAllCitiesInAContinentTest() {
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
        ctyrpt.printAllCitiesInAContinent(cities);
    }

    /**
     * 9. Unit tests for all the cities in a region organised by largest population to smallest.
     */

    @Test
    void printAllCitiesInARegionNullTest() {
        ctyrpt.printAllCitiesInARegion(null);
    }

    @Test
    void printAllCitiesInARegionTestEmpty() {
        ArrayList<City> cities = new ArrayList<>();
        ctyrpt.printAllCitiesInARegion(cities);
    }

    @Test
    void printAllCitiesInARegionTestContainsNull() {
        ArrayList<City> cities = new ArrayList<>();
        cities.add(null);
        ctyrpt.printAllCitiesInARegion(cities);
    }

    @Test
    void printAllCitiesInARegionTest() {
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
        ctyrpt.printAllCitiesInARegion(cities);
    }

    /**
     * 10. Unit tests for all the cities in a country organised by largest population to smallest.
     */




    /**
     * 11. Unit tests for all the cities in a district organised by largest population to smallest.
     */




    /**
     * 12. Unit tests for the top N populated cities in the world where N is provided by the user.
     */






    /**
     * 13. Unit tests for top N populated cities in a continent.
     */

    @Test
    void printTopNCitiesInAContinentNullTest() {
        ctyrpt.printAllCitiesInAContinent(null);
    }

    @Test
    void printTopNCitiesInAContinentTestEmpty() {
        ArrayList<City> cities = new ArrayList<>();
        ctyrpt.printAllCitiesInAContinent(cities);
    }

    @Test
    void printTopNCitiesInAContinentTestContainsNull() {
        ArrayList<City> cities = new ArrayList<>();
        cities.add(null);
        ctyrpt.printTopNCitiesInAContinent(cities);
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
        ctyrpt.printTopNCitiesInAContinent(cities);
    }

    /**
     * 14. Unit tests for top N populated cities in a region.
     */

    @Test
    void printTopNPopulatedCitiesInARegionNullTest() {
        ctyrpt.printTopNCitiesInARegion(null);
    }

    @Test
    void printTopNPopulatedCitiesInARegionTestEmpty() {
        ArrayList<City> cities = new ArrayList<>();
        ctyrpt.printTopNCitiesInARegion(cities);
    }

    @Test
    void printCitiesTestContainsNull() {
        ArrayList<City> cities = new ArrayList<>();
        cities.add(null);
        ctyrpt.printTopNCitiesInARegion(cities);
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
        ctyrpt.printTopNCitiesInARegion(cities);
    }

    /**
     * 15. Unit tests for the top N populated cities in a country where N is provided by the user.
     */




    /**
     * 16. Unit tests for the top N populated cities in a district where N is provided by the user.
     */










}
