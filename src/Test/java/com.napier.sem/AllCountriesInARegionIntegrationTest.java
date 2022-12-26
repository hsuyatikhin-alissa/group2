package com.napier.sem;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class AllCountriesInARegionIntegrationTest {
    static AllCountriesInARegion creg;
    static DBConnect db;

    @BeforeAll
    static void init() {
        creg = new AllCountriesInARegion();
        db = new DBConnect();
        creg.setCon(db.getCon());
    }

    @Test
    void printCountriesInARegion() {
        ArrayList<Country> ctry = new ArrayList<Country>();
        creg.printCountries(ctry);
    }

}