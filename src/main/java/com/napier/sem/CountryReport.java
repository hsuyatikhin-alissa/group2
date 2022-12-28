package com.napier.sem;

import java.sql.*;
import java.util.ArrayList;

public class CountryReport {

    /**
     * Connection to MySQL database.
     */
    private Connection con;

    public void setCon(Connection con) {
        this.con = con;
    }

    private String continent = "Asia"; //Assign Asia as user input continent.

    private String region = "Eastern Asia"; //Assign Eastern Asia as user input region.
    private int limit = 5; //Assign 5 as a limit

    /**
     * 1. All the countries in the world organised by largest population to smallest.
     */



    /**
     * 2. All the countries in a continent organised by largest population to smallest.
     */

    /**
     * Gets all the current countries in a continent.
     * @return A list of all countries in a continent, or null if there is an error.
     */
    public ArrayList<Country> getAllCountriesInAContinent()
    {
        try
        {
            // Create an SQL statement
            Statement stmt = con.createStatement();
            // Create string for SQL statement
            String strSelect =
                    "SELECT country.Code, country.Name, country.Continent, country.Region, country.Population, capitalCity.Name AS Capital "
                            + "FROM country "
                            + "JOIN city capitalCity ON capitalCity.ID = country.Capital "
                            + "WHERE country.Continent = '" + continent + "'\n"
                            + "ORDER BY country.Population DESC ";
            // Execute SQL statement
            ResultSet rset = stmt.executeQuery(strSelect);
            // Extract countries information
            ArrayList<Country> countries = new ArrayList<Country>();
            while (rset.next())
            {
                Country cntry = new Country();
                cntry.setCode(rset.getString(1));
                cntry.setName(rset.getString(2));
                cntry.setContinent(rset.getString(3));
                cntry.setRegion(rset.getString(4));
                cntry.setPopulation(rset.getInt(5));
                cntry.setCapital(rset.getString(6));
                countries.add(cntry);
            }
            return countries;
        }
        catch (Exception e)
        {
            System.out.println(e.getMessage());
            System.out.println("Failed to get city details");
            return null;
        }
    }


    /**
     * Prints a list of countries in a continent.
     * @param countries The list of countries in a continent to print.
     */
    public void printAllCountriesInAContinent(ArrayList<Country> countries)
    {
        if (countries == null)
        {
            System.out.println("No countries");
            return;
        }
        // Print header
        System.out.println("2. All the countries in " + continent + " organised by largest population to smallest.");
        System.out.println();
        System.out.println(String.format("%-5s %-45s %-25s %-35s %-25s %-25s", "Code", "Name", "Continent", "Region", "Population", "Capital"));
        // Loop over all countries in the list
        for (Country cntry : countries)
        {
            if (cntry == null)
                continue;
            String cntry_string =
                    String.format("%-5s %-45s %-25s %-35s %-25s %-25s",
                            cntry.getCode(), cntry.getName(), cntry.getContinent(), cntry.getRegion(), cntry.getPopulation(), cntry.getCapital());
            System.out.println(cntry_string);
        }
        System.out.println();
    }

    /**
     * 3. All the countries in a region organised by largest population to smallest.
     */

    /**
     * Gets all the countries in a region.
     * @return A list of all countries in a region, or null if there is an error.
     */
    public ArrayList<Country> getAllCountriesInARegion()
    {
        try
        {
            // Create an SQL statement
            Statement stmt = con.createStatement();
            // Create string for SQL statement
            String strSelect =
                    "SELECT country.Code, country.Name, country.Continent, country.Region, country.Population, country.Capital "
                            + "FROM country "
                            + "WHERE country.Region = '" + region + "'\n"
                            + "ORDER BY country.Population DESC ";
            // Execute SQL statement
            ResultSet rset = stmt.executeQuery(strSelect);
            // Extract countries information
            ArrayList<Country> countries = new ArrayList<Country>();
            while (rset.next())
            {
                Country cntry = new Country();
                cntry.setCode(rset.getString(1));
                cntry.setName(rset.getString(2));
                cntry.setContinent(rset.getString(3));
                cntry.setRegion(rset.getString(4));
                cntry.setPopulation(rset.getInt(5));
                cntry.setCapital(rset.getString(6));
                countries.add(cntry);
            }
            return countries;
        }
        catch (Exception e)
        {
            System.out.println(e.getMessage());
            System.out.println("Failed to get country details");
            return null;
        }
    }


