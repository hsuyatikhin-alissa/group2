package com.napier.sem;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class AllCitiesInAContinentIntegrationTest {
    static AllCitiesInAContinent ccon;
    static DBConnect db;

    @BeforeAll
    static void init() {
        ccon = new AllCitiesInAContinent();
        db = new DBConnect();
        ccon.setCon(db.getCon());
    }

    @Test
    void printCitiesInAContinent() {
        ArrayList<City> cty = new ArrayList<City>();
        ccon.printCitiesInAContinent(cty);
    }

}