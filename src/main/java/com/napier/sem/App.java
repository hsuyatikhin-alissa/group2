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
//        // Extract employee salary information
//        ctrwo.printCountries(cctrwo);
//        // Disconnect from database
//        ctrwo.disconnect();

        /**
        * All the cities in a continent organised by largest population to smallest.
        */
//        // Create new Application
//        AllCitiesInAContinent ccon = new AllCitiesInAContinent();
//        // Connect to database
//        ccon.connect();
//        ArrayList<City> cities = ccon.getAllCities();
//        // Extract employee salary information
//        ccon.printCities(cities);
//        // Disconnect from database
//        ccon.disconnect();

        /**
         * All the cities in a region organised by largest population to smallest.
         */
//        // Create new Application
//        AllCitiesInARegion creg = new AllCitiesInARegion();
//        // Connect to database
//        creg.connect();
//        ArrayList<City> ccreg = creg.getAllCities();
//        // Extract cities information
//        creg.printCities(ccreg);
//        // Disconnect from database
//        creg.disconnect();

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
         * The top N populated cities in a continent where N is provided by the user.
         */
//        // Create new Application
//        TopNPopulatedCitiesInAContinent tcon = new TopNPopulatedCitiesInAContinent();
//        // Connect to database
//        tcon.connect();
//        ArrayList<City> tccon = tcon.getAllCities();
//        // Extract employee salary information
//        tcon.printCities(tccon);
//        // Disconnect from database
//        tcon.disconnect();

        /**
         * The top N populated cities in a region where N is provided by the user.
         */
//         Create new Application
//        TopNPopulatedCitiesInARegion treg = new TopNPopulatedCitiesInARegion();
//         Connect to database
//        treg.connect();
//        ArrayList<City> tccreg = treg.getAllCities();
//         Extract employee salary information
//        treg.printCities(tccreg);
//         Disconnect from database
//        treg.disconnect();

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