package com.napier.sem;

import java.sql.*;
import java.util.ArrayList;

public class AllCountriesInARegion {

    private String region = "Eastern Asia";

    /**
     * Connection to MySQL database.
     */
    private Connection con;

    public void setCon(Connection con) {
        this.con = con;
    }
    /**
     * Gets all the countries in a region.
     * @return A list of all countries in a region, or null if there is an error.
     */
    public ArrayList<Country> getAllCountries()
    {
        try
        {
            // Create an SQL statement
            Statement stmt = con.createStatement();
            // Create string for SQL statement
            String strSelect =
                "SELECT country.Code, country.Name, country.Continent, country.Region, country.Population, country.Capital "
                        + "FROM country "
                        + "WHERE country.Region = '" + region + "'\n"
                        + "ORDER BY country.Population DESC ";
            // Execute SQL statement
            ResultSet rset = stmt.executeQuery(strSelect);
            // Extract countries information
            ArrayList<Country> countries = new ArrayList<Country>();
            while (rset.next())
            {
                Country cntry = new Country();
                cntry.setCode(rset.getString(1));
                cntry.setName(rset.getString(2));
                cntry.setContinent(rset.getString(3));
                cntry.setRegion(rset.getString(4));
                cntry.setPopulation(rset.getInt(5));
                cntry.setCapital(rset.getInt(6));
                countries.add(cntry);
            }
            return countries;
        }
        catch (Exception e)
        {
            System.out.println(e.getMessage());
            System.out.println("Failed to get country details");
            return null;
        }
    }


    /**
     * Prints a list of countries.
     * @param countries The list of countries to print.
     */
    public void printCountries(ArrayList<Country> countries)
    {
        // Print header
        System.out.println("3. All the countries in " + region + ".");
        System.out.println(String.format("%-5s %-45s %-25s %-25s %-25s %-25s", "Code", "Name", "Continent", "Region", "Population", "Capital"));
        // Loop over all countries in the list
        for (Country cntry : countries)
        {
            String cntry_string =
                    String.format("%-5s %-45s %-25s %-25s %-25s %-25s",
                            cntry.getCode(), cntry.getName(), cntry.getContinent(), cntry.getRegion(), cntry.getPopulation(), cntry.getCapital());
            System.out.println(cntry_string);
        }
        System.out.println();
    }


}
