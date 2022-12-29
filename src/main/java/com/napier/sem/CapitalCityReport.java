package com.napier.sem;

import java.sql.*;
import java.util.ArrayList;

public class CapitalCityReport {

    /**
     * Connection to MySQL database.
     */
    private Connection con;

    public void setCon(Connection con) {
        this.con = con;
    }

    /**
     * Variable declarations
     */
    private String continent = "Asia"; //Assign Asia as user input continent.
    private String region = "Eastern Asia"; //Assign Eastern Asia as user's input region

    private int limit = 5; //Assign 5 as a limit

    /**
     * 17. All the capital cities in the world organised by largest population to smallest.
     */

    /**
     * Get all the capital cities in the world organised by largest population to smallest.
     * @return A list of all the capital cities in the world organised by largest population to smallest, or null if there is an error.
     */

    public ArrayList<CapitalCity> getAllCapitalCitiesInTheWorld() {
        try {
            // Create an SQL statement
            Statement stmt = con.createStatement();
            // Create string for SQL statement
            String strSelect =
                    "SELECT city.Name, country.Name, city.Population "
                            + "FROM country, city  "
                            + "WHERE country.Capital = city.ID "
                            + "ORDER BY city.Population DESC ";
            // Execute SQL statement
            ResultSet rset = stmt.executeQuery(strSelect);
            // Extract all the capital cities in the world organised by largest population to smallest
            ArrayList<CapitalCity> capitalCities = new ArrayList<CapitalCity>();
            while (rset.next()) {
                CapitalCity ccty = new CapitalCity();
                ccty.setName(rset.getString(1));
                ccty.setCountry(rset.getString(2));
                ccty.setPopulation(rset.getInt(3));
                capitalCities.add(ccty);
            }
            return capitalCities;
        } catch (Exception e) {
            System.out.println(e.getMessage());
            System.out.println("Failed to get capital city details");
            return null;
        }
    }

    /**
     * All the capital cities in the world organised by largest population to smallest.
     */
    public void printAllCapitalCitiesInTheWorld(ArrayList<CapitalCity> capitalCities)
    {

        // Check cities is not null
        if (capitalCities == null)
        {
            System.out.println("No capital cities");
            return;
        }

        // Print header
        System.out.println();
        System.out.println("17. All the capital cities in the world organised by largest population to smallest.");
        System.out.println();

        System.out.println(String.format("%-40s %-55s %s", "Name", "Country", "Population"));
        System.out.println(" ");
        // Loop over all capitalcities in the list
        for (CapitalCity ccty : capitalCities)
        {
            if (ccty == null)
                continue;

            String ccty_string =
                    String.format("%-40s %-55s %s",
                            ccty.getName(), ccty.getCountry(), ccty.getPopulation());
            System.out.println(ccty_string);
        }
        System.out.println();
    }


    /**
     * 18. All the capital cities in a continent organised by largest population to smallest.
     */

    /**
     * Get all the capital cities in a continent organised by largest population to smallest.
     * @return A list of all the capital cities in a continent organised by largest population to smallest, or null if there is an error.
     */
    public ArrayList<CapitalCity> getAllCapitalCitiesInAContinent()
    {

        try
        {
            // Create an SQL statement
            Statement stmt = con.createStatement();
            // Create string for SQL statement
            String strSelect =
                    "SELECT city.Name, country.Name, city.Population "
                            + "FROM city, country "
                            + "WHERE city.CountryCode = country.Code "
                            + "AND country.continent = '" + continent + "'\n"
                            + "ORDER BY city.Population DESC ";
            // Execute SQL statement
            ResultSet rset = stmt.executeQuery(strSelect);
            // Extract all the capital cities in a continent organised by largest population to smallest
            ArrayList<CapitalCity> capitalCities = new ArrayList<CapitalCity>();
            while (rset.next())
            {
                CapitalCity ccty = new CapitalCity();
                ccty.setName(rset.getString(1));
                ccty.setCountry(rset.getString(2));
                ccty.setPopulation(rset.getInt(3));
                capitalCities.add(ccty);
            }
            return capitalCities;
        }
        catch (Exception e)
        {
            System.out.println(e.getMessage());
            System.out.println("Failed to get capital city details");
            return null;
        }
    }

