package com.napier.sem;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.sql.SQLException;
import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

class AllCountriesInARegionIntegrationTest {
    static AllCountriesInARegion creg;
    static DBConnect db;

    @BeforeAll
    static void init() {
        creg = new AllCountriesInARegion();
        db = new DBConnect();
        db.connect("Localhost:33060", 30000);
        creg.setCon(db.getCon());
    }
    @Test
    void testCountry() throws SQLException {
        // create array list
        ArrayList<Country> countries = creg.getAllCountries();
        // check array list is null
        assertNotNull(countries);
        /*Check expected data are correct or not*/
        assertEquals(countries.get(0).getCode(),"CHN");
        assertEquals(countries.get(0).getName(),"China");
        assertEquals(countries.get(0).getContinent(),"Asia");
        assertEquals(countries.get(0).getRegion(),"Eastern Asia");
        assertEquals(countries.get(0).getPopulation(),1277558000);
        assertEquals(countries.get(0).getCapital(),"Peking");
        // print report
    }
}
