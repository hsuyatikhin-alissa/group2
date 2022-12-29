package com.napier.sem;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import java.sql.SQLException;
import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

public class IntegrationTest {

    static CityReport ctyrpt;
    static CountryReport cntryrpt;
    static CapitalCityReport cctyrpt;
    static PopulationReport poprpt;
    static DBConnect db;

    @BeforeAll
    static void init() {
        db = new DBConnect();
        db.connect("Localhost:33060", 3000);

        ctyrpt = new CityReport();
        ctyrpt.setCon(db.getCon());

        cntryrpt = new CountryReport();
        cntryrpt.setCon(db.getCon());

        cctyrpt = new CapitalCityReport();
        cctyrpt.setCon(db.getCon());

        poprpt = new PopulationReport();
        poprpt.setCon(db.getCon());
    }

    /**
     * 1. Integration test for all the countries in the world organised by largest population to smallest.
     */





    /**
     * 2. Integration test for all the countries in a continent organised by largest population to smallest.
     */

    @Test
    void testAllCountriesInAContinent() throws SQLException {
        // create array list
        ArrayList<Country> countries = cntryrpt.getAllCountriesInAContinent();
        // check array list is null
        assertNotNull(countries);
        /*Check expected data are correct or not*/
        assertEquals(countries.get(0).getCode(),"CHN");
        assertEquals(countries.get(0).getName(),"China");
        assertEquals(countries.get(0).getContinent(),"Asia");
        assertEquals(countries.get(0).getRegion(),"Eastern Asia");
        assertEquals(countries.get(0).getPopulation(),1277558000);
        assertEquals(countries.get(0).getCapital(),"Peking");
        // print report
    }


    /**
     * 3. Integration test for all the countries in a region organised by largest population to smallest.
     */




    /**
     * 4. Integration test for the top N populated countries in the world where N is provided by the user.
     */

    @Test
    void testTopNCountriesInTheWorld() throws SQLException {
        // create array list
        ArrayList<Country> countries = cntryrpt.getTopNCountriesInTheWorld();
        // check array list is null
        assertNotNull(countries);
        /*Check expected data are correct or not*/
        assertEquals(countries.get(0).getName(),"China");
        assertEquals(countries.get(0).getContinent(),"Asia");
        assertEquals(countries.get(0).getRegion(),"Eastern Asia");
        assertEquals(countries.get(0).getPopulation(),1277558000);
        assertEquals(countries.get(0).getCapital(),"Peking");
        // print report
    }

    /**
     * 5. Integration test for the top N populated countries in a continent where N is provided by the user.
     */

    @Test
    void testTopNCountriesInAContinent() throws SQLException {
        // create array list
        ArrayList<Country> countries = cntryrpt.getTopNCountriesInAContinent();
        // check array list is null
        assertNotNull(countries);
        /*Check expected data are correct or not*/
        assertEquals(countries.get(0).getCode(), "CHN");
        assertEquals(countries.get(0).getName(), "China");
        assertEquals(countries.get(0).getContinent(), "Asia");
        assertEquals(countries.get(0).getRegion(), "Eastern Asia");
        assertEquals(countries.get(0).getPopulation(), 1277558000);
        assertEquals(countries.get(0).getCapital(), "Peking");
        // print report
    }

    /**
     * 6. Integration test for the top N populated countries in a region where N is provided by the user.
     */







    /**
     * 7. Integration test for all the cities in the world organised by largest population to smallest.
     */






    /**
     * 8. Integration test for all the cities in a continent organised by largest population to smallest.
     */

    @Test
    void testAllCitiesInAContinent() throws SQLException {
        // create array list
        ArrayList<City> cities = ctyrpt.getAllCitiesInAContinent();
        // check array list is null
        assertNotNull(cities);
        /*Check expected data are correct or not*/
        assertEquals(cities.get(0).getName(),"Mumbai (Bombay)");
        assertEquals(cities.get(0).getCountry().getName(),"India");
        assertEquals(cities.get(0).getCountry().getContinent(),"Asia");
        assertEquals(cities.get(0).getDistrict(),"Maharashtra");
        assertEquals(cities.get(0).getPopulation(),10500000);
        // print report
    }

