package com.napier.sem;

import java.sql.*;

import java.util.ArrayList;

public class App
{

    public static void main(String[] args) {
        // Create an object to call AllCountriesInAContinent Class
        DBConnect dbcon = new DBConnect();
        // Connect to database
        dbcon.connect();

        /*All the countries in a continent organised by largest population to smallest.*/
        AllCountriesInAContinent ccon = new AllCountriesInAContinent();
        ccon.setCon(dbcon.getCon());
        // Get all countries information in a continent
        ArrayList<Country> countriescon = ccon.getAllCountries();
        // Extract all countries information in a continent
        ccon.printCountries(countriescon);

        /*The top N populated countries in the world where N is provided by the user.*/
        TopNPopulatedCountriesintheworld tcwor = new TopNPopulatedCountriesintheworld();
        tcwor.setCon(dbcon.getCon());
        // Get all countries information in the world
        ArrayList<Country> countrieswor = tcwor.getAllCountries();
        // Extract all cities information in a continent
        tcwor.printCountries(countrieswor);

        /*The top N populated countries in a continent where N is provided by the user.*/
        TopNPopulatedCountriesinacontinent tccon = new TopNPopulatedCountriesinacontinent();
        tccon.setCon(dbcon.getCon());
        // Get all countries information in a continent
        ArrayList<Country> countriesncon = tccon.getAllCountries();
        // Extract all countries information in a continent
        tccon.printCountries(countriesncon);

        /*All the cities in a country organised by largest population to smallest.*/
        AllCitiesInACountry crc = new AllCitiesInACountry();
        crc.setCon(dbcon.getCon());
        // Get all cities information in a country
        ArrayList<City> citiescrc = crc.getAllCities();
        // Extract all cities information in a country
        crc.printCities(citiescrc);


    }
}