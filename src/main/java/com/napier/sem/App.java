package com.napier.sem;

import java.sql.*;
import java.util.ArrayList;

public class App {

    public static void main(String[] args)
    {

        /* Connect to database */

        DBConnect dbcon = new DBConnect();

        if(args.length < 1){
            dbcon.connect("localhost:33060", 3000);
        }else{
            dbcon.connect(args[0], Integer.parseInt(args[1]));
        }

        /* Create a CountryReport object */

        CountryReport cntryrpt = new CountryReport();
        cntryrpt.setCon(dbcon.getCon());

        /* Create a CityReport object */

        CityReport ctyrpt = new CityReport();
        ctyrpt.setCon(dbcon.getCon());

        /* Create a CapitalCityReport object */

        CapitalCityReport cctyrpt = new CapitalCityReport();
        cctyrpt.setCon(dbcon.getCon());

        /* Create a PopulationReport object */

        PopulationReport poprpt = new PopulationReport();
        poprpt.setCon(dbcon.getCon());

        /**
         * 1. All the countries in the world organised by largest population to smallest.
         */





        /**
         * 2. All the countries in a continent organised by largest population to smallest.
         */

        // Get all countries information in a continent
        ArrayList<Country> countriescon = cntryrpt.getAllCountriesInAContinent();
        // Extract all countries information in a continent
        cntryrpt.printAllCountriesInAContinent(countriescon);


        /**
         * 3. All the countries in a region organised by largest population to smallest.
         */

        // Get all countries information in a region
        ArrayList<Country> countriesreg = cntryrpt.getAllCountriesInARegion();
        // Extract all countries information in a region
        cntryrpt.printAllCountriesInARegion(countriesreg);

        /**
         * 4. The top N populated countries in the world where N is provided by the user.
         */

        // Get top N populated countries in the world information in a continent
        ArrayList<Country> countriestwor = cntryrpt.getTopNCountriesInTheWorld();
        // Extract top N populated countries in the world information in a continent
        cntryrpt.printTopNCountriesInTheWorld(countriestwor);


        /**
         * 5. The top N populated countries in a continent where N is provided by the user.
         */

        // Get top N populated countries in a continent information
        ArrayList<Country> countriestcon = cntryrpt.getTopNCountriesInAContinent();
        // Extract top N populated countries in a continent information
        cntryrpt.printTopNCountriesInAContinent(countriestcon);


        /**
         * 6. The top N populated countries in a region where N is provided by the user.
         */

        // Get top N populated countries in a region information
        ArrayList<Country> countriestreg = cntryrpt.getTopNPopulatedCountriesInARegion();
        // Extract top N populated countries in a region information
        cntryrpt.printTopNPopulatedCountriesInARegion(countriestreg);

        /**
         * 7. All the cities in the world organised by largest population to smallest.
         */

        // Get all cities information in the world
        ArrayList<City> citieswor = ctyrpt.getAllCitiesInTheWorld();
        // Extract all cities information in the world
        ctyrpt.printAllCitiesInTheWorld(citieswor);

        /**
         * 8. All the cities in a continent organised by largest population to smallest.
         */

        // Get all cities information in a continent
        ArrayList<City> citiescon = ctyrpt.getAllCitiesInAContinent();
        // Extract all cities information in a continent
        ctyrpt.printAllCitiesInAContinent(citiescon);

        /**
         * 9. All the cities in a region organised by largest population to smallest.
         */

        // Get all cities information in a continent
        ArrayList<City> citiesreg = ctyrpt.getAllCitiesInARegion();
        // Extract all cities information in a continent
        ctyrpt.printAllCitiesInARegion(citiesreg);

        /**
         * 10. All the cities in a country organised by largest population to smallest.
         */

        // Get all cities information in a continent
        ArrayList<City> citiescou = ctyrpt.getAllCitiesInACountry();
        // Extract all cities information in a continent
        ctyrpt.printAllCitiesInACountry(citiescou);

        /**
         * 11. All the cities in a district organised by largest population to smallest.
         */




        /**
         * 12. The top N populated cities in the world where N is provided by the user.
         */
        // Get top N populated cities in the world information
        ArrayList<City> citiestwor = ctyrpt.getTopNPopulatedCitiesInTheWorld();
        // Extract top N populated countries in the world information
        ctyrpt.printTopNPopulatedCitiesInTheWorld(citiestwor);

        /**
         * 13. The top N populated cities in a continent where N is provided by the user.
         */

        // Get all cities information in a continent
        ArrayList<City> citiesncon = ctyrpt.getTopNCitiesInAContinent();
        // Extract all cities information in a continent
        ctyrpt.printTopNCitiesInAContinent(citiesncon);

        /**
         * 14. The top N populated cities in a region where N is provided by the user.
         */

        // Get all cities information in a continent
        ArrayList<City> citiesnreg = ctyrpt.getTopNCitiesInARegion();
        // Extract all cities information in a continent
        ctyrpt.printTopNCitiesInARegion(citiesnreg);

        /**
         * 15. The top N populated cities in a country where N is provided by the user.
         */




        /**
         * 16. The top N populated cities in a district where N is provided by the user.
         */



    }



}
