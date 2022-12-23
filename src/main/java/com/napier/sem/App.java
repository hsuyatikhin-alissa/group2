package com.napier.sem;

import java.sql.*;

import java.util.ArrayList;

public class App
{


    public static void main(String[] args)
    {

        // Create an object to call AllCitiesInAContinent Class
        DBConnect dbcon = new DBConnect();
        // Connect to database
        dbcon.connect();



        /*All the cities in a continent organised by largest population to smallest.*/
        AllCitiesInAContinent ccon = new AllCitiesInAContinent();
        ccon.setCon(dbcon.getCon());
        // Get all cities information in a continent
        ArrayList<City> citiescon = ccon.getAllCitiesInAContinent();
        // Extract all cities information in a continent
        ccon.printCitiesInAContinent(citiescon);



        /*All the cities in a region organised by largest population to smallest.*/
        AllCitiesInARegion creg = new AllCitiesInARegion();
        creg.setCon(dbcon.getCon());
        // Get all cities information in a continent
        ArrayList<City> citiesreg = creg.getAllCitiesInARegion();
        // Extract all cities information in a continent
        creg.printCitiesInARegion(citiesreg);



        /*The top N populated cities in a continent where N is provided by the user.*/
        TopNPopulatedCitiesInAContinent tccon = new TopNPopulatedCitiesInAContinent();
        tccon.setCon(dbcon.getCon());
        // Get all cities information in a continent
        ArrayList<City> citiesncon = tccon.getAllCities();
        // Extract all cities information in a continent
        tccon.printCities(citiesncon);



        /*The top N populated cities in a region where N is provided by the user.*/
        TopNPopulatedCitiesInARegion tcreg = new TopNPopulatedCitiesInARegion();
        tcreg.setCon(dbcon.getCon());
        // Get all cities information in a continent
        ArrayList<City> citiesnreg = tcreg.getAllCities();
        // Extract all cities information in a continent
        tcreg.printCities(citiesnreg);


        //Disconnect from database.
        dbcon.disconnect();


    }

}