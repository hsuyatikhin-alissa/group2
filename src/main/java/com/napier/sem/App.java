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


        /**
         * All the cities in the world organised by largest population to smallest.
         */

        AllCitiesInTheWorld acit = new AllCitiesInTheWorld();
        acit.setCon(dbcon.getCon());
        ArrayList<City> cities = acit.getAllCities();
        acit.printCities(cities);

        /**
         * All the countries in a region organised by largest population to smallest.
         */

        AllCountriesInARegion acir = new AllCountriesInARegion();
        acir.setCon(dbcon.getCon());
        ArrayList<Country> countries = acir.getAllCountries();
        acir.printCountries(countries);


        /**
         * top N populated cities in the world organised by largest population to smallest.
         */

        TopNPopulatedCitiesInTheWorld tpcw = new TopNPopulatedCitiesInTheWorld();
        tpcw.setCon(dbcon.getCon());
        ArrayList<City> Tcities = tpcw.getAllCities();
        tpcw.printCities(Tcities);

        /**
         * Top n populated countries organised by largest population to smallest.
         */

        TopNPopulatedCountriesInARegion tpcr = new TopNPopulatedCountriesInARegion();
        tpcr.setCon(dbcon.getCon());
        ArrayList<Country> Tcountries = tpcr.getAllCountries();
        tpcr.printCountries(Tcountries);


    }

}