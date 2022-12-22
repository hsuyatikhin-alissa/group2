package com.napier.sem;

import java.sql.*;
import java.util.ArrayList;

public class AllCountriesInWorld {
    /**
     * Connection to MySQL database.
     */
    private Connection con;

    public void setCon(Connection con) {
        this.con = con;
    }

    /**
     * All the countries in the world organised by largest population to smallest.
     */
    public ArrayList<Country> getAllCountries() {
        try {
            // Create an SQL statement
            Statement stmt = con.createStatement();
            // Create string for SQL statement
            String strSelect =
                    "SELECT country.Code, country.Name, country.Continent, country.Region, "
                        + "country.Population, country.Capital FROM country ORDER BY country.Population DESC ";
            // Execute SQL statement
            ResultSet rset = stmt.executeQuery(strSelect);
            // Extract countries information
            ArrayList<Country> countries = new ArrayList<Country>();
            while (rset.next()) {
                Country cntry = new Country();
                cntry.setCode(rset.getString("Code"));
                cntry.setName(rset.getString("Name"));
                cntry.setContinent(rset.getString("Continent"));
                cntry.setRegion(rset.getString("Region"));
                cntry.setPopulation(rset.getInt("Population"));
                cntry.setCapital(rset.getInt("Capital"));
                countries.add(cntry);
            }
            return countries;
        } catch (Exception e) {
            System.out.println(e.getMessage());
            System.out.println("Failed to get country details");
            return null;
        }
    }

    /**
     * All the countries in the world organised by largest population to smallest.
     */
    public void printCountries(ArrayList<Country> countries) {
        // Print header
        System.out.println("1. All the countries in the world organised by largest population to smallest");
        System.out.println();
        System.out.println(String.format("%-15s %-50s %-20s %-35s %-20s %s", "Code", "Name", "Continent", "Region", "Population", "Capital"));
        // Loop over all employees in the list
        for (Country cntry : countries) {
            String cntry_string =
                    String.format("%-15s %-50s %-20s %-35s %-20s %s", cntry.getCode(), cntry.getName(), cntry.getContinent(), cntry.getRegion(), cntry.getPopulation(), cntry.getCapital());
            System.out.println(cntry_string);
        }
        System.out.println();
    }

}
