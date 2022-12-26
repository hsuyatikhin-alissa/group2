package com.napier.sem;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import java.sql.SQLException;
import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

public class AllCountriesInWorldIntegrationTest {
    static AllCountriesInWorld cntrywd;
    static DBConnect db;

    @BeforeAll
    static void init() {
        cntrywd = new AllCountriesInWorld();
        db = new DBConnect();
        db.connect("Localhost:33060", 30000);
        cntrywd.setCon(db.getCon());
    }

//    @Test
//    void printCountries() {
//        ArrayList<Country> cntry = new ArrayList<Country>();
//        cntrywd.printCountries(cntry);
//    }
//    @Test
    void testCountry() throws SQLException {
        // create array list
        ArrayList<Country> countries = cntrywd.getAllCountries();
        // check array list is null
        assertNotNull(countries);
        /*Check expected data are correct or not*/
        assertEquals(countries.get(0).getCode(),"CHN");
        assertEquals(countries.get(0).getName(),"China");
        assertEquals(countries.get(0).getContinent(),"Asia");
        assertEquals(countries.get(0).getRegion(),"Eastern Asia");
        assertEquals(countries.get(0).getPopulation(),1277558000);
        assertEquals(countries.get(0).getCapital(),1891);
        // print report
    }
}
