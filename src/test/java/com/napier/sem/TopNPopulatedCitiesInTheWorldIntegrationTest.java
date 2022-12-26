package com.napier.sem;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.sql.SQLException;
import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

class TopNPopulatedCitiesInTheWorldIntegrationTest {
    static TopNPopulatedCitiesInTheWorld creg;
    static DBConnect db;

    @BeforeAll
    static void init() {
        creg = new TopNPopulatedCitiesInTheWorld();
        db = new DBConnect();
        db.connect("Localhost:33060", 3000);
        creg.setCon(db.getCon());
    }
    @Test
    void testTopNCities() throws SQLException {
        // create array list
        ArrayList<City> cities = creg.getAllCities();
        // check array list is null
        assertNotNull(cities);
        /*Check expected data are correct or not*/
        assertEquals(cities.get(4).getName(),"Jakarta");
        assertEquals(cities.get(4).getCountry().getName(),"Indonesia");
        assertEquals(cities.get(4).getDistrict(),"Jakarta Raya");
        assertEquals(cities.get(4).getPopulation(),9604900);
    }

}
