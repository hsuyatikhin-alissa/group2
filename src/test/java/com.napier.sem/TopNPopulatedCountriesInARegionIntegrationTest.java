package com.napier.sem;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class TopNPopulatedCountriesInARegionIntegrationTest {
    static TopNPopulatedCountriesInARegion ccon;
    static DBConnect db;

    @BeforeAll
    static void init() {
        ccon = new TopNPopulatedCountriesInARegion();
        db = new DBConnect();
        ccon.setCon(db.getCon());
    }

    @Test
    void printCountriesInARegion() {
        ArrayList<Country> ctry = new ArrayList<Country>();
        ccon.printCountries(ctry);
    }

}