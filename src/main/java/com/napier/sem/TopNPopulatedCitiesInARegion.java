package com.napier.sem;

import java.sql.*;
import java.util.ArrayList;

public class TopNPopulatedCitiesInARegion {

    private String region = "Eastern Asia";
    private int limit = 5;

    /**
     * Connection to MySQL database.
     */
    private Connection con;

    public void setCon(Connection con) {
        this.con = con;
    }
    /**
     * Gets the top N populated cities in a region where N is provided by the user.
     * @return A list of the top N populated cities in a region where N is provided by the user.
     */
    public ArrayList<City> getAllCities()
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
    public void printCities(ArrayList<City> cities)
    {
        // Print header
        System.out.println("14. The top " + limit + " populated cities in " + region + " region.");
        System.out.println();
        System.out.println(String.format("%-30s %-30s %-30s %-20s %s", "Name", "Country", "Region", "District", "Population"));
        System.out.println();
        // Loop over all cities in the list
        for (City cty : cities)
        {
            String cty_string =
                    String.format("%-30s %-30s %-30s %-20s %s",
                            cty.getName(), cty.getCountry().getName(), cty.getCountry().getRegion(), cty.getDistrict(), cty.getPopulation());
            System.out.println(cty_string);
        }
        System.out.println();
    }


}
