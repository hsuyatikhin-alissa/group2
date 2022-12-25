package com.napier.sem;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class AllCitiesInARegionIntegrationTest {
    static AllCitiesInARegion creg;
    static DBConnect db;

    @BeforeAll
    static void init() {
        creg = new AllCitiesInARegion();
        db = new DBConnect();
        creg.setCon(db.getCon());
    }

    @Test
    void printCitiesInARegion() {
        ArrayList<City> cty = new ArrayList<City>();
        creg.printCitiesInARegion(cty);
    }

}