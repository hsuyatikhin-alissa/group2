package com.napier.sem;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

public class TopNPopulatedCitiesInADistrictIntegrationTest {
    static TopNPopulatedCitiesInADistrict topNCtyDis;
    static DBConnect db;

    @BeforeAll
    static void init() {
        topNCtyDis = new TopNPopulatedCitiesInADistrict();
        db = new DBConnect();
        topNCtyDis.setCon(db.getCon());
    }

    @Test
    void printCountries() {
        ArrayList<City> cty = new ArrayList<City>();
        topNCtyDis.printCities(cty);
    }
}
