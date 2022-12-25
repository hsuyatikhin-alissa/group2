package com.napier.sem;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

public class TopNPopulatedCitiesInACountryIntegrationTest {
    static TopNPopulatedCitiesInACountry topNCtyCntry;
    static DBConnect db;

    @BeforeAll
    static void init() {
        topNCtyCntry = new TopNPopulatedCitiesInACountry();
        db = new DBConnect();
        topNCtyCntry.setCon(db.getCon());
    }

    @Test
    void printCountries() {
        ArrayList<City> cty = new ArrayList<City>();
        topNCtyCntry.printCities(cty);
    }
}
