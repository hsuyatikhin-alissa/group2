package com.napier.sem;

import java.sql.*;

import java.util.ArrayList;

public class App
{


    public static void main(String[] args)
    {

/*All the cities in a continent organised by largest population to smallest.*/

        // Create an object to call AllCitiesInAContinent Class
        AllCitiesInAContinent ccon = new AllCitiesInAContinent();

        // Connect to database
        ccon.connect();

        // Get all cities information in a continent
        ArrayList<City> cities = ccon.getAllCitiesInAContinent();

        // Extract all cities information in a continent
        ccon.printCitiesInAContinent(cities);

        // Disconnect from database
        ccon.disconnect();





/*All the cities in a region organised by largest population to smallest.*/

//        // Create an object to call AllCitiesInARegion Class
//        AllCitiesInARegion creg = new AllCitiesInARegion();
//
//        // Connect to database
//        creg.connect();
//
//        // Get all cities information in a region
//        ArrayList<City> ccreg = creg.getAllCitiesInARegion();
//
//        // Extract all cities information in a region
//        creg.printCitiesInARegion(ccreg);
//
//        // Disconnect from database
//        creg.disconnect();





/*The top N populated cities in a continent where N is provided by the user.*/

//        // Create an object to call TopNPopulatedCitiesInAContinent Class
//        TopNPopulatedCitiesInAContinent tcon = new TopNPopulatedCitiesInAContinent();
//
//        // Connect to database
//        tcon.connect();
//
//        //Get top N populated cities information in a continent
//        ArrayList<City> tccon = tcon.getAllCities();
//
//        // Extract top N populated cities information in a continent
//        tcon.printCities(tccon);
//
//        // Disconnect from database
//        tcon.disconnect();





/* The top N populated cities in a region where N is provided by the user.*/

//        // Create an object to call TopNPopulatedCitiesInARegion Class
//        TopNPopulatedCitiesInARegion treg = new TopNPopulatedCitiesInARegion();
//
//        // Connect to database
//        treg.connect();
//
//        //Get top N populated cities information in a region
//        ArrayList<City> tccreg = treg.getAllCities();
//
//        // Extract top N populated cities information in a region
//        treg.printCities(tccreg);
//
//        // Disconnect from database
//        treg.disconnect();

    }

}