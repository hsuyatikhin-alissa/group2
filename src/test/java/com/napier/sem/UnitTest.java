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

    @Test
    void printAllCountriesInAContinentNullTest() {
        cntryrpt.printAllCountriesInAContinent(null);
    }

    @Test
    void printAllCountriesInAContinentTestEmpty() {
        ArrayList<Country> countries = new ArrayList<>();
        cntryrpt.printAllCountriesInAContinent(countries);
    }

    @Test
    void printAllCountriesInAContinentTestContainsNull() {
        ArrayList<Country> countries = new ArrayList<>();
        countries.add(null);
        cntryrpt.printAllCountriesInAContinent(countries);
    }

    @Test
    void printAllCountriesInAContinentTest() {
        ArrayList<Country> countries = new ArrayList<>();
        Country country = new Country();
        country.setCode("ABW");
        country.setName("Aruba");
        country.setContinent("North America");
        country.setRegion("Caribbean");
        country.setPopulation(103000);
        country.setCapital("Oranjestad");
        countries.add(country);
        cntryrpt.printAllCountriesInAContinent(countries);
    }


    /**
     * 3. Unit tests for all the countries in a region organised by largest population to smallest.
     */

    @Test
    void printAllCountriesInARegionNullTest() {
        cntryrpt.printAllCountriesInARegion(null);
    }

    @Test
    void printAllCountriesInARegionTestEmpty() {
        ArrayList<Country> countries = new ArrayList<>();
        cntryrpt.printAllCountriesInARegion(countries);
    }

    @Test
    void printAllCountriesInARegionTestContainsNull() {
        ArrayList<Country> countries = new ArrayList<>();
        countries.add(null);
        cntryrpt.printAllCountriesInARegion(countries);
    }

    @Test
    void printAllCountriesInARegionTest() {
        ArrayList<Country> countries = new ArrayList<>();
        Country country = new Country();
        country.setCode("ABW");
        country.setName("Aruba");
        country.setContinent("North America");
        country.setRegion("Caribbean");
        country.setPopulation(103000);
        country.setCapital("Oranjestad");
        countries.add(country);
        cntryrpt.printAllCountriesInARegion(countries);
    }

    /**
     * 4. Unit tests for the top N populated countries in the world where N is provided by the user.
     */

    @Test
    void printTopNCountriesInTheWorldNullTest() {
        cntryrpt.printTopNCountriesInTheWorld(null);
    }

    @Test
    void printTopNCountriesInTheWorldTestEmpty() {
        ArrayList<Country> countries = new ArrayList<>();
        cntryrpt.printTopNCountriesInTheWorld(countries);
    }

    @Test
    void printTopNCountriesInTheWorldTestContainsNull() {
        ArrayList<Country> countries = new ArrayList<>();
        countries.add(null);
        cntryrpt.printTopNCountriesInTheWorld(countries);
    }

    @Test
    void printTopNCountriesInTheWorldTest() {
        ArrayList<Country> countries = new ArrayList<Country>();
        Country country = new Country();
        country.setCode("ABW");
        country.setName("Aruba");
        country.setContinent("North America");
        country.setRegion("Caribbean");
        country.setPopulation(103000);
        country.setCapital("Oranjestad");
        countries.add(country);
        cntryrpt.printTopNCountriesInTheWorld(countries);
    }

    /**
     * 5. Unit tests for the top N populated countries in a continent where N is provided by the user.
     */

    @Test
    void printTopNCountriesInAContinentNullTest() {
        cntryrpt.printTopNCountriesInAContinent(null);
    }

    @Test
    void printTopNCountriesInAContinentTestEmpty() {
        ArrayList<Country> countries = new ArrayList<>();
        cntryrpt.printTopNCountriesInAContinent(countries);
    }

    @Test
    void printTopNCountriesInAContinentTestContainsNull() {
        ArrayList<Country> countries = new ArrayList<>();
        countries.add(null);
        cntryrpt.printTopNCountriesInAContinent(countries);
    }

    @Test
    void printTopNCountriesInAContinentTest() {
        ArrayList<Country> countries = new ArrayList<>();
        Country country = new Country();
        country.setCode("KOR");
        country.setName("South Korea");
        country.setContinent("Asia");
        country.setRegion("Eastern Asia");
        country.setPopulation(46844000);
        country.setCapital("Seoul");
        countries.add(country);
        cntryrpt.printTopNCountriesInAContinent(countries);
    }


    /**
     * 6. Unit tests for the top N populated countries in a region where N is provided by the user.
     */

    @Test
    void printTopNPopulatedCountriesInARegionNullTest() {
        cntryrpt.printTopNPopulatedCountriesInARegion(null);
    }

    @Test
    void printTopNPopulatedCountriesInARegionTestEmpty() {
        ArrayList<Country> countries = new ArrayList<>();
        cntryrpt.printTopNPopulatedCountriesInARegion(countries);
    }

    @Test
    void printTopNPopulatedCountriesInARegionTestContainsNull() {
        ArrayList<Country> countries = new ArrayList<>();
        countries.add(null);
        cntryrpt.printTopNPopulatedCountriesInARegion(countries);
    }

    @Test
    void printTopNPopulatedCountriesInARegionTest() {
        ArrayList<Country> countries = new ArrayList<>();
        Country country = new Country();
        country.setCode("KOR");
        country.setName("South Korea");
        country.setContinent("Asia");
        country.setRegion("Eastern Asia");
        country.setPopulation(46844000);
        country.setCapital("Seoul");
        countries.add(country);
        cntryrpt.printTopNPopulatedCountriesInARegion(countries);
    }

    /**
     * 7. Unit tests for all the cities in the world organised by largest population to smallest.
     */

    @Test
    void printAllCitiesInTheWorldNullTest() {
        ctyrpt.printAllCitiesInTheWorld(null);
    }

    @Test
    void printAllCitiesInTheWorldTestEmpty() {
        ArrayList<City> cities = new ArrayList<>();
        ctyrpt.printAllCitiesInTheWorld(cities);
    }

    @Test
    void printAllCitiesInTheWorldTestContainsNull() {
        ArrayList<City> cities = new ArrayList<>();
        cities.add(null);
        ctyrpt.printAllCitiesInTheWorld(cities);
    }

    @Test
    void printAllCitiesInTheWorldTest() {
        ArrayList<City> cities = new ArrayList<>();
        City city = new City();
        city.setName("Kabul");
        city.setCountryCode("AFG");
        city.setPopulation(1780000);
        cities.add(city);
        ctyrpt.printAllCitiesInTheWorld(cities);
    }

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

    @Test
    void printAllCitiesInACountryNullTest() {
        ctyrpt.printAllCitiesInACountry(null);
    }

    @Test
    void printAllCitiesInACountryTestEmpty() {
        ArrayList<City> cities = new ArrayList<>();
        ctyrpt.printAllCitiesInACountry(cities);
    }

    @Test
    void printAllCitiesInACountryTestContainsNull() {
        ArrayList<City> cities = new ArrayList<>();
        cities.add(null);
        ctyrpt.printAllCitiesInACountry(cities);
    }

    @Test
    void printAllCitiesInACountryTest() {
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
        ctyrpt.printAllCitiesInACountry(cities);
    }


    /**
     * 11. Unit tests for all the cities in a district organised by largest population to smallest.
     */




    /**
     * 12. Unit tests for the top N populated cities in the world where N is provided by the user.
     */

    @Test
    void printTopNPopulatedCitiesInTheWorldNullTest() {
        ctyrpt.printTopNPopulatedCitiesInTheWorld(null);
    }

    @Test
    void printTopNPopulatedCitiesInTheWorldTestEmpty() {
        ArrayList<City> cities = new ArrayList<>();
        ctyrpt.printTopNPopulatedCitiesInTheWorld(cities);
    }

    @Test
    void printTopNPopulatedCitiesInTheWorldTestContainsNull() {
        ArrayList<City> cities = new ArrayList<>();
        cities.add(null);
        ctyrpt.printTopNPopulatedCitiesInTheWorld(cities);
    }

    @Test
    void printTopNPopulatedCitiesInTheWorldTest() {
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
        ctyrpt.printTopNPopulatedCitiesInTheWorld(cities);
    }

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
