package com.napier.sem;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import java.sql.SQLException;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class AllCitiesInADistrictIntegrationTest {
    static AllCitiesInADistrict ctydis;
    static DBConnect db;

    @BeforeAll
    static void init() {
        ctydis = new AllCitiesInADistrict();
        db = new DBConnect();
        db.connect("Localhost:33060", 30000);
        ctydis.setCon(db.getCon());
    }

//    @Test
//    void printCities() {
//        ArrayList<City> cty = new ArrayList<City>();
//        ctydis.printCities(cty);
//    }

    @Test
    void testTopPopulatedCitiesInACountry() throws SQLException {
        // create array list
        ArrayList<City> cities = ctydis.getAllCities();
        // check array list is null
        assertNotNull(cities);
        /*Check expected data are correct or not*/
        assertEquals(cities.get(0).getName(),"Amsterdam");
        assertEquals(cities.get(0).getCountry().getName(),"Netherlands");
        assertEquals(cities.get(0).getDistrict(),"Noord-Holland");
        assertEquals(cities.get(0).getPopulation(),731200);
        // print report
    }
}