package com.napier.sem;

import java.sql.*;
import java.util.ArrayList;

public class AllCitiesInAContinent {

    private String continent = "Asia";

    private Connection con;

    public void setCon(Connection con) {
        this.con = con;
    }

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
    public void printCitiesInAContinent(ArrayList<City> cities)
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


}