    /**
     * Prints a list of capitalcities.
     * @param capitalCities The list of cities to print.
     */
    public void printAllCapitalCitiesInAContinent(ArrayList<CapitalCity> capitalCities)
    {

        // Check capital cities is not null
        if (capitalCities == null)
        {
            System.out.println("No capital cities");
            return;
        }

        // Print header
        System.out.println();
        System.out.println("18. All the capital cities in " + continent + " organised by largest population to smallest.");
        System.out.println();

        System.out.println(String.format("%-40s %-55s %s", "Name", "Country", "Population"));
        System.out.println(" ");
        // Loop over all capital cities in the list
        for (CapitalCity ccty : capitalCities)
        {
            if (ccty == null)
                continue;

            String ccty_string =
                    String.format("%-40s %-55s %s",
                            ccty.getName(), ccty.getCountry(), ccty.getPopulation());
            System.out.println(ccty_string);
        }
        System.out.println();
    }


    /**
     * 19. All the capital cities in a region organised by largest population to smallest.
     */

    /**
     * Get all the capital cities in a region organised by largest population to smallest.
     * @return A list of all the capital cities in a region organised by largest population to smallest, or null if there is an error.
     */
    public ArrayList<CapitalCity> getAllCapitalCitiesInARegion()
    {
        try
        {
            // Create an SQL statement
            Statement stmt = con.createStatement();
            // Create string for SQL statement
            String strSelect =
                    "SELECT city.Name, country.Name, city.Population "
                            + "FROM city, country "
                            + "WHERE city.CountryCode = country.Code "
                            + "AND country.region = '" + region + "'\n"
                            + "ORDER BY city.Population DESC ";
            // Execute SQL statement
            ResultSet rset = stmt.executeQuery(strSelect);
            // Extract all the capital cities in a region organised by largest population to smallest
            ArrayList<CapitalCity> capitalCities = new ArrayList<CapitalCity>();
            while (rset.next())
            {
                CapitalCity ccty = new CapitalCity();
                ccty.setName(rset.getString(1));
                ccty.setCountry(rset.getString(2));
                ccty.setPopulation(rset.getInt(3));
                capitalCities.add(ccty);
            }
            return capitalCities;
        }
        catch (Exception e)
        {
            System.out.println(e.getMessage());
            System.out.println("Failed to get capital city details");
            return null;
        }
    }

    /**
     * Prints a list of capitalcities.
     * @param capitalCities The list of cities to print.
     */
    public void printAllCapitalCitiesInARegion(ArrayList<CapitalCity> capitalCities)
    {

        // Check capital cities is not null
        if (capitalCities == null)
        {
            System.out.println("No capital cities");
            return;
        }

        // Print header
        System.out.println();
        System.out.println("19. All the capital cities in " + region + " organised by largest population to smallest.");
        System.out.println();

        System.out.println(String.format("%-40s %-55s %s", "Name", "Country", "Population"));
        System.out.println(" ");
        // Loop over all capital cities in the list
        for (CapitalCity ccty : capitalCities)
        {
            if (ccty == null)
                continue;

            String ccty_string =
                    String.format("%-40s %-55s %s",
                            ccty.getName(), ccty.getCountry(), ccty.getPopulation());
            System.out.println(ccty_string);
        }
        System.out.println();
    }


    /**
     * 20. The top N populated capital cities in the world where N is provided by the user.
     */


    /**
     * Gets top n populated capital cities in the world
     * @return A list of top n populated capital cities in the world
     */
    public ArrayList<CapitalCity> getTopNPopulatedCapitalCitiesInTheWorld()
    {
        try
        {
            // Create an SQL statement
            Statement stmt = con.createStatement();
            // Create string for SQL statement
            String strSelect =
                    "SELECT city.Name, country.Name, city.Population "
                            + "FROM country,city "
                            + "WHERE country.Capital = city.ID "
                            + "ORDER BY city.Population DESC "
                            + "LIMIT " + limit + ";";

            // Execute SQL statement
            ResultSet rset = stmt.executeQuery(strSelect);
            // Extract Top N populated capital city information
            ArrayList<CapitalCity> capitalCities = new ArrayList<CapitalCity>();
            while (rset.next())
            {
                CapitalCity ccty = new CapitalCity();
                ccty.setName(rset.getString(1));
                ccty.setCountry(rset.getString(2));
                ccty.setPopulation(rset.getInt(3));
                capitalCities.add(ccty);
            }
            return capitalCities;
        }
        catch (Exception e)
        {
            System.out.println(e.getMessage());
            System.out.println("Failed to get capital city details");
            return null;
        }
    }


