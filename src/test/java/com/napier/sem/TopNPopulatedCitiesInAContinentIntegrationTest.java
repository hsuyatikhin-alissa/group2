package com.napier.sem;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class TopNPopulatedCitiesInAContinentIntegrationTest {
    static TopNPopulatedCitiesInAContinent tcon;
    static DBConnect db;

    @BeforeAll
    static void init() {
        tcon = new TopNPopulatedCitiesInAContinent();
        db = new DBConnect();
        tcon.setCon(db.getCon());
    }

    @Test
    void printCitiesInAContinent() {
        ArrayList<City> cty = new ArrayList<City>();
        tcon.printCities(cty);
    }

}