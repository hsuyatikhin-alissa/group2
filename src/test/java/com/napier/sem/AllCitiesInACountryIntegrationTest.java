package com.napier.sem;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import java.sql.SQLException;
import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class AllCitiesInACountryIntegrationTest {
    static AllCitiesInACountry ccon;
    static DBConnect db;

    @BeforeAll
    static void init() {
        ccon = new AllCitiesInACountry();
        db = new DBConnect();
        db.connect("Localhost:33060", 30000);
        ccon.setCon(db.getCon());
    }

    @Test
    void testCities() throws SQLException {
        // create array list
        ArrayList<City> cities = ccon.getAllCities();
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
}