    /**
     * Prints top n populated capital cities in the world
     * @param capitalCities
     */
    public void printTopNPopulatedCapitalCitiesInTheWorld(ArrayList<CapitalCity> capitalCities)
    {
        // Check capital cities is not null
        if (capitalCities == null)
        {
            System.out.println("No capital cities");
            return;
        }

        // Print header
        System.out.println();
        System.out.println("20. The Top " + limit + " Populated capital cities in the world");
        System.out.println();

        System.out.println(String.format("%-40s %-55s %s", "Name", "Country", "Population"));
        System.out.println(" ");
        // Loop over all capital cities in the list
        for (CapitalCity ccty : capitalCities)
        {
            if (ccty == null)
                continue;

            String ccty_string =
                    String.format("%-40s %-55s %s",
                            ccty.getName(), ccty.getCountry(), ccty.getPopulation());
            System.out.println(ccty_string);
        }
        System.out.println();
    }
    /**
     * 21. The top N populated capital cities in a continent where N is provided by the user.
     */
    public ArrayList<CapitalCity> getTNPCapitalCitiesInAContinent() {
        try {

            // Create an SQL statement
            Statement stmt = con.createStatement();
            // Create string for SQL statement
            String strSelect =
                    "SELECT city.Name, country.Name, city.Population "
                            + "FROM city "
                            + "JOIN country country "
                            + "ON country.Code = city.CountryCode "
                            + "WHERE country.Continent = '" + continent + "'\n"
                            + "ORDER BY city.Population DESC "
                            + "LIMIT " + limit + ";";

            // Execute SQL statement
            ResultSet rset = stmt.executeQuery(strSelect);
            // Extract city information
            ArrayList<CapitalCity> capitalCities = new ArrayList<CapitalCity>();
            while (rset.next()) {
                CapitalCity capcit = new CapitalCity();
                capcit.setName(rset.getString(1));
                capcit.setCountry(rset.getString(2));
//                capcit.setContinent(rset.getString(3));
                capcit.setPopulation(rset.getInt(3));
                capitalCities.add(capcit);
            }
            return capitalCities;
        } catch (Exception e) {
            System.out.println(e.getMessage());
            System.out.println("Failed to get city details");
            return null;
        }
    }

    /**
     * Prints a list of all the cities.
     *
     * @param capcities The list of all the cities in a region organised by largest population to smallest.
     */
    public void printTopNPopulatedCapitalCitiesInAContinent(ArrayList<CapitalCity> capcities) {
        // Check cities is not null
        if (capcities == null) {
            System.out.println("No cities");
            return;
        }
        // Print header
        System.out.println("21. All the capital cities in " + continent + " organised by largest population to smallest.\n");
        System.out.println(String.format("%-30s %-50s %s", "Name", "Country", "Population"));
        System.out.println();
        // Loop over all cities in the list
        for (CapitalCity capcit : capcities) {
            if (capcit == null)
                continue;

            String capcit_string =
                    String.format("%-30s %-50s %s",
                            capcit.getName(), capcit.getCountry(), capcit.getPopulation());
            System.out.println(capcit_string);
        }
        System.out.println();
    }

    /**
     * 22. The top N populated capital cities in a region where N is provided by the user.
     */
    public ArrayList<CapitalCity> getTNPCapitalCitiesInARegion() {
        try {

            // Create an SQL statement
            Statement stmt = con.createStatement();
            // Create string for SQL statement
            String strSelect =
                    "SELECT city.Name, country.Name, city.Population "
                            + "FROM city "
                            + "JOIN country country "
                            + "ON country.Code = city.CountryCode "
                            + "WHERE country.Region = '" + region + "'\n"
                            + "ORDER BY city.Population DESC "
                            + "LIMIT " + limit + ";";

            // Execute SQL statement
            ResultSet rset = stmt.executeQuery(strSelect);
            // Extract city information
            ArrayList<CapitalCity> capiCities = new ArrayList<CapitalCity>();
            while (rset.next()) {
                CapitalCity capcit = new CapitalCity();
                capcit.setName(rset.getString(1));
                capcit.setCountry(rset.getString(2));
                capcit.setPopulation(rset.getInt(3));
                capiCities.add(capcit);
            }
            return capiCities;
        } catch (Exception e) {
            System.out.println(e.getMessage());
            System.out.println("Failed to get capital city details");
            return null;
        }
    }

    /**
     * Prints a list of all the capital cities.
     *
     * @param capcities The list of all the cities in a region organised by largest population to smallest.
     */
    public void printTopNPopulatedCapitalCitiesInARegion(ArrayList<CapitalCity> capcities) {
        // Check cities is not null
        if (capcities == null) {
            System.out.println("No cities");
            return;
        }
        // Print header
        System.out.println("22. All the capital cities in " + region + " organised by largest population to smallest.\n");
        System.out.println(String.format("%-30s %-50s %s", "Name", "Country", "Population"));
        System.out.println();
        // Loop over all cities in the list
        for (CapitalCity capcit : capcities) {
            if (capcit == null)
                continue;

            String capcit_string =
                    String.format("%-30s %-50s %s",
                            capcit.getName(), capcit.getCountry(), capcit.getPopulation());
            System.out.println(capcit_string);
        }
        System.out.println();
    }

}
