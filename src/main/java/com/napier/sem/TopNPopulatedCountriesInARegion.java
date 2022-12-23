package com.napier.sem;

import java.sql.*;
import java.util.ArrayList;

public class TopNPopulatedCountriesInARegion {
    String region = "Eastern Asia";
    int limit = 5;

    /**
     * Connection to MySQL database.
     */
    private Connection con;

    public void setCon(Connection con) {
        this.con = con;
    }
    /**
     * Gets all Top N populated countries in a region.
     * @return A list of all Top N populated countries in the world, or null if there is an error.
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
                            + "ORDER BY country.Population DESC "
                            + "LIMIT " + limit + ";";


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
            System.out.println("Failed to get countries details");
            return null;
        }
    }


    /**
     * Prints a list of all Top N populated countries in a region.
     * @param countries The list of all Top N populated countries in a region to print.
     */
    public void printCountries(ArrayList<Country> countries)
    {
        // Check Countries is not null
        if (countries == null)
        {
            System.out.println("No countries");
            return;
        }
        // Print header
        System.out.println("6. The top " + limit + " populated cities in " + region + ".");
        System.out.println(String.format("%-5s %-45s %-25s %-25s %-25s %-25s", "Code", "Name", "Continent", "Region", "Population", "Capital"));
        // Loop over all countries in the list
        for (Country cntry : countries)

            {
                if (cntry == null)
                    continue;

            String cntry_string =
                    String.format("%-5s %-45s %-25s %-25s %-25s %-25s",
                            cntry.getCode(), cntry.getName(), cntry.getContinent(), cntry.getRegion(), cntry.getPopulation(), cntry.getCapital());
            System.out.println(cntry_string);
        }
        System.out.println();
    }


}

