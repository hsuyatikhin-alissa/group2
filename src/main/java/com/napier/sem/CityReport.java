package com.napier.sem;

import java.sql.*;
import java.util.ArrayList;

public class CityReport {

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

    private String country = "United States"; //Assign United States as user input country.

    private String region = "Eastern Asia"; //Assign Eastern Asia as user's input region
    private int limit = 5; //Assign 5 as a limit


    /**
     * 7. All the cities in the world organised by largest population to smallest.
     */

    /**
     * Gets all cities in the world
     * @return A list of all cities in the world ordered by population
     */
    public ArrayList<City> getAllCitiesInTheWorld()
    {
        try
        {
            // Create an SQL statement
            Statement stmt = con.createStatement();
            // Create string for SQL statement
            String strSelect =
                    "SELECT city.Name, city.CountryCode, city.Population "
                            + "FROM city, country "
                            + "WHERE city.CountryCode = country.Code "
                            + "ORDER BY city.Population DESC";
            // Execute SQL statement
            ResultSet rset = stmt.executeQuery(strSelect);
            // Extract employee information
            ArrayList<City> cities = new ArrayList<City>();
            while (rset.next())
            {
                City cty = new City();
                cty.setName(rset.getString("Name"));
                cty.setCountryCode(rset.getString("CountryCode"));
                cty.setPopulation(rset.getInt("Population"));
                cities.add(cty);
            }
            return cities;
        }
        catch (Exception e)
        {
            System.out.println(e.getMessage());
            System.out.println("Failed to get city details");
            return null;
        }
    }


    /**
     * Prints all the cities
     * @param cities to print.
     */
    public void printAllCitiesInTheWorld(ArrayList<City> cities)
    {
        // Check Cities is not null
        if (cities == null)
        {
            System.out.println("No cities");
            return;
        }
        // Print header
        System.out.println("7. All the cities in the world organized by population");
        System.out.println(String.format("%-50s %-30s %s", "Name", "CountryCode", "Population"));
        // Loop over all cities in the list
        for (City cty : cities)
        {
            if (cty == null)
                continue;
            String cty_string =
                    String.format("%-50s %-30s %s",
                            cty.getName(), cty.getCountryCode(), cty.getPopulation());
            System.out.println(cty_string);
        }
        System.out.println();
    }


    /**
     * 8. All the cities in a continent organised by largest population to smallest.
     */

    /**
     * Get all the cities in a continent organised by largest population to smallest.
     * @return A list of all the cities in a continent organised by largest population to smallest, or null if there is an error.
     */
    public ArrayList<City> getAllCitiesInAContinent()
    {

        try
        {
            // Create an SQL statement
            Statement stmt = con.createStatement();
            // Create string for SQL statement
            String strSelect =
                    "SELECT city.Name, country.Name, country.Continent, city.District, city.Population "
                            + "FROM city, country "
                            + "WHERE city.CountryCode = country.Code && country.Continent = '" + continent + "'\n"
                            + "ORDER BY city.Population DESC ";
            // Execute SQL statement
            ResultSet rset = stmt.executeQuery(strSelect);
            // Extract all the cities in a continent organised by largest population to smallest
            ArrayList<City> cities = new ArrayList<City>();
            while (rset.next())
            {
                City cty = new City();
                Country cntry = new Country();
                cty.setName(rset.getString(1));
                cntry.setName(rset.getString(2));
                cntry.setContinent(rset.getString(3));
                cty.setDistrict(rset.getString(4));
                cty.setPopulation(rset.getInt(5));
                cty.setCountry(cntry);
                cities.add(cty);
            }
            return cities;
        }
        catch (Exception e)
        {
            System.out.println(e.getMessage());
            System.out.println("Failed to get city details");
            return null;
        }
    }


    /**
     * Prints a list of cities.
     * @param cities The list of cities to print.
     */
    public void printAllCitiesInAContinent(ArrayList<City> cities)
    {

        // Check cities is not null
        if (cities == null)
        {
            System.out.println("No cities");
            return;
        }

        // Print header
        System.out.println();
        System.out.println("8. All the cities in " + continent + " organised by largest population to smallest.");
        System.out.println();

        System.out.println(String.format("%-30s %-30s %-20s %-20s %s", "Name", "Country", "Continent", "District", "Population"));
        System.out.println(" ");
        // Loop over all cities in the list
        for (City cty : cities)
        {
            if (cty == null)
                continue;

            String cty_string =
                    String.format("%-30s %-30s %-20s %-20s %s",
                            cty.getName(), cty.getCountry().getName(), cty.getCountry().getContinent(), cty.getDistrict(), cty.getPopulation());
            System.out.println(cty_string);
        }
        System.out.println();
    }




