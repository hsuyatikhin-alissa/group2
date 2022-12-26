package com.napier.sem;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import java.sql.SQLException;
import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class AllCitiesInARegionIntegrationTest {
    static AllCitiesInARegion creg;
    static DBConnect db;

    @BeforeAll
    static void init() {
        creg = new AllCitiesInARegion();
        db = new DBConnect();
        db.connect("Localhost:33060", 30000);
        creg.setCon(db.getCon());
    }
    @Test
    void testCities() throws SQLException {
        // create array list
        ArrayList<City> cities = creg.getAllCitiesInARegion();
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
