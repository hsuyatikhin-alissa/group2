package com.napier.sem;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class TopNPopulatedCitiesInTheWorldIntegrationTest {
    static TopNPopulatedCountriesInARegion tcon;
    static DBConnect db;

    @BeforeAll
    static void init() {
        tcon = new TopNPopulatedCountriesInARegion();
        db = new DBConnect();
        tcon.setCon(db.getCon());
    }

    @Test
    void printCountriesInARegion() {
        ArrayList<Country> ctry = new ArrayList<Country>();
        tcon.printCountries(ctry);
    }

}