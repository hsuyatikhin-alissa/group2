package com.napier.sem;

import java.sql.*;
import java.util.ArrayList;

public class AllCitiesInADistrict {
    private String district = "Noord-Holland";
    /**
     * Connection to MySQL database.
     */
    private Connection con;

    public void setCon(Connection con) {
        this.con = con;
    }

    /**
     * All the cities in a district organised by largest population to smallest.
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
                            + "FROM city, country "
                            + "WHERE city.CountryCode = country.Code && city.District = '" + district + "'\n"
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
     * @param cities The list of cities and countries to print.
     */
    public void printCities(ArrayList<City> cities)
    {
        if (cities == null)
        {
            System.out.println("No cities");
            return;
        }
        // Print header
        System.out.println("11. All the cities in " + district + " district organised by largest population to smallest");
        System.out.println();
        System.out.println(String.format("%-30s %-20s %-20s %s", "Name", "Country", "District", "Population"));
        // Loop over all employees in the list
        for (City cty : cities)
        {
            if (cty == null)
                continue;
            String cty_string =
                    String.format("%-30s %-20s %-20s %s",
                            cty.getName(), cty.getCountry().getName(), cty.getDistrict(), cty.getPopulation());
            System.out.println(cty_string);
        }
        System.out.println();
    }
}
