package com.napier.sem;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class TopNPopulatedCitiesInARegionIntegrationTest {
    static TopNPopulatedCitiesInARegion treg;
    static DBConnect db;

    @BeforeAll
    static void init() {
        treg = new TopNPopulatedCitiesInARegion();
        db = new DBConnect();
        treg.setCon(db.getCon());
    }

    @Test
    void printCitiesInAContinent() {
        ArrayList<City> cty = new ArrayList<City>();
        treg.printCities(cty);
    }

}