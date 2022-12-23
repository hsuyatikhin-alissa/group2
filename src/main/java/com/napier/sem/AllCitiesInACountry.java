package com.napier.sem;

import java.sql.*;
import java.util.ArrayList;

public class AllCitiesInACountry {

    private String country = "United States";

    /**
     * Connection to MySQL database.
     */
    private Connection con;

    public void setCon(Connection con) {
        this.con = con;
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
    public void printCities(ArrayList<City> cities)
    {
        // Print header
        System.out.println("10. All the cities in " + country + " organised by largest population to smallest.");
        System.out.println();
        System.out.println(String.format("%-40s %-35s %-20s %-30s %-25s", "Name", "Country", "Continent", "District", "Population"));
        // Loop over all cities in a country in the list
        for (City cty : cities)
        {
            String cty_string =
                    String.format("%-40s %-35s %-20s %-30s %-25s",
                            cty.getName(), cty.getCountry().getName(), cty.getCountry().getContinent(), cty.getDistrict(), cty.getPopulation());
            System.out.println(cty_string);
        }
        System.out.println();
    }

}