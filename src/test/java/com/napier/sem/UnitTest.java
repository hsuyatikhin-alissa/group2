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




    /**
     * 17. Unit tests for all the capital cities in the world organised by largest population to smallest.
     */

    @Test
    void printAllCapitalCitiesInTheWorldNullTest() {
        cctyrpt.printAllCapitalCitiesInTheWorld(null);
    }

    @Test
    void printAllCapitalCitiesInTheWorldTestEmpty() {
        ArrayList<CapitalCity> capitalCities = new ArrayList<>();
        cctyrpt.printAllCapitalCitiesInTheWorld(capitalCities);
    }

    @Test
    void printAllCapitalCitiesInTheWorldTestContainsNull() {
        ArrayList<CapitalCity> capitalCities = new ArrayList<>();
        capitalCities.add(null);
        cctyrpt.printAllCapitalCitiesInTheWorld(capitalCities);
    }

    @Test
    void printAllCapitalCitiesInTheWorldTest() {
        ArrayList<CapitalCity> capitalCities = new ArrayList<>();
        CapitalCity ccty = new CapitalCity();
        ccty.setName("Seoul");
        ccty.setCountry("South Korea");
        ccty.setPopulation(9981619);
        capitalCities.add(ccty);
        cctyrpt.printAllCapitalCitiesInTheWorld(capitalCities);
    }


    /**
     * 18. Unit tests for all the capital cities in a continent organised by largest population to smallest.
     */

    @Test
    void printAllCapitalCitiesInAContinentNullTest() {
        cctyrpt.printAllCapitalCitiesInAContinent(null);
    }

    @Test
    void printAllCapitalCitiesInAContinentTestEmpty() {
        ArrayList<CapitalCity> capitalCities = new ArrayList<>();
        cctyrpt.printAllCapitalCitiesInAContinent(capitalCities);
    }

    @Test
    void printAllCapitalCitiesInAContinentTestContainsNull() {
        ArrayList<CapitalCity> capitalCities = new ArrayList<>();
        capitalCities.add(null);
        cctyrpt.printAllCapitalCitiesInAContinent(capitalCities);
    }

    @Test
    void printAllCapitalCitiesInAContinentTest() {
        ArrayList<CapitalCity> capitalCities = new ArrayList<>();
        CapitalCity ccty = new CapitalCity();
        ccty.setName("Mumbai (Bombay)");
        ccty.setCountry("India");
        ccty.setPopulation(10500000);
        capitalCities.add(ccty);
        cctyrpt.printAllCapitalCitiesInAContinent(capitalCities);
    }

    /**
     * 19. Unit tests for all the capital cities in a region organised by largest population to smallest.
     */


    @Test
    void printAllCapitalCitiesInARegionNullTest() {
        cctyrpt.printAllCapitalCitiesInARegion(null);
    }

    @Test
    void printAllCapitalCitiesInARegionTestEmpty() {
        ArrayList<CapitalCity> capitalCities = new ArrayList<>();
        cctyrpt.printAllCapitalCitiesInARegion(capitalCities);
    }

    @Test
    void printAllCapitalCitiesInARegionTestContainsNull() {
        ArrayList<CapitalCity> capitalCities = new ArrayList<>();
        capitalCities.add(null);
        cctyrpt.printAllCapitalCitiesInARegion(capitalCities);
    }

    @Test
    void printAllCapitalCitiesInARegionTest() {
        ArrayList<CapitalCity> capitalCities = new ArrayList<>();
        CapitalCity ccty = new CapitalCity();
        ccty.setName("Seoul");
        ccty.setCountry("South Korea");
        ccty.setPopulation(9981619);
        capitalCities.add(ccty);
        cctyrpt.printAllCapitalCitiesInARegion(capitalCities);
    }




    /**
     * 20. Unit tests for the top N populated capital cities in the world where N is provided by the user.
     */

    @Test
    void printTopNPopulatedCapitalCitiesInTheWorldNullTest() {
        cctyrpt.printTopNPopulatedCapitalCitiesInTheWorld(null);
    }

    @Test
    void printTopNPopulatedCapitalCitiesInTheWorldTestEmpty() {
        ArrayList<CapitalCity> capitalCities = new ArrayList<>();
        cctyrpt.printTopNPopulatedCapitalCitiesInTheWorld(capitalCities);
    }

    @Test
    void printTopNPopulatedCapitalCitiesInTheWorldTestContainsNull() {
        ArrayList<CapitalCity> capitalCities = new ArrayList<>();
        capitalCities.add(null);
        cctyrpt.printTopNPopulatedCapitalCitiesInTheWorld(capitalCities);
    }

    @Test
    void printTopNPopulatedCapitalCitiesInTheWorldTest() {
        ArrayList<CapitalCity> capitalCities = new ArrayList<>();
        CapitalCity ccty = new CapitalCity();
        ccty.setName("Seoul");
        ccty.setCountry("South Korea");
        ccty.setPopulation(9981619);
        capitalCities.add(ccty);
        cctyrpt.printTopNPopulatedCapitalCitiesInTheWorld(capitalCities);
    }

    /**
     * 21. Unit test for the top N populated capital cities in a continent where N is provided by the user.
     */

    @Test
    void printTopNPopulatedCapitalCitiesInAContinentNullTest() {
        cctyrpt.printTopNPopulatedCapitalCitiesInAContinent(null);
    }

    @Test
    void printTopNPopulatedCapitalCitiesInAContinentTestEmpty() {
        ArrayList<CapitalCity> capitalCities = new ArrayList<CapitalCity>();
        cctyrpt.printTopNPopulatedCapitalCitiesInAContinent(capitalCities);
    }

    @Test
    void printTopNPopulatedCapitalCitiesInAContinentTestContainsNull() {
        ArrayList<CapitalCity> capitalCities = new ArrayList<CapitalCity>();
        capitalCities.add(null);
        cctyrpt.printTopNPopulatedCapitalCitiesInAContinent(capitalCities);
    }

    @Test
    void printTopNPopulatedCapitalCitiesInAContinentTest() {
        ArrayList<CapitalCity> capitalCities = new ArrayList<CapitalCity>();
        CapitalCity capitalCity = new CapitalCity();
        capitalCity.setName("Seoul");
        capitalCity.setCountry("South Korea");
        capitalCity.setPopulation(9981619);
        capitalCities.add(capitalCity);
        cctyrpt.printTopNPopulatedCapitalCitiesInAContinent(capitalCities);
    }

    /**
     * 22. Unit test for the top N populated capital cities in a region where N is provided by the user.
     */

    @Test
    void printTopNPopulatedCapitalCitiesInARegionNullTest() {
        cctyrpt.printTopNPopulatedCapitalCitiesInARegion(null);
    }

    @Test
    void printTopNPopulatedCapitalCitiesInARegionTestEmpty() {
        ArrayList<CapitalCity> capitalCities = new ArrayList<CapitalCity>();
        cctyrpt.printTopNPopulatedCapitalCitiesInARegion(capitalCities);
    }

    @Test
    void printTopNPopulatedCapitalCitiesInARegionTestContainsNull() {
        ArrayList<CapitalCity> capitalCities = new ArrayList<CapitalCity>();
        capitalCities.add(null);
        cctyrpt.printTopNPopulatedCapitalCitiesInARegion(capitalCities);
    }

    @Test
    void printTopNPopulatedCapitalCitiesInARegionTest() {
        ArrayList<CapitalCity> capitalCities = new ArrayList<CapitalCity>();
        CapitalCity capitalCity = new CapitalCity();
        capitalCity.setName("Seoul");
        capitalCity.setCountry("South Korea");
        capitalCity.setPopulation(9981619);
        capitalCities.add(capitalCity);
        cctyrpt.printTopNPopulatedCapitalCitiesInARegion(capitalCities);
    }


    /**
     * 23. Unit test for The population of people, people living in cities, and people not living in cities in each continent.
     */

    @Test
    void printPopulationPeopleInContinentNullTest() {
        poprpt.printPopulationPeopleInContinent(null);
    }

    @Test
    void printPopulationPeopleInContinentTestEmpty() {
        ArrayList<Population> populations = new ArrayList<Population>();
        poprpt.printPopulationPeopleInContinent(populations);
    }

    @Test
    void printPopulationPeopleInContinentTestContainsNull() {
        ArrayList<Population> populations = new ArrayList<Population>();
        populations.add(null);
        poprpt.printPopulationPeopleInContinent(populations);
    }

    @Test
    void printPopulationPeopleInContinentTest() {
        ArrayList<Population> populations = new ArrayList<Population>();
        Population population = new Population();
        population.setName("North America");
        population.setPopulation(482993000);
        population.setPopInCity(168250381);
        population.setPopNotInCity(314742619);
        populations.add(population);
        poprpt.printPopulationPeopleInContinent(populations);
    }

    /**
     * 24. Unit test for The population of people, people living in cities, and people not living in cities in each region.
     */

    @Test
    void printPopulationPeopleInRegionNullTest() {
        poprpt.printPopulationPeopleInRegion(null);
    }

    @Test
    void printPopulationPeopleInRegionTestEmpty() {
        ArrayList<Population> populations = new ArrayList<Population>();
        poprpt.printPopulationPeopleInRegion(populations);
    }

    @Test
    void printPopulationPeopleInRegionTestContainsNull() {
        ArrayList<Population> populations = new ArrayList<Population>();
        populations.add(null);
        poprpt.printPopulationPeopleInRegion(populations);
    }

    @Test
    void printPopulationPeopleInRegionTest() {
        ArrayList<Population> populations = new ArrayList<Population>();
        Population population = new Population();
        population.setName("North America");
        population.setPopulation(309632000);
        population.setPopInCity(91321867);
        population.setPopNotInCity(218310133);
        populations.add(population);
        poprpt.printPopulationPeopleInRegion(populations);
    }










}
