package com.napier.sem;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import java.sql.SQLException;
import java.util.ArrayList;
import static org.junit.jupiter.api.Assertions.*;

public class TopNPopulatedCitiesInADistrictIntegrationTest {
    static TopNPopulatedCitiesInADistrict topNCtyDis;
    static DBConnect db;

    @BeforeAll
    static void init() {
        topNCtyDis = new TopNPopulatedCitiesInADistrict();
        db = new DBConnect();
        db.connect("Localhost:33060", 30000);
        topNCtyDis.setCon(db.getCon());
    }

//    @Test
//    void printCountries() {
//        ArrayList<City> cty = new ArrayList<City>();
//        topNCtyDis.printCities(cty);
//    }
    @Test
    void testTopPopulatedCitiesInACountry() throws SQLException {
        // create array list
        ArrayList<City> cities = topNCtyDis.getAllCities();
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
