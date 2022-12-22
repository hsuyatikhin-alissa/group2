package com.napier.sem;

import java.sql.*;

import java.util.ArrayList;

public class App
{


    public static void main(String[] args)
    {

//    //All the countries in a continent organised by largest population to smallest.
//
        // Create new Application
        AllCountriesInAContinent conn = new AllCountriesInAContinent();

        // Connect to database
        conn.connect();

        ArrayList<Country> countries = conn.getAllCountries();

        // Extract employee salary information
        conn.printCountries(countries);

        // Disconnect from database
        conn.disconnect();

//        //The top N populated cities in a continent where N is provided by the user.
//
//        // Create new Application
//        TopNPopulatedCitiesInAContinent tcon = new TopNPopulatedCitiesInAContinent();
//
//        // Connect to database
//        tcon.connect();
//
//        ArrayList<City> tccon = tcon.getAllCities();
//
//        // Extract employee salary information
//        tcon.printCities(tccon);
//
//        // Disconnect from database
//        tcon.disconnect();

    // The top N populated cities in a region where N is provided by the user.

        // Create new Application
        //TopNPopulatedCitiesInARegion treg = new TopNPopulatedCitiesInARegion();
        // Connect to database
        //treg.connect();

        //ArrayList<City> tccreg = treg.getAllCities();

        // Extract employee salary information
        //treg.printCities(tccreg);

        // Disconnect from database
        //treg.disconnect();


    }

}