package com.napier.sem;

import java.sql.*;
import java.util.ArrayList;

public class TopNPopulatedCitiesInAContinent {

    private String continent = "Asia";
    private int limit = 5;

    /**
     * Connection to MySQL database.
     */
    private Connection con;

    public void setCon(Connection con) {
        this.con = con;
    }



    /**
     * Gets all the top N populated cities in a region where N is provided by the user.
     * @return A list of the top N populated cities in a region where N is provided by the user..
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
                            + "FROM city "
                            + "JOIN country country "
                            + "ON country.Code = city.CountryCode "
                            + "WHERE country.Continent = '" + continent + "'\n"
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
     * Prints a list of employees.
     * @param cities The list of the top N populated cities in a region where N is provided by the user.
     */
    public void printCities(ArrayList<City> cities)
    {
        // Print header
        System.out.println("13. The top " + limit + " populated cities in " + continent + ".");
        System.out.println();

        System.out.println(String.format("%-30s %-30s %-20s %-20s %s", "Name", "Country", "Continent", "District", "Population"));
        System.out.println();
        // Loop over all cities in the list
        for (City cty : cities)
        {
            String cty_string =
                    String.format("%-30s %-30s %-20s %-20s %s",
                            cty.getName(), cty.getCountry().getName(), cty.getCountry().getContinent(), cty.getDistrict(), cty.getPopulation());
            System.out.println(cty_string);
        }
        System.out.println();
    }


}

