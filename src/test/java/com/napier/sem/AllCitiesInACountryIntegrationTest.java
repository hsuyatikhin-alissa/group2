package com.napier.sem;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class AllCitiesInACountryIntegrationTest {
    static AllCitiesInACountry ccon;
    static DBConnect db;

    @BeforeAll
    static void init() {
        ccon = new AllCitiesInACountry();
        db = new DBConnect();
        ccon.setCon(db.getCon());
    }

    @Test
    void printCitiesInACountry() {
        ArrayList<City> cities = new ArrayList<City>();
        ccon.printCities(cities);
    }

}