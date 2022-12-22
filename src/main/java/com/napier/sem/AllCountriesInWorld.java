package com.napier.sem;

import java.sql.*;
import java.util.ArrayList;

public class AllCountriesInWorld {
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
     * All the countries in the world organised by largest population to smallest.
     */
    public ArrayList<Country> getAllCountries() {
        try {
            // Create an SQL statement
            Statement stmt = con.createStatement();
            // Create string for SQL statement
            String strSelect =
                    "SELECT country.Code, country.Name, country.Continent, country.Region, country.Population, country.Capital FROM country ORDER BY country.Population DESC";
            // Execute SQL statement
            ResultSet rset = stmt.executeQuery(strSelect);
            // Extract countries information
            ArrayList<Country> countries = new ArrayList<Country>();
            while (rset.next()) {
                Country cntry = new Country();
                cntry.setCode(rset.getString("Code"));
                cntry.setName(rset.getString("Name"));
                cntry.setContinent(rset.getString("Continent"));
                cntry.setRegion(rset.getString("Region"));
                cntry.setPopulation(rset.getInt("Population"));
                cntry.setCapital(rset.getInt("Capital"));
                countries.add(cntry);
            }
            return countries;
        } catch (Exception e) {
            System.out.println(e.getMessage());
            System.out.println("Failed to get country details");
            return null;
        }
    }

    /**
     * All the countries in the world organised by largest population to smallest.
     */
    public void printCountries(ArrayList<Country> countries) {
        // Print header
        System.out.println("All the countries in the world organised by largest population to smallest");
        System.out.println(String.format("%-15s %-50s %-20s %-35s %-20s %s", "Code", "Name", "Continent", "Region", "Population", "Capital"));
        // Loop over all employees in the list
        for (Country cntry : countries) {
            String cntry_string =
                    String.format("%-15s %-50s %-20s %-35s %-20s %s", cntry.getCode(), cntry.getName(), cntry.getContinent(), cntry.getRegion(), cntry.getPopulation(), cntry.getCapital());
            System.out.println(cntry_string);
        }
    }

}
