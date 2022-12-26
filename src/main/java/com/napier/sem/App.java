package com.napier.sem;

import java.sql.*;

import java.util.ArrayList;

public class App
{
    public static void main(String[] args)
    {
        DBConnect dbcon = new DBConnect();
        // Connect to database
        if(args.length < 1){
            dbcon.connect("localhost:33060", 30000);
        }else{
            dbcon.connect(args[0], Integer.parseInt(args[1]));
        }

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

        /* 2 All the countries in a continent organised by largest population to smallest.*/
        AllCountriesInAContinent ccon = new AllCountriesInAContinent();
        ccon.setCon(dbcon.getCon());
        // Get all countries information in a continent
        ArrayList<Country> countriescon = ccon.getAllCountries();
        // Extract all countries information in a continent
        ccon.printCountries(countriescon);

        /**
         * 3. All the countries in a region organised by largest population to smallest.
         */

        AllCountriesInARegion acir = new AllCountriesInARegion();
        acir.setCon(dbcon.getCon());
        ArrayList<Country> countries = acir.getAllCountries();
        acir.printCountries(countries);

        /* 4 The top N populated countries in a continent where N is provided by the user.*/
        TopNPopulatedCountriesinacontinent tccon = new TopNPopulatedCountriesinacontinent();
        tccon.setCon(dbcon.getCon());
        // Get all countries information in a continent
        ArrayList<Country> countriesncon = tccon.getAllCountries();
        // Extract all countries information in a continent
        tccon.printCountries(countriesncon);

        /* 5 The top N populated countries in the world where N is provided by the user.*/
        TopNPopulatedCountriesintheworld tcwor = new TopNPopulatedCountriesintheworld();
        tcwor.setCon(dbcon.getCon());
        // Get all countries information in the world
        ArrayList<Country> countrieswor = tcwor.getAllCountries();
        // Extract all cities information in a continent
        tcwor.printCountries(countrieswor);

        /**
         * 6. Top N populated countries in a region organised by largest population to smallest.
         */

        TopNPopulatedCountriesInARegion tpcr = new TopNPopulatedCountriesInARegion();
        tpcr.setCon(dbcon.getCon());
        ArrayList<Country> Tcountries = tpcr.getAllCountries();
        tpcr.printCountries(Tcountries);

        /**
         * 7. All the cities in the world organised by largest population to smallest.
         */

        AllCitiesInTheWorld acit = new AllCitiesInTheWorld();
        acit.setCon(dbcon.getCon());
        ArrayList<City> cities = acit.getAllCities();
        acit.printCities(cities);

        /*8. All the cities in a continent organised by largest population to smallest.*/
        AllCitiesInAContinent cicon = new AllCitiesInAContinent();
        cicon.setCon(dbcon.getCon());
        // Get all cities information in a continent
        ArrayList<City> citiescon = cicon.getAllCitiesInAContinent();
        // Extract all cities information in a continent
        cicon.printCitiesInAContinent(citiescon);

        /*9. All the cities in a region organised by largest population to smallest.*/
        AllCitiesInARegion creg = new AllCitiesInARegion();
        creg.setCon(dbcon.getCon());
        // Get all cities information in a continent
        ArrayList<City> citiesreg = creg.getAllCitiesInARegion();
        // Extract all cities information in a continent
        creg.printCitiesInARegion(citiesreg);

        /* 10 All the cities in a country organised by largest population to smallest.*/
        AllCitiesInACountry crc = new AllCitiesInACountry();
        crc.setCon(dbcon.getCon());
        // Get all cities information in a country
        ArrayList<City> citiescrc = crc.getAllCities();
        // Extract all cities information in a country
        crc.printCities(citiescrc);

        /**
         * 11. All the cities in a district organised by largest population to smallest.
         */
        AllCitiesInADistrict cdist = new AllCitiesInADistrict();
        cdist.setCon(dbcon.getCon());
        ArrayList<City> ccdist= cdist.getAllCities();
        cdist.printCities(ccdist);

        /**
         * 12. Top N populated cities in the world organised by largest population to smallest.
         */

        TopNPopulatedCitiesInTheWorld tpcw = new TopNPopulatedCitiesInTheWorld();
        tpcw.setCon(dbcon.getCon());
        ArrayList<City> Tcities = tpcw.getAllCities();
        tpcw.printCities(Tcities);

        /*13. The top N populated cities in a continent where N is provided by the user.*/
        TopNPopulatedCitiesInAContinent tnccon = new TopNPopulatedCitiesInAContinent();
        tnccon.setCon(dbcon.getCon());
        // Get all cities information in a continent
        ArrayList<City> citiesncon = tnccon.getAllCities();
        // Extract all cities information in a continent
        tnccon.printCities(citiesncon);

        /*14. The top N populated cities in a region where N is provided by the user.*/
        TopNPopulatedCitiesInARegion tcreg = new TopNPopulatedCitiesInARegion();
        tcreg.setCon(dbcon.getCon());
        // Get all cities information in a continent
        ArrayList<City> citiesnreg = tcreg.getAllCities();
        // Extract all cities information in a continent
        tcreg.printCities(citiesnreg);

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