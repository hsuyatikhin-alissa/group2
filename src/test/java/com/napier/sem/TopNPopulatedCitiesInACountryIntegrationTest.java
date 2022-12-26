package com.napier.sem;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import java.sql.SQLException;

import java.util.ArrayList;
import static org.junit.jupiter.api.Assertions.*;

public class TopNPopulatedCitiesInACountryIntegrationTest {
    static TopNPopulatedCitiesInACountry topNCtyCntry;
    static DBConnect db;

    @BeforeAll
    static void init() {
        topNCtyCntry = new TopNPopulatedCitiesInACountry();
        db = new DBConnect();
        db.connect("Localhost:33060", 30000);
        topNCtyCntry.setCon(db.getCon());
    }

    @Test
    void printCountries() {
        ArrayList<City> cty = new ArrayList<City>();
        topNCtyCntry.printCities(cty);
    }
    @Test
    void testTopPopulatedCitiesInACountry() throws SQLException {
        // create array list
        ArrayList<City> cities = topNCtyCntry.getAllCities();
        // check array list is null
        assertNotNull(cities);
        /*Check expected data are correct or not*/
        assertEquals(cities.get(0).getName(),"Wien");
        assertEquals(cities.get(0).getCountry().getName(),"Austria");
        assertEquals(cities.get(0).getDistrict(),"Wien");
        assertEquals(cities.get(0).getPopulation(),1608144);
        // print report
    }
}