    /**
     * 9. All the cities in a region organised by largest population to smallest.
     */

    /**
     * Gets all the cities in a region organised by largest population to smallest.
     * @return A list of all the cities in a region organised by largest population to smallest.
     */
    public ArrayList<City> getAllCitiesInARegion()
    {
        try
        {

            // Create an SQL statement
            Statement stmt = con.createStatement();
            // Create string for SQL statement
            String strSelect =
                    "SELECT city.Name, country.Name, country.Region, city.District, city.Population "
                            + "FROM city "
                            + "JOIN country country "
                            + "ON country.Code = city.CountryCode "
                            + "WHERE country.Region = '" + region + "'\n"
                            + "ORDER BY city.Population DESC ";

            // Execute SQL statement
            ResultSet rset = stmt.executeQuery(strSelect);
            // Extract city information
            ArrayList<City> cities = new ArrayList<City>();
            while (rset.next())
            {
                City cty = new City();
                Country cntry = new Country();
                cty.setName(rset.getString(1));
                cntry.setName(rset.getString(2));
                cntry.setRegion(rset.getString(3));
                cty.setDistrict(rset.getString(4));
                cty.setPopulation(rset.getInt(5));
                cty.setCountry(cntry);
                cities.add(cty);
            }
            return cities;
        }
        catch (Exception e)
        {
            System.out.println(e.getMessage());
            System.out.println("Failed to get city details");
            return null;
        }
    }


    /**
     * Prints a list of all the cities.
     * @param cities The list of all the cities in a region organised by largest population to smallest.
     */
    public void printAllCitiesInARegion(ArrayList<City> cities)
    {
        // Check cities is not null
        if (cities == null)
        {
            System.out.println("No cities");
            return;
        }
        // Print header
        System.out.println("9. All the cities in " + region + " region organised by largest population to smallest.\n");
        System.out.println(String.format("%-30s %-30s %-50s %-30s %s", "Name", "Country", "Region", "District", "Population"));
        System.out.println();
        // Loop over all cities in the list
        for (City cty : cities)
        {
            if (cty == null)
                continue;

            String cty_string =
                    String.format("%-30s %-30s %-50s %-30s %s",
                            cty.getName(), cty.getCountry().getName(), cty.getCountry().getRegion(), cty.getDistrict(), cty.getPopulation());
            System.out.println(cty_string);
        }
        System.out.println();
    }



    /**
     * 10. All the cities in a country organised by largest population to smallest.
     */


    /**
     * Gets all cities in a country.
     * @return A list of all cities in a country, or null if there is an error.
     */
    public ArrayList<City> getAllCitiesInACountry()
    {
        try
        {
            // Create an SQL statement
            Statement stmt = con.createStatement();
            // Create string for SQL statement
            String strSelect =
                    "SELECT city.Name, country.Name, country.Continent, city.District, city.Population "
                            + "FROM city, country "
                            + "WHERE city.CountryCode = country.Code && country.Name = '" + country + "'\n"
                            + "ORDER BY city.Population DESC ";

            // Execute SQL statement
            ResultSet rset = stmt.executeQuery(strSelect);
            // Extract cities information
            ArrayList<City> cities = new ArrayList<City>();
            while (rset.next())
            {
                City cty = new City();
                Country cntry = new Country();
                cty.setName(rset.getString(1));
                cntry.setName(rset.getString(2));
                cntry.setContinent(rset.getString(3));
                cty.setDistrict(rset.getString(4));
                cty.setPopulation(rset.getInt(5));
                cty.setCountry(cntry);
                cities.add(cty);
            }
            return cities;
        }
        catch (Exception e)
        {
            System.out.println(e.getMessage());
            System.out.println("Failed to get city details");
            return null;
        }
    }


