package com.napier.sem;

import java.sql.*;
import java.util.ArrayList;

public class CapitalCityReport {

    /**
     * Connection to MySQL database.
     */
    private Connection con;

    public void setCon(Connection con) {
        this.con = con;
    }

    /**
     * Variable declarations
     */

    private String continent = "Africa"; //Assign Africa as user input continent.

    private String country = "United States"; //Assign United States as user input country.

    private String region = "Caribbean"; //Assign Caribbean as user's input region
    private int limit = 5; //Assign 5 as a limit

    /**
     * 21. The top N populated capital cities in a continent where N is provided by the user.
     */
    public ArrayList<CapitalCity> getTNPCapitalCitiesInAContinent() {
        try {

            // Create an SQL statement
            Statement stmt = con.createStatement();
            // Create string for SQL statement
            String strSelect =
                    "SELECT city.Name, country.Name, city.Population "
                            + "FROM city "
                            + "JOIN country country "
                            + "ON country.Code = city.CountryCode "
                            + "WHERE country.Continent = '" + continent + "'\n"
                            + "ORDER BY city.Population DESC "
                            + "LIMIT " + limit + ";";

            // Execute SQL statement
            ResultSet rset = stmt.executeQuery(strSelect);
            // Extract city information
            ArrayList<CapitalCity> capitalCities = new ArrayList<CapitalCity>();
            while (rset.next()) {
                CapitalCity capcit = new CapitalCity();
                capcit.setName(rset.getString(1));
                capcit.setCountry(rset.getString(2));
//                capcit.setContinent(rset.getString(3));
                capcit.setPopulation(rset.getInt(3));
                capitalCities.add(capcit);
            }
            return capitalCities;
        } catch (Exception e) {
            System.out.println(e.getMessage());
            System.out.println("Failed to get city details");
            return null;
        }
    }

    /**
     * Prints a list of all the cities.
     *
     * @param capcities The list of all the cities in a region organised by largest population to smallest.
     */
    public void printTopNPopulatedCapitalCitiesInAContinent(ArrayList<CapitalCity> capcities) {
        // Check cities is not null
        if (capcities == null) {
            System.out.println("No cities");
            return;
        }
        // Print header
        System.out.println("21. All the capital cities in " + continent + " organised by largest population to smallest.\n");
        System.out.println(String.format("%-30s %-50s %s", "Name", "Country", "Population"));
        System.out.println();
        // Loop over all cities in the list
        for (CapitalCity capcit : capcities) {
            if (capcit == null)
                continue;

            String capcit_string =
                    String.format("%-30s %-50s %s",
                            capcit.getName(), capcit.getCountry(), capcit.getPopulation());
            System.out.println(capcit_string);
        }
        System.out.println();
    }

    /**
     * 22. The top N populated capital cities in a region where N is provided by the user.
     */
    public ArrayList<CapitalCity> getTNPCapitalCitiesInARegion() {
        try {

            // Create an SQL statement
            Statement stmt = con.createStatement();
            // Create string for SQL statement
            String strSelect =
                    "SELECT city.Name, country.Name, city.Population "
                            + "FROM city "
                            + "JOIN country country "
                            + "ON country.Code = city.CountryCode "
                            + "WHERE country.Region = '" + region + "'\n"
                            + "ORDER BY city.Population DESC "
                            + "LIMIT " + limit + ";";

            // Execute SQL statement
            ResultSet rset = stmt.executeQuery(strSelect);
            // Extract city information
            ArrayList<CapitalCity> capiCities = new ArrayList<CapitalCity>();
            while (rset.next()) {
                CapitalCity capcit = new CapitalCity();
                capcit.setName(rset.getString(1));
                capcit.setCountry(rset.getString(2));
                capcit.setPopulation(rset.getInt(3));
                capiCities.add(capcit);
            }
            return capiCities;
        } catch (Exception e) {
            System.out.println(e.getMessage());
            System.out.println("Failed to get capital city details");
            return null;
        }
    }

    /**
     * Prints a list of all the capital cities.
     *
     * @param capcities The list of all the cities in a region organised by largest population to smallest.
     */
    public void printTopNPopulatedCapitalCitiesInARegion(ArrayList<CapitalCity> capcities) {
        // Check cities is not null
        if (capcities == null) {
            System.out.println("No cities");
            return;
        }
        // Print header
        System.out.println("22. All the capital cities in " + region + " organised by largest population to smallest.\n");
        System.out.println(String.format("%-30s %-50s %s", "Name", "Country", "Population"));
        System.out.println();
        // Loop over all cities in the list
        for (CapitalCity capcit : capcities) {
            if (capcit == null)
                continue;

            String capcit_string =
                    String.format("%-30s %-50s %s",
                            capcit.getName(), capcit.getCountry(), capcit.getPopulation());
            System.out.println(capcit_string);
        }
        System.out.println();
    }
}



