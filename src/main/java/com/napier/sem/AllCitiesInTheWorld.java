package com.napier.sem;

import java.sql.*;
import java.util.ArrayList;

public class AllCitiesInTheWorld {
    /**
     * Connection to MySQL database.
     */
    private Connection con;

    public void setCon(Connection con) {
        this.con = con;
    }
    /**
     * Gets all cities in the world
     * @return A list of all cities in the world ordered by population
     */
    public ArrayList<City> getAllCities()
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
    public void printCities(ArrayList<City> cities)
    {
        // Print header
        System.out.println("7. All the cities in the world organized by population");
        System.out.println(String.format("%-50s %-30s %s", "Name", "CountryCode", "Population"));
        // Loop over all cities in the list
        for (City cty : cities)
        {
            String cty_string =
                    String.format("%-50s %-30s %s",
                            cty.getName(), cty.getCountryCode(), cty.getPopulation());
            System.out.println(cty_string);
        }
        System.out.println();
    }
}
