package com.napier.sem;

import java.sql.*;
import java.util.ArrayList;

public class TopNPopulatedCitiesInACountry {
    private String name = "Austria";
    private int limit = 5;
    /**
     * Connection to MySQL database.
     */
    private Connection con;

    public void setCon(Connection con) {
        this.con = con;
    }

    /**
     * The top N populated cities in a country where N is provided by the user.
     * @return A list of all cities and country, or null if there is an error.
     */
    public ArrayList<City> getAllCities()
    {
        try
        {
            // Create an SQL statement
            Statement stmt = con.createStatement();
            // Create string for SQL statement
            String strSelect =
                    "SELECT city.Name, country.Name, city.District, city.Population "
                            + "FROM city "
                            + "JOIN country country "
                            + "ON country.Code = city.CountryCode "
                            + "WHERE country.Name = '" + name + "'\n"
                            + "ORDER BY city.Population DESC "
                            + "LIMIT " + limit + ";";

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
                cty.setDistrict(rset.getString(3));
                cty.setPopulation(rset.getInt(4));
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
    public void printCities(ArrayList<City> cities)
    {
        // Print header
        System.out.println("15. The Top " + limit + " Populated cities in " + name + " country");
        System.out.println();
        System.out.println(String.format("%-20s %-30s %-20s %s", "Name", "Country", "District", "Population"));
        // Loop over all cities in the list
        for (City cty : cities)
        {
            String cty_string =
                    String.format("%-20s %-30s %-20s %s",
                            cty.getName(), cty.getCountry().getName(), cty.getDistrict(), cty.getPopulation());
            System.out.println(cty_string);
        }
        System.out.println();
    }
}