    /**
     * Prints a list of countries.
     * @param countries The list of countries to print.
     */
    public void printAllCountriesInARegion(ArrayList<Country> countries)
    {
        // Check Countries is not null
        if (countries == null)
        {
            System.out.println("No cities");
            return;
        }
        // Print header
        System.out.println("3. All the countries in " + region + ".");
        System.out.println(String.format("%-5s %-45s %-25s %-25s %-25s %-25s", "Code", "Name", "Continent", "Region", "Population", "Capital"));
        // Loop over all countries in the list
        for (Country cntry : countries)
        {
            if (cntry == null)
                continue;
            String cntry_string =
                    String.format("%-5s %-45s %-25s %-25s %-25s %-25s",
                            cntry.getCode(), cntry.getName(), cntry.getContinent(), cntry.getRegion(), cntry.getPopulation(), cntry.getCapital());
            System.out.println(cntry_string);
        }
        System.out.println();
    }










    /**
     * 4. The top N populated countries in the world where N is provided by the user.
     */

    /**
     * Gets all Top N populated countries in the world.
     * @return A list of all Top N populated countries in the world, or null if there is an error.
     */
    public ArrayList<Country> getTopNCountriesInTheWorld()
    {
        try
        {
            // Create an SQL statement
            Statement stmt = con.createStatement();
            // Create string for SQL statement
            String strSelect =
                    "SELECT country.Code, country.Name, country.Continent, country.Region, country.Population, capitalCity.Name AS Capital "
                            + "FROM country "
                            + "JOIN city capitalCity ON capitalCity.ID = country.Capital "
                            + "ORDER BY country.Population DESC "
                            + "LIMIT " + limit + ";";

            // Execute SQL statement
            ResultSet rset = stmt.executeQuery(strSelect);
            // Extract countries information
            ArrayList<Country> countries = new ArrayList<Country>();
            while (rset.next())
            {
                Country cntry = new Country();
                cntry.setCode(rset.getString(1));
                cntry.setName(rset.getString(2));
                cntry.setContinent(rset.getString(3));
                cntry.setRegion(rset.getString(4));
                cntry.setPopulation(rset.getInt(5));
                cntry.setCapital(rset.getString(6));
                countries.add(cntry);
            }
            return countries;
        }
        catch (Exception e)
        {
            System.out.println(e.getMessage());
            System.out.println("Failed to get city details");
            return null;
        }
    }


    /**
     * Prints a list of all Top N populated countries in the world.
     * @param countries The list of all Top N populated countries in the world.
     */
    public void printTopNCountriesInTheWorld(ArrayList<Country> countries)
    {
        // Check Countries is not null
        if (countries == null)
        {
            System.out.println("No countries");
            return;
        }
        // Print header
        System.out.println("4. The top " + limit + " populated countries in the world");
        System.out.println();
        System.out.println(String.format("%-5s %-45s %-25s %-35s %-25s %-25s", "Code", "Name", "Continent", "Region", "Population", "Capital"));
        // Loop over all countries in the list
        for (Country cntry : countries)
        {
            if (cntry == null)
                continue;
            String cntry_string =
                    String.format("%-5s %-45s %-25s %-35s %-25s %-25s",
                            cntry.getCode(), cntry.getName(), cntry.getContinent(), cntry.getRegion(), cntry.getPopulation(), cntry.getCapital());
            System.out.println(cntry_string);
        }
        System.out.println();
    }

    /**
     * 5. The top N populated countries in a continent where N is provided by the user.
     */

