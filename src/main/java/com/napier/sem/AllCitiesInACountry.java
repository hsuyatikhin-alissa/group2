package com.napier.sem;

import java.sql.*;
import java.util.ArrayList;

public class AllCitiesInACountry {

    /**
     * Connection to MySQL database.
     */
    private Connection con = null;

    /**
     * Connect to the MySQL database.
     */
    public void connect()
    {
        try
        {
            // Load Database driver
            Class.forName("com.mysql.cj.jdbc.Driver");
        }
        catch (ClassNotFoundException e)
        {
            System.out.println("Could not load SQL driver");
            System.exit(-1);
        }

        int retries = 10;
        for (int i = 0; i < retries; ++i)
        {
            System.out.println("Connecting to database...");
            try
            {
                // Wait a bit for db to start
                Thread.sleep(30000);
                // Connect to database
                con = DriverManager.getConnection("jdbc:mysql://db:3306/world?useSSL=false", "root", "example");
                System.out.println("Successfully connected");
                break;
            }
            catch (SQLException sqle)
            {
                System.out.println("Failed to connect to database attempt " + Integer.toString(i));
                System.out.println(sqle.getMessage());
            }
            catch (InterruptedException ie)
            {
                System.out.println("Thread interrupted? Should not happen.");
            }
        }
    }

    /**
     * Disconnect from the MySQL database.
     */
    public void disconnect()
    {
        if (con != null)
        {
            try
            {
                // Close connection
                con.close();
            }
            catch (Exception e)
            {
                System.out.println("Error closing connection to database");
            }
        }
    }

    /**
     * Gets all cities in a country.
     * @return A list of all cities in a country, or null if there is an error.
     */
    public ArrayList<City> getAllCities()
    {
        try
        {
            // Create an SQL statement
            Statement stmt = con.createStatement();
            // Create string for SQL statement
            String strSelect =
                    "SELECT city.Name, country.Name, country.Continent, city.District, city.Population "
                            + "FROM city, country "
                            + "WHERE city.CountryCode = country.Code "
                            + "ORDER BY country.Name ASC, city.Population DESC ";
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
    public void printCities(ArrayList<City> cities)
    {
        // Print header
        System.out.println(String.format("%-30s %-30s %-20s %-20s %s", "Name", "Country", "Continent", "District", "Population"));
        // Loop over all cities in a country in the list
        for (City cty : cities)
        {
            String cty_string =
                    String.format("%-30s %-30s %-20s %-20s %s",
                            cty.getName(), cty.getCountry().getName(), cty.getCountry().getContinent(), cty.getDistrict(), cty.getPopulation());
            System.out.println(cty_string);
        }
    }


}