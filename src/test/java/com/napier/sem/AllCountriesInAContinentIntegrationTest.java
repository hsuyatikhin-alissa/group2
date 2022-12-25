package com.napier.sem;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class AllCountriesInAContinentIntegrationTest {
    static AllCountriesInAContinent ccon;
    static DBConnect db;

    @BeforeAll
    static void init() {
        ccon = new AllCountriesInAContinent();
        db = new DBConnect();
        ccon.setCon(db.getCon());
    }

    @Test
    void printCitiesInAContinent() {
        ArrayList<Country> cntry = new ArrayList<Country>();
        ccon.printCountries(cntry);
    }

}