    /**
     * Gets all Top N populated countries in a continent.
     * @return A list of all Top N populated countries in a continent, or null if there is an error.
     */
    public ArrayList<Country> getTopNCountriesInAContinent()
    {
        try
        {
            // Create an SQL statement
            Statement stmt = con.createStatement();
            // Create string for SQL statement
            String strSelect =
                    "SELECT country.Code, country.Name, country.Continent, country.Region, country.Population, capitalCity.Name AS Capital "
                            + "FROM country "
                            + "JOIN city capitalCity ON capitalCity.ID = country.Capital "
                            + "WHERE country.Continent = '" + continent + "'\n"
                            + "ORDER BY country.Population DESC "
                            + "LIMIT " + limit + ";";

            // Execute SQL statement
            ResultSet rset = stmt.executeQuery(strSelect);
            // Extract countries information
            ArrayList<Country> countries = new ArrayList<Country>();
            while (rset.next())
            {
                Country cntry = new Country();
                cntry.setCode(rset.getString(1));
                cntry.setName(rset.getString(2));
                cntry.setContinent(rset.getString(3));
                cntry.setRegion(rset.getString(4));
                cntry.setPopulation(rset.getInt(5));
                cntry.setCapital(rset.getString(6));
                countries.add(cntry);
            }
            return countries;
        }
        catch (Exception e)
        {
            System.out.println(e.getMessage());
            System.out.println("Failed to get city details");
            return null;
        }
    }


    /**
     * Prints a list of all Top N populated countries in a continent.
     * @param countries The list of all Top N populated countries in a continent to print.
     */
    public void printTopNCountriesInAContinent(ArrayList<Country> countries)
    {
        // Check Countries is not null
        if (countries == null)
        {
            System.out.println("No countries");
            return;
        }
        // Print header
        System.out.println("5. The top " + limit + " populated countries in " + continent + ".");
        System.out.println();
        System.out.println(String.format("%-5s %-45s %-25s %-35s %-25s %-25s", "Code", "Name", "Continent", "Region", "Population", "Capital"));
        // Loop over all countries in the list
        for (Country cntry : countries)
        {
            if (cntry == null)
                continue;
            String cntry_string =
                    String.format("%-5s %-45s %-25s %-35s %-25s %-25s",
                            cntry.getCode(), cntry.getName(), cntry.getContinent(), cntry.getRegion(), cntry.getPopulation(), cntry.getCapital());
            System.out.println(cntry_string);
        }
        System.out.println();
    }


    /**
     * 6. The top N populated countries in a region where N is provided by the user.
     */

    /**
     * Gets all Top N populated countries in a region.
     * @return A list of all Top N populated countries in the world, or null if there is an error.
     */
    public ArrayList<Country> getTopNPopulatedCountriesInARegion()
    {
        try
        {
            // Create an SQL statement
            Statement stmt = con.createStatement();
            // Create string for SQL statement

            String strSelect =
                    "SELECT country.Code, country.Name, country.Continent, country.Region, country.Population, country.Capital "
                            + "FROM country "
                            + "WHERE country.Region = '" + region + "'\n"
                            + "ORDER BY country.Population DESC "
                            + "LIMIT " + limit + ";";


            // Execute SQL statement
            ResultSet rset = stmt.executeQuery(strSelect);
            // Extract countries information
            ArrayList<Country> countries = new ArrayList<Country>();
            while (rset.next())
            {
                Country cntry = new Country();
                cntry.setCode(rset.getString(1));
                cntry.setName(rset.getString(2));
                cntry.setContinent(rset.getString(3));
                cntry.setRegion(rset.getString(4));
                cntry.setPopulation(rset.getInt(5));
                cntry.setCapital(rset.getString(6));
                countries.add(cntry);
            }
            return countries;
        }
        catch (Exception e)
        {
            System.out.println(e.getMessage());
            System.out.println("Failed to get countries details");
            return null;
        }
    }


    /**
     * Prints a list of all Top N populated countries in a region.
     * @param countries The list of all Top N populated countries in a region to print.
     */
    public void printTopNPopulatedCountriesInARegion(ArrayList<Country> countries)
    {
        // Check Countries is not null
        if (countries == null)
        {
            System.out.println("No countries");
            return;
        }
        // Print header
        System.out.println("6. The top " + limit + " populated cities in " + region + ".");
        System.out.println(String.format("%-5s %-45s %-25s %-25s %-25s %-25s", "Code", "Name", "Continent", "Region", "Population", "Capital"));
        // Loop over all countries in the list
        for (Country cntry : countries)

        {
            if (cntry == null)
                continue;

            String cntry_string =
                    String.format("%-5s %-45s %-25s %-25s %-25s %-25s",
                            cntry.getCode(), cntry.getName(), cntry.getContinent(), cntry.getRegion(), cntry.getPopulation(), cntry.getCapital());
            System.out.println(cntry_string);
        }
        System.out.println();
    }




}
