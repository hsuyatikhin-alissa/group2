package com.napier.sem;

import java.sql.*;

import java.util.ArrayList;

public class App
{


    public static void main(String[] args)
    {
        /**
         * All the country in the world organised by largest population to smallest.
         */
//        // Create new Application
//        AllCountriesInWorld ctrwo = new AllCountriesInWorld();
//        // Connect to database
//        ctrwo.connect();
//        ArrayList<Country> cctrwo = ctrwo.getAllCountries();
//        // Extract country information
//        ctrwo.printCountries(cctrwo);
//        // Disconnect from database
//        ctrwo.disconnect();    

        /**
         * All the cities in a district organised by largest population to smallest.
         */
//        //Create new Application
//        AllCitiesInADistrict cdist = new AllCitiesInADistrict();
//        // Connect to database
//        cdist.connect();
//        ArrayList<City> ccdist= cdist.getAllCities();
//        // Extract cities information
//        cdist.printCities(ccdist);
//        // Disconnect from database
//        cdist.disconnect();


        /**
         * The top N populated cities in a country where N is provided by the user.
         */
//        // Create new Application
//        TopNPopulatedCitiesInACountry tcntry = new TopNPopulatedCitiesInACountry();
//        // Connect to database
//        tcntry.connect();
//        ArrayList<City> tccntry = tcntry.getAllCities();
//        // Extract cities information
//        tcntry.printCities(tccntry);
//        // Disconnect from database
//        tcntry.disconnect();

        /**
         * The top N populated cities in a district where N is provided by the user.
         *
         */
        // Create new Application
        TopNPopulatedCitiesInADistrict tcdist = new TopNPopulatedCitiesInADistrict();
        // Connect to database
        tcdist.connect();
        ArrayList<City> tccdist = tcdist.getAllCities();
        // Extract cities information
        tcdist.printCities(tccdist);
        // Disconnect from database
        tcdist.disconnect();
    }

}
