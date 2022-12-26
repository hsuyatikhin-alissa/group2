package com.napier.sem;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import java.sql.SQLException;
import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class AllCountriesInAContinentIntegrationTest {
    static AllCountriesInAContinent ccon;
    static DBConnect db;

    @BeforeAll
    static void init() {
        ccon = new AllCountriesInAContinent();
        db = new DBConnect();
        db.connect("Localhost:33060", 30000);
        ccon.setCon(db.getCon());
    }

    void testCountry() throws SQLException {
        // create array list
        ArrayList<Country> countries = ccon.getAllCountries();
        // check array list is null
        assertNotNull(countries);
        /*Check expected data are correct or not*/
        assertEquals(countries.get(0).getCode(),"ABW");
        assertEquals(countries.get(0).getName(),"Aruba");
        assertEquals(countries.get(0).getContinent(),"North America");
        assertEquals(countries.get(0).getRegion(),"Caribbean");
        assertEquals(countries.get(0).getPopulation(),103000);
        assertEquals(countries.get(0).getCapital(),129);
        // print report
    }


}