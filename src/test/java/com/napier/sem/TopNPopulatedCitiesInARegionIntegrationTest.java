package com.napier.sem;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import java.sql.SQLException;
import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class TopNPopulatedCitiesInARegionIntegrationTest {
    static TopNPopulatedCitiesInARegion treg;
    static DBConnect db;

    @BeforeAll
    static void init() {
        treg = new TopNPopulatedCitiesInARegion();
        db = new DBConnect();
        db.connect("Localhost:33060", 30000);
        treg.setCon(db.getCon());
    }
    @Test
    void testCities() throws SQLException {
        // create array list
        ArrayList<City> cities = treg.getAllCities();
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
}
