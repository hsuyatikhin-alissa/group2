package com.napier.sem;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

public class AllCountriesInWorldIntegrationTest {
    static AllCountriesInWorld cntrywd;
    static DBConnect db;

    @BeforeAll
    static void init() {
        cntrywd = new AllCountriesInWorld();
        db = new DBConnect();
        cntrywd.setCon(db.getCon());
    }

    @Test
    void printCountries() {
        ArrayList<Country> cntry = new ArrayList<Country>();
        cntrywd.printCountries(cntry);
    }
}
