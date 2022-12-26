package com.napier.sem;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import java.sql.SQLException;
import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class AllCitiesInAContinentIntegrationTest {
    static AllCitiesInAContinent ccon;
    static DBConnect db;

    @BeforeAll
    static void init() {
        ccon = new AllCitiesInAContinent();
        db = new DBConnect();
        db.connect("Localhost:33060", 30000);
        ccon.setCon(db.getCon());
    }
    @Test
    void testCities() throws SQLException {
        // create array list
        ArrayList<City> cities = ccon.getAllCitiesInAContinent();
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
}
