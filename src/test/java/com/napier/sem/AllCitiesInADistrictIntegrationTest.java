package com.napier.sem;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class AllCitiesInADistrictIntegrationTest {
    static AllCitiesInADistrict ctydis;
    static DBConnect db;

    @BeforeAll
    static void init() {
        ctydis = new AllCitiesInADistrict();
        db = new DBConnect();
        ctydis.setCon(db.getCon());
    }

    @Test
    void printCities() {
        ArrayList<City> cty = new ArrayList<City>();
        ctydis.printCities(cty);
    }

}