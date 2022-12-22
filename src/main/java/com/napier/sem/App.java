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
        //AllCountriesInAContinent conn = new AllCountriesInAContinent();

        // Connect to database
        //conn.connect();

        //ArrayList<Country> countries = conn.getAllCountries();

        // Extract employee salary information
        //conn.printCountries(countries);

        // Disconnect from database
        //conn.disconnect();


     //The top N populated countries in a continent where N is provided by the user.

         //Create new Application
        //TopNPopulatedCountriesinacontinent treg = new TopNPopulatedCountriesinacontinent();
         //Connect to database
        //treg.connect();

        //ArrayList<Country> countries = treg.getAllCountries();

         //Extract employee salary information
        //treg.printCountries(countries);

         //Disconnect from database
        //treg.disconnect();


        //The top N populated countries in the world where N is provided by the user.

        //Create new Application
        //TopNPopulatedCountriesintheworld treg = new TopNPopulatedCountriesintheworld();
        //Connect to database
        //treg.connect();

        //ArrayList<Country> countries = treg.getAllCountries();

        //Extract employee salary information
        //treg.printCountries(countries);

        //Disconnect from database
        //treg.disconnect();


        //All the cities in a country organised by largest population to smallest.

        // Create new Application
        AllCitiesInACountry ccon = new AllCitiesInACountry();

        // Connect to database
        ccon.connect();

        ArrayList<City> cities = ccon.getAllCities();

        // Extract All the cities in a country information
        ccon.printCities(cities);

        // Disconnect from database
        ccon.disconnect();


    }

}