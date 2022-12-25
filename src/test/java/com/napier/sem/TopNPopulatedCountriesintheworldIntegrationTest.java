package com.napier.sem;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class TopNPopulatedCountriesintheworldIntegrationTest {
    static TopNPopulatedCountriesintheworld tcon;
    static DBConnect db;

    @BeforeAll
    static void init() {
        tcon = new TopNPopulatedCountriesintheworld();
        db = new DBConnect();
        tcon.setCon(db.getCon());
    }

    @Test
    void printCountiresintheworld() {
        ArrayList<Country> countries = new ArrayList<Country>();
        tcon.printCountries(countries);
    }

}