    /**
     * Prints a list of all cities in a country.
     * @param cities The list of all cities in a country to print.
     */
    public void printAllCitiesInACountry(ArrayList<City> cities)
    {
        // Check Countries is not null
        if (cities == null)
        {
            System.out.println("No cities");
            return;
        }

        // Print header
        System.out.println("10. All the cities in " + country + " organised by largest population to smallest.");
        System.out.println();
        System.out.println(String.format("%-40s %-35s %-20s %-30s %-25s", "Name", "Country", "Continent", "District", "Population"));
        // Loop over all cities in a country in the list
        for (City cty : cities)
        {
            if (cty == null)
                continue;
            String cty_string =
                    String.format("%-40s %-35s %-20s %-30s %-25s",
                            cty.getName(), cty.getCountry().getName(), cty.getCountry().getContinent(), cty.getDistrict(), cty.getPopulation());
            System.out.println(cty_string);
        }
        System.out.println();
    }







    /**
     * 11. All the cities in a district organised by largest population to smallest.
     */




    /**
     * 12. The top N populated cities in the world where N is provided by the user.
     */

    /**
     * Gets top n populated cities in the world
     * @return A list of top n populated cities in the world
     */
    public ArrayList<City> getTopNPopulatedCitiesInTheWorld()
    {
        try
        {

            // Create an SQL statement
            Statement stmt = con.createStatement();
            // Create string for SQL statement
            String strSelect =
                    "SELECT city.Name, country.Name, country.Region, city.District, city.Population "
                            + "FROM city "
                            + "JOIN country country "
                            + "ON country.Code = city.CountryCode "
                            + "ORDER BY city.Population DESC "
                            + "LIMIT " + limit + ";";

//            SELECT city.Name, country.Name, country.Continent, city.District, city.Population FROM city JOIN country country ON country.Code = city.CountryCode WHERE country.Continent = "Asia" ORDER BY Population DESC LIMIT 3;
            // Execute SQL statement
            ResultSet rset = stmt.executeQuery(strSelect);
            // Extract employee information
            ArrayList<City> cities = new ArrayList<City>();
            while (rset.next())
            {
                City cty = new City();
                Country cntry = new Country();
                cty.setName(rset.getString(1));
                cntry.setName(rset.getString(2));
                cntry.setRegion(rset.getString(3));
                cty.setDistrict(rset.getString(4));
                cty.setPopulation(rset.getInt(5));
                cty.setCountry(cntry);
                cities.add(cty);
            }
            return cities;
        }
        catch (Exception e)
        {
            System.out.println(e.getMessage());
            System.out.println("Failed to get city details");
            return null;
        }
    }


    /**
     * Prints top n populated cities in the world
     * @param cities
     */
    public void printTopNPopulatedCitiesInTheWorld(ArrayList<City> cities)
    {
        // Check Cities is not null
        if (cities == null)
        {
            System.out.println("No cities");
            return;
        }
        // Print header
        System.out.println("12. The Top " + limit + " Populated cities in the world");
        System.out.println(String.format("%-30s %-30s %-30s %-20s %s", "Name", "Country", "Region", "District", "Population"));
        // Loop over all cities in the list
        for (City cty : cities)
        {
            if (cty == null)
                continue;

            String cty_string =
                    String.format("%-30s %-30s %-30s %-20s %s",
                            cty.getName(), cty.getCountry().getName(), cty.getCountry().getRegion(), cty.getDistrict(), cty.getPopulation());
            System.out.println(cty_string);
        }
        System.out.println();
    }

    /**
     * 13. The top N populated cities in a continent where N is provided by the user.
     */

    /**
     * Gets all the top N populated cities in a continent where N is provided by the user.
     * @return A list of the top N populated cities in a continent where N is provided by the user..
     */
    public ArrayList<City> getTopNCitiesInAContinent()
    {
        try
        {
            // Create an SQL statement
            Statement stmt = con.createStatement();
            // Create string for SQL statement
            String strSelect =
                    "SELECT city.Name, country.Name, country.Continent, city.District, city.Population "
                            + "FROM city "
                            + "JOIN country country "
                            + "ON country.Code = city.CountryCode "
                            + "WHERE country.Continent = '" + continent + "'\n"
                            + "ORDER BY city.Population DESC "
                            + "LIMIT " + limit + ";";

            // Execute SQL statement
            ResultSet rset = stmt.executeQuery(strSelect);
            // Extract the top N populated cities in a continent where N is provided by the user.
            ArrayList<City> cities = new ArrayList<City>();
            while (rset.next())
            {
                City cty = new City();
                Country cntry = new Country();
                cty.setName(rset.getString(1));
                cntry.setName(rset.getString(2));
                cntry.setContinent(rset.getString(3));
                cty.setDistrict(rset.getString(4));
                cty.setPopulation(rset.getInt(5));
                cty.setCountry(cntry);
                cities.add(cty);
            }
            return cities;
        }
        catch (Exception e)
        {
            System.out.println(e.getMessage());
            System.out.println("Failed to get city details");
            return null;
        }
    }


