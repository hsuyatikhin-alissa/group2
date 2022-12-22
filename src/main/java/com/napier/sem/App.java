package com.napier.sem;

import java.sql.*;

import java.util.ArrayList;

public class App
{
    public static void main(String[] args)
    {
        DBConnect dbcon = new DBConnect();
        // Connect to database
        dbcon.connect();

        /**
         * 1. All the country in the world organised by largest population to smallest.
         */
        // Create new Application
        AllCountriesInWorld ctrwo = new AllCountriesInWorld();
        // Connect to database
        ctrwo.setCon(dbcon.getCon());
        ArrayList<Country> cctrwo = ctrwo.getAllCountries();
        // Extract country information
        ctrwo.printCountries(cctrwo);

        /**
         * 11. All the cities in a district organised by largest population to smallest.
         */
        AllCitiesInADistrict cdist = new AllCitiesInADistrict();
        cdist.setCon(dbcon.getCon());
        ArrayList<City> ccdist= cdist.getAllCities();
        cdist.printCities(ccdist);


        /**
         * 15. The top N populated cities in a country where N is provided by the user.
         */
        TopNPopulatedCitiesInACountry tcntry = new TopNPopulatedCitiesInACountry();
        tcntry.setCon(dbcon.getCon());
        ArrayList<City> tccntry = tcntry.getAllCities();
        tcntry.printCities(tccntry);


        /**
         * 16. The top N populated cities in a district where N is provided by the user.
         *
         */
        TopNPopulatedCitiesInADistrict tcdist = new TopNPopulatedCitiesInADistrict();
        tcdist.setCon(dbcon.getCon());
        ArrayList<City> tccdist = tcdist.getAllCities();
        tcdist.printCities(tccdist);
    }

}
