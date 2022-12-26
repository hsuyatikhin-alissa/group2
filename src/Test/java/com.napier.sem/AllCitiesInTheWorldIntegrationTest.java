package com.napier.sem;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class AllCitiesInTheWorldIntegrationTest {
    static AllCitiesInTheWorld ccon;
    static DBConnect db;

    @BeforeAll
    static void init() {
        ccon = new AllCitiesInTheWorld();
        db = new DBConnect();
        ccon.setCon(db.getCon());
    }

    @Test
    void printCitiesInTheWorld() {
        ArrayList<City> cty = new ArrayList<City>();
        ccon.printCities(cty);
    }

}