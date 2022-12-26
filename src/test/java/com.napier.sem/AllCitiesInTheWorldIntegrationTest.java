package com.napier.sem;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import java.sql.SQLException;
import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class AllCitiesInTheWorldIntegrationTest {
    static AllCitiesInTheWorld creg;
    static DBConnect db;

    @BeforeAll
    static void init() {
        creg = new AllCitiesInTheWorld();
        db = new DBConnect();
        db.connect("Localhost:33060", 3000);
        creg.setCon(db.getCon());
    }
    @Test
    void testCities() throws SQLException {
        // create array list
        ArrayList<City> cities = creg.getAllCities();
        // check array list is null
        assertNotNull(cities);
        /*Check expected data are correct or not*/
        assertEquals(cities.get(1).getName(),"Seoul");
        assertEquals(cities.get(1).getCountryCode(),"KOR");
        assertEquals(cities.get(1).getPopulation(),9981619);

    }
}