    /**
     * 9. Integration test for all the cities in a region organised by largest population to smallest.
     */

    @Test
    void testAllCitiesInARegion() throws SQLException {
        // create array list
        ArrayList<City> cities = ctyrpt.getAllCitiesInARegion();
        // check array list is null
        assertNotNull(cities);
        /*Check expected data are correct or not*/
        assertEquals(cities.get(0).getName(),"Seoul");
        assertEquals(cities.get(0).getCountry().getName(),"South Korea");
        assertEquals(cities.get(0).getCountry().getRegion(),"Eastern Asia");
        assertEquals(cities.get(0).getDistrict(),"Seoul");
        assertEquals(cities.get(0).getPopulation(),9981619);
        // print report
    }

    /**
     * 10. Integration test for all the cities in a country organised by largest population to smallest.
     */

    @Test
    void testAllCitiesInACountry() throws SQLException {
        // create array list
        ArrayList<City> cities = ctyrpt.getAllCitiesInACountry();
        // check array list is null
        assertNotNull(cities);
        /*Check expected data are correct or not*/
        assertEquals(cities.get(0).getName(),"New York");
        assertEquals(cities.get(0).getCountry().getName(),"United States");
        assertEquals(cities.get(0).getCountry().getContinent(),"North America");
        assertEquals(cities.get(0).getDistrict(),"New York");
        assertEquals(cities.get(0).getPopulation(),8008278);
        // print report
    }


    /**
     * 11. Integration test for all the cities in a district organised by largest population to smallest.
     */




    /**
     * 12. Integration test for the top N populated cities in the world where N is provided by the user.
     */





    /**
     * 13. Integration test for top N populated cities in a continent.
     */

    @Test
    void testTopNCitiesInAContinent() throws SQLException {
        // create array list
        ArrayList<City> cities = ctyrpt.getTopNCitiesInAContinent();
        // check array list is null
        assertNotNull(cities);
        /*Check expected data are correct or not*/
        assertEquals(cities.get(0).getName(),"Mumbai (Bombay)");
        assertEquals(cities.get(0).getCountry().getName(),"India");
        assertEquals(cities.get(0).getCountry().getContinent(),"Asia");
        assertEquals(cities.get(0).getDistrict(),"Maharashtra");
        assertEquals(cities.get(0).getPopulation(),10500000);
        // print report
    }

    /**
     * 14. Integration test for top N populated cities in a region.
     */

    @Test
    void testTopNCitiesInARegion() throws SQLException {
        // create array list
        ArrayList<City> cities = ctyrpt.getTopNCitiesInARegion();
        // check array list is null
        assertNotNull(cities);
        /*Check expected data are correct or not*/
        assertEquals(cities.get(0).getName(),"Seoul");
        assertEquals(cities.get(0).getCountry().getName(),"South Korea");
        assertEquals(cities.get(0).getCountry().getRegion(),"Eastern Asia");
        assertEquals(cities.get(0).getDistrict(),"Seoul");
        assertEquals(cities.get(0).getPopulation(),9981619);
        // print report
    }

    /**
     * 15. Integration test for the top N populated cities in a country where N is provided by the user.
     */




    /**
     * 16. Integration test for the top N populated cities in a district where N is provided by the user.
     */

    /**
     * 17. Integration test for all the capital cities in the world organised by largest population to smallest.
     */

    @Test
    void testAllCapitalCitiesInTheWorld() throws SQLException {
        // create array list
        ArrayList<CapitalCity> capitalCities = cctyrpt.getAllCapitalCitiesInTheWorld();
        // check array list is null
        assertNotNull(capitalCities);
        /*Check expected data are correct or not*/
        assertEquals(capitalCities.get(0).getName(),"Seoul");
        assertEquals(capitalCities.get(0).getCountry(),"South Korea");
        assertEquals(capitalCities.get(0).getPopulation(),9981619);
        // print report
    }

    /**
     * 18. Integration test for all the capital cities in a continent organised by largest population to smallest.
     */

