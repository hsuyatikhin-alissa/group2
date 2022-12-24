package com.napier.sem;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

public class TestAppIntegration {
    static com.napier.sem.AllCountriesInWorld app;
//    // Define DatabaseConnection object
//    static DBConnect con;

//    @BeforeAll
//    static void init()
//    {
//        DBConnect dbcon = new DBConnect();
//        dbcon.connect("localhost:33060", 30000);
//    }
    @BeforeAll
    static void init() {
        app = new com.napier.sem.AllCountriesInWorld();
        app.connect("localhost:33060", 30000);
    }


//    @BeforeAll
//    static void init()
//    {
//        app = new App();
//        app.connect("localhost:33060", 30000);
//
//    }

    @Test
    void printCountries() {
        ArrayList<Country> countries = new ArrayList<>();
        app.printCountries(countries);
    }

//    @Test
//    void testGetCountry()
//    {
//        Country cntry = app.getCountry("ABW");
//        assertEquals(cntry.Code, "ABW");
//        assertEquals(cntry.Name, "Aruba");
//        assertEquals(cntry.Continent, "North America");
//        assertEquals(cntry.Region, "Caribbean");
//        assertEquals(cntry.Population, 103000);
//        assertEquals(cntry.Capital, 129);
//    }

}
