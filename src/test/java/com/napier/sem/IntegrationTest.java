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
        db.connect("Localhost:33060", 30000);

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




    /**
     * 3. Integration test for all the countries in a region organised by largest population to smallest.
     */




    /**
     * 4. Integration test for the top N populated countries in the world where N is provided by the user.
     */






    /**
     * 5. Integration test for the top N populated countries in a continent where N is provided by the user.
     */





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






}