    /**
     * Prints a list of the top N populated cities.
     * @param cities The list of the top N populated cities in a continent where N is provided by the user.
     */
    public void printTopNCitiesInAContinent(ArrayList<City> cities)
    {
        // Check cities is not null
        if (cities == null)
        {
            System.out.println("No cities");
            return;
        }

        // Print header
        System.out.println("13. The top " + limit + " populated cities in " + continent + ".");
        System.out.println();

        System.out.println(String.format("%-30s %-30s %-20s %-20s %s", "Name", "Country", "Continent", "District", "Population"));
        System.out.println();
        // Loop over all cities in the list
        for (City cty : cities)
        {
            if (cty == null)
                continue;

            String cty_string =
                    String.format("%-30s %-30s %-20s %-20s %s",
                            cty.getName(), cty.getCountry().getName(), cty.getCountry().getContinent(), cty.getDistrict(), cty.getPopulation());
            System.out.println(cty_string);
        }
        System.out.println();
    }




    /**
     * 14. The top N populated cities in a region where N is provided by the user.
     */

    /**
     * Gets the top N populated cities in a region where N is provided by the user.
     * @return A list of the top N populated cities in a region where N is provided by the user.
     */
    public ArrayList<City> getTopNCitiesInARegion()
    {
        try
        {
            // Create an SQL statement
            Statement stmt = con.createStatement();
            // Create string for SQL statement
            String strSelect =
                    "SELECT city.Name, country.Name, country.Region, city.District, city.Population "
                            + "FROM city "
                            + "JOIN country country "
                            + "ON country.Code = city.CountryCode "
                            + "WHERE country.Region = '" + region + "'\n"
                            + "ORDER BY city.Population DESC "
                            + "LIMIT " + limit + ";";
            // Execute SQL statement
            ResultSet rset = stmt.executeQuery(strSelect);
            // Extract the top N populated cities in a region where N is provided by the user.
            ArrayList<City> cities = new ArrayList<City>();
            while (rset.next())
            {
                City cty = new City();
                Country cntry = new Country();
                cty.setName(rset.getString(1));
                cntry.setName(rset.getString(2));
                cntry.setRegion(rset.getString(3));
                cty.setDistrict(rset.getString(4));
                cty.setPopulation(rset.getInt(5));
                cty.setCountry(cntry);
                cities.add(cty);
            }
            return cities;
        }
        catch (Exception e)
        {
            System.out.println(e.getMessage());
            System.out.println("Failed to get city details");
            return null;
        }
    }


    /**
     * Prints a list of the top N populated cities in a region where N is provided by the user.
     * @param cities The top N populated cities in a region where N is provided by the user.
     */
    public void printTopNCitiesInARegion(ArrayList<City> cities)
    {
        // Check cities is not null
        if (cities == null)
        {
            System.out.println("No cities");
            return;
        }
        // Print header
        System.out.println("14. The top " + limit + " populated cities in " + region + " region.");
        System.out.println();
        System.out.println(String.format("%-30s %-30s %-30s %-20s %s", "Name", "Country", "Region", "District", "Population"));
        System.out.println();
        // Loop over all cities in the list
        for (City cty : cities)
        {
            if (cty == null)
                continue;

            String cty_string =
                    String.format("%-30s %-30s %-30s %-20s %s",
                            cty.getName(), cty.getCountry().getName(), cty.getCountry().getRegion(), cty.getDistrict(), cty.getPopulation());
            System.out.println(cty_string);
        }
        System.out.println();
    }




    /**
     * 15. The top N populated cities in a country where N is provided by the user.
     */




    /**
     * 16. The top N populated cities in a district where N is provided by the user.
     */






}
