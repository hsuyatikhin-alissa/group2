package com.napier.sem;

import java.sql.*;
import java.util.ArrayList;

public class AllCitiesInARegion {

    private String region = "Eastern Asia";

    /**
     * Connection to MySQL database.
     */
    /**
     * Connect to the MySQL database.
     */
    private Connection con;

    public void setCon(Connection con) {
        this.con = con;
    }


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
     * Prints a list of employees.
     * @param cities The list of employees to print.
     */
    public void printCitiesInARegion(ArrayList<City> cities)
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
        // Loop over all employees in the list
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


}