    @Test
    void testAllCapitalCitiesInAContinent() throws SQLException {
        // create array list
        ArrayList<CapitalCity> capitalCities = cctyrpt.getAllCapitalCitiesInAContinent();
        // check array list is null
        assertNotNull(capitalCities);
        /*Check expected data are correct or not*/
        assertEquals(capitalCities.get(0).getName(),"Mumbai (Bombay)");
        assertEquals(capitalCities.get(0).getCountry(),"India");
        assertEquals(capitalCities.get(0).getPopulation(),10500000);
        // print report
    }

    /**
     * 19. Integration test for all the capital cities in a region organised by largest population to smallest.
     */

    @Test
    void testAllCapitalCitiesInARegion() throws SQLException {
        // create array list
        ArrayList<CapitalCity> capitalCities = cctyrpt.getAllCapitalCitiesInARegion();
        // check array list is null
        assertNotNull(capitalCities);
        /*Check expected data are correct or not*/
        assertEquals(capitalCities.get(0).getName(),"Seoul");
        assertEquals(capitalCities.get(0).getCountry(),"South Korea");
        assertEquals(capitalCities.get(0).getPopulation(),9981619);
        // print report
    }

    /**
     * 20. Integration test for the top N populated capital cities in the world where N is provided by the user.
     */

    @Test
    void testTopNPopulatedCapitalCitiesInTheWorld() throws SQLException {
        // create array list
        ArrayList<CapitalCity> capitalCities = cctyrpt.getTopNPopulatedCapitalCitiesInTheWorld();
        // check array list is null
        assertNotNull(capitalCities);
        /*Check expected data are correct or not*/
        assertEquals(capitalCities.get(0).getName(),"Seoul");
        assertEquals(capitalCities.get(0).getCountry(),"South Korea");
        assertEquals(capitalCities.get(0).getPopulation(),9981619);
        // print report
    }

    /**
     * 21. Integration test for the top N populated capital cities in a continent where N is provided by the user.
     */
    @Test
    void testTNPCapitalCitiesInAContinent() throws SQLException {
        // create array list
        ArrayList<CapitalCity> capitalCities = cctyrpt.getTNPCapitalCitiesInAContinent();
        // check array list is null
        assertNotNull(capitalCities);
        /*Check expected data are correct or not*/
        assertEquals(capitalCities.get(0).getName(),"Mumbai (Bombay)");
        assertEquals(capitalCities.get(0).getCountry(),"India");
        assertEquals(capitalCities.get(0).getPopulation(),10500000);
        // print report
    }

    /**
     * 22. Integration test for the top N populated capital cities in a region where N is provided by the user.
     */

    @Test
    void testgetTNPCapitalCitiesInARegion() throws SQLException {
        // create array list
        ArrayList<CapitalCity> capitalCities = cctyrpt.getTNPCapitalCitiesInARegion();
        // check array list is null
        assertNotNull(capitalCities);
        /*Check expected data are correct or not*/
        assertEquals(capitalCities.get(0).getName(),"Seoul");
        assertEquals(capitalCities.get(0).getCountry(),"South Korea");
        assertEquals(capitalCities.get(0).getPopulation(),9981619);
        // print report
    }

    /**
     * 23. Integration test for The population of people, people living in cities, and people not living in cities in each continent.
     */

    @Test
    void testgetpopulationoinacontinent() throws SQLException {
        // create array list
        ArrayList<Population> populations = poprpt.getpopulationoinacontinent();
        // check array list is null
        assertNotNull(populations);
        /*Check expected data are correct or not*/
        assertEquals(populations.get(0).getName(),"North America");
        assertEquals(populations.get(0).getPopulation(),482993000);
        assertEquals(populations.get(0).getPopInCity(),168250381);
        assertEquals(populations.get(0).getPopNotInCity(),314742619);
        // print report
    }

    /**
     * 24. Integration test for The population of people, people living in cities, and people not living in cities in each region.
     */

    @Test
    void testgetpopulationoinregion() throws SQLException {
        // create array list
        ArrayList<Population> populations = poprpt.getpopulationoinregion();
        // check array list is null
        assertNotNull(populations);
        /*Check expected data are correct or not*/
        assertEquals(populations.get(0).getName(),"Caribbean");
        assertEquals(populations.get(0).getPopulation(),38140000);
        assertEquals(populations.get(0).getPopInCity(),11067550);
        assertEquals(populations.get(0).getPopNotInCity(),27072450);
        // print report
    }





}
