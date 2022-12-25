package com.napier.sem;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class TopNPopulatedCountriesInAContinentIntegrationTest {
    static TopNPopulatedCountriesinacontinent tcon;
    static DBConnect db;

    @BeforeAll
    static void init() {
        tcon = new TopNPopulatedCountriesinacontinent();
        db = new DBConnect();
        tcon.setCon(db.getCon());
    }

    @Test
    void printCitiesInAContinent() {
        ArrayList<Country> countries = new ArrayList<Country>();
        tcon.printCountries(countries);
    }

}