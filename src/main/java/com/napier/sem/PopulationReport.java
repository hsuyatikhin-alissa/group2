package com.napier.sem;

import java.sql.*;
import java.util.ArrayList;

public class PopulationReport {

    private String continent = "Asia"; //Assign Asia as user's input continent.
    private String region = "North America"; //Assign Caribbean as user input region.
    private String country = "United Kingdom"; //Assign Caribbean as user input country.
    private String district = "Hubei"; //Assign Caribbean as user input region.
    private String city = "Boston"; //Assign Caribbean as user input region.

    /**
     * Connection to MySQL database.
     */
    private Connection con;

    public void setCon(Connection con) {
        this.con = con;
    }

    /**
     * 23. The population of people, people living in cities, and people not living in cities in each continent.
     *
     * @return pop_cities
     */
    public ArrayList<Population> getpopulationoinacontinent() {
        try {
            //Assign connection object to statement variable
            Statement stmt = con.createStatement();
            //Write sql retrieve query for report
            String strSelect = "SELECT country.Continent, SUM(country.Population) AS TotalPopulation, SUM((SELECT SUM(Population) FROM city WHERE CountryCode = country.Code)) AS populationInCity, (SUM(country.Population)-SUM((SELECT SUM(Population) FROM city WHERE CountryCode = country.Code))) AS populationNotInCity " +
                    "FROM country " +
                    "GROUP BY country.continent";
            //Create populations arraylist to store population data
            ArrayList<Population> populations = new ArrayList<Population>();
            // Run sql retrieve query and assign result to resultSet variable
            ResultSet rset = stmt.executeQuery(strSelect);
            // Retrieve data from resultSet by using while loop
            while (rset.next()) {
                /* Create population object and set data in setter method */
                Population population = new Population();
                population.setName(rset.getString("continent"));
                population.setPopulation(rset.getLong("TotalPopulation"));
                population.setPopInCity(rset.getLong("populationInCity"));
                population.setPopNotInCity(rset.getLong("populationNotInCity"));
                // Add population object in populations array list
                populations.add(population);
            }
            // Return populations array list
            return populations;
        } catch (Exception e) {
            System.out.println(e.getMessage());
            System.out.println("Failed to get population details");
            return null;
        }
    }

    /**
     * Prints a list of population in continent.
     *
     * @param populations The list of population in a continent to print.
     */
    public void printPopulationPeopleInContinent(ArrayList<Population> populations) {
        // Check Countries is not null
        if (populations == null) {
            System.out.println("No population");
            return;
        }
        // Print header
        System.out.println("23. The population of people, people living in cities, and people not living in cities in each continent.");
        //Print report title
        System.out.format("%-35s  %-35s  %-35s  %-35s  %-35s  %-35s", "NAME", "POPULATION", "POPULATION IN CITY", "POPULATION IN CITY PERCENTAGE", "POPULATION NOT IN CITY", "POPULATION NOT IN CITY PERCENTAGE");
        System.out.println("\n");
        for (Population population : populations) {
            if (population == null)
                continue;
            double percentincity = 0;
            double percentnotincity = 0;
            if (population.getPopulation() != 0 ) {
                percentincity = ((double) population.getPopInCity() / population.getPopulation()) * 100;
                percentnotincity = ((double) population.getPopNotInCity() / population.getPopulation()) * 100;
            }

            String population_string =
                    String.format("%-35s  %-35s  %-35s  %-35.2f  %-35s  %-35.2f", population.getName(), population.getPopulation(), population.getPopInCity(), percentincity, population.getPopNotInCity(), percentnotincity);

            System.out.println(population_string);
        }
        System.out.println();
    }

    /**
     * 24. The population of people, people living in cities, and people not living in cities in each region.
     */
    public ArrayList<Population> getpopulationoinregion() {
        try {
            //Assign connection object to statement variable
            Statement stmt = con.createStatement();
            //Write sql retrieve query for report
            String strSelect = "SELECT country.Region, SUM(country.Population) AS TotalPopulation, SUM((SELECT SUM(Population) FROM city WHERE CountryCode = country.Code)) AS populationInCity, (SUM(country.Population)-SUM((SELECT SUM(Population) FROM city WHERE CountryCode = country.Code))) AS populationNotInCity " +
                    "FROM country " +
                    "GROUP BY country.region";
            //Create populations arraylist to store population data
            ArrayList<Population> populations = new ArrayList<Population>();
            // Run sql retrieve query and assign result to resultSet variable
            ResultSet rset = stmt.executeQuery(strSelect);
            // Retrieve data from resultSet by using while loop
            while (rset.next()) {
                /* Create population object and set data in setter method */
                Population population = new Population();
                population.setName(rset.getString("region"));
                population.setPopulation(rset.getLong("TotalPopulation"));
                population.setPopInCity(rset.getLong("populationInCity"));
                population.setPopNotInCity(rset.getLong("populationNotInCity"));
                // Add population object in populations array list
                populations.add(population);
            }
            // Return populations array list
            return populations;
        } catch (Exception e) {
            System.out.println(e.getMessage());
            System.out.println("Failed to get population details");
            return null;
        }
    }

    /**
     * Prints a list of population in continent.
     *
     * @param pops The list of population in a region to print.
     */
    public void printPopulationPeopleInRegion(ArrayList<Population> pops) {
        // Check Countries is not null
        if (pops == null) {
            System.out.println("No population");
            return;
        }
        // Print header
        System.out.println("24. The population of people, people living in cities, and people not living in cities in each region");
        //Print report title
        System.out.format("%-35s  %-35s  %-35s  %-35s  %-35s  %-35s", "NAME", "POPULATION", "POPULATION IN CITY", "POPULATION IN CITY PERCENTAGE", "POPULATION NOT IN CITY", "POPULATION NOT IN CITY PERCENTAGE");
        System.out.println("\n");
        for (Population population : pops) {
            if (population == null)
                continue;
            double percentincity = 0;
            double percentnotincity = 0;
            if (population.getPopulation() != 0 ) {
                percentincity = ((double) population.getPopInCity() / population.getPopulation()) * 100;
                percentnotincity = ((double) population.getPopNotInCity() / population.getPopulation()) * 100;
            }

            String population_string =
                    String.format("%-35s  %-35s  %-35s  %-35.2f  %-35s  %-35.2f", population.getName(), population.getPopulation(), population.getPopInCity(), percentincity, population.getPopNotInCity(), percentnotincity);

            System.out.println(population_string);
        }
        System.out.println();
    }

    /**
     * 25. The population of people, people living in cities, and people not living in cities in each country.
     */
    public ArrayList<Population> getPopulationPeopleInCountry() {
        try {
            //Assign connection object to statement variable
            Statement stmt = con.createStatement();
            //Write sql retrieve query for report
            String strSelect = "SELECT country.name, SUM(country.Population) AS TotalPopulation, SUM((SELECT SUM(Population) FROM city WHERE CountryCode = country.Code)) AS populationInCity, (SUM(country.Population)-SUM((SELECT SUM(Population) FROM city WHERE CountryCode = country.Code))) AS populationNotInCity " +
                    "FROM country " +
                    "GROUP BY country.name";
            //Create populations arraylist to store population data
            ArrayList<Population> populations = new ArrayList<Population>();
            // Run sql retrieve query and assign result to resultSet variable
            ResultSet rset = stmt.executeQuery(strSelect);
            // Retrieve data from resultSet by using while loop
            while (rset.next()) {
                /* Create population object and set data in setter method */
                Population population = new Population();
                population.setName(rset.getString("name"));
                population.setPopulation(rset.getLong("TotalPopulation"));
                population.setPopInCity(rset.getLong("populationInCity"));
                population.setPopNotInCity(rset.getLong("populationNotInCity"));
                // Add population object in populations array list
                populations.add(population);
            }
            // Return populations array list
            return populations;
        } catch (Exception e) {
            System.out.println(e.getMessage());
            System.out.println("Failed to get population details");
            return null;
        }
    }

    /**
     * Prints a list of population in each country.
     *
     * @param pops The list of population in each country to print.
     */
    public void printPopulationPeopleInCountry(ArrayList<Population> pops) {
        // Check Population is not null
        if (pops == null) {
            System.out.println("No population");
            return;
        }
        // Print header
        System.out.println("25. The population of people, people living in cities, and people not living in cities in each country");
        //Print report title
        System.out.format("%-35s  %-35s  %-35s  %-35s  %-35s  %-35s", "NAME", "POPULATION", "POPULATION IN CITY", "POPULATION IN CITY PERCENTAGE", "POPULATION NOT IN CITY", "POPULATION NOT IN CITY PERCENTAGE");
        System.out.println("\n");
        for (Population population : pops) {
            if (population == null)
                continue;
            double percentincity = 0;
            double percentnotincity = 0;
            if (population.getPopulation() != 0 ) {
                percentincity = ((double) population.getPopInCity() / population.getPopulation()) * 100;
                percentnotincity = ((double) population.getPopNotInCity() / population.getPopulation()) * 100;
            }

            String population_string =
                    String.format("%-35s  %-35s  %-35s  %-35.2f  %-35s  %-35.2f", population.getName(), population.getPopulation(), population.getPopInCity(), percentincity, population.getPopNotInCity(), percentnotincity);

            System.out.println(population_string);
        }
        System.out.println();
    }

    /**
     * 26. The population of the world.
     */

    public ArrayList<Population> getPopulationPeopleInTheWorld() {
        try {
            //Assign connection object to statement variable
            Statement stmt = con.createStatement();
            //Write sql retrieve query for report
            String strSelect =
                    "SELECT SUM(country.Population) AS Population FROM country;";
            //Create populations arraylist to store population data
            ArrayList<Population> populations = new ArrayList<Population>();
            // Run sql retrieve query and assign result to resultSet variable
            ResultSet rset = stmt.executeQuery(strSelect);
            // Retrieve data from resultSet by using while loop
            while (rset.next())
            {
                Population population = new Population();
                population.setPopulation(rset.getLong("Population"));
                populations.add(population);
            }
            return populations;
        } catch (Exception e) {
            System.out.println(e.getMessage());
            System.out.println("Failed to get population details");
            return null;
        }
    }

    /**
     * Prints a list of population in the world.
     *
     * @param pops The list of population in the world to print.
     */
    public void printPopulationPeopleInTheWorld(ArrayList<Population> pops) {
        // Check Population is not null
        if (pops == null) {
            System.out.println("No population");
            return;
        }
        // Print header
        System.out.println("26. The population of the world.");
        //Print report title
//        System.out.format("%s", "POPULATION");
        for (Population population : pops) {
            if (population == null)
                continue;

            String pworld_string =
                    String.format("%-40s", population.getPopulation());
            System.out.println("Total World Population: "+pworld_string);
        }
        System.out.println();
    }

    /**
     * 27. The population of a continent.
     */

    public ArrayList<Population> getPopulationPeopleInAContinent() {
        try {
            //Assign connection object to statement variable
            Statement stmt = con.createStatement();
            //Write sql retrieve query for report
            String strSelect =
                    "SELECT SUM(country.Population) AS Population FROM country WHERE country.Continent = '" + continent + "' GROUP BY country.Continent";
//            SUM((SELECT SUM(Population) FROM city WHERE CountryCode = country.Code))
            //Create populations arraylist to store population data
            ArrayList<Population> populations = new ArrayList<Population>();
            // Run sql retrieve query and assign result to resultSet variable
            ResultSet rset = stmt.executeQuery(strSelect);
            // Retrieve data from resultSet by using while loop
            while (rset.next())
            {
                Population population = new Population();
                population.setPopulation(rset.getLong("Population"));
                populations.add(population);
            }
            return populations;
        } catch (Exception e) {
            System.out.println(e.getMessage());
            System.out.println("Failed to get population details");
            return null;
        }
    }

    /**
     * Prints a list of population in a continent.
     *
     * @param pops The list of population in a continent to print.
     */
    public void printPopulationPeopleInAContinent(ArrayList<Population> pops) {
        // Check Population is not null
        if (pops == null) {
            System.out.println("No population");
            return;
        }
        // Print header
        System.out.println("27. The population of Asia");
        //Print report title
        String.format("%-10s  %s", "Continent", "Population");
        for (Population population : pops) {
            if (population == null)
                continue;

            String pworld_string =
                    String.format("%-40s", population.getPopulation());
            System.out.println("Total Asia Population: "+pworld_string);
        }
        System.out.println();
    }

    /**
     * 28. The population of a region.
     */
    public ArrayList<Population> getPopulationPeopleInARegion() {
        try {
            //Assign connection object to statement variable
            Statement stmt = con.createStatement();
            //Write sql retrieve query for report
            String strSelect =
                    "SELECT SUM(country.Population) AS Population FROM country WHERE country.Region = '" + region + "' GROUP BY country.Region";
//            SUM((SELECT SUM(Population) FROM city WHERE CountryCode = country.Code))
            //Create populations arraylist to store population data
            ArrayList<Population> populations = new ArrayList<Population>();
            // Run sql retrieve query and assign result to resultSet variable
            ResultSet rset = stmt.executeQuery(strSelect);
            // Retrieve data from resultSet by using while loop
            while (rset.next())
            {
                Population population = new Population();
                population.setPopulation(rset.getLong("Population"));
                populations.add(population);
            }
            return populations;
        } catch (Exception e) {
            System.out.println(e.getMessage());
            System.out.println("Failed to get population details");
            return null;
        }
    }

    /**
     * Prints a list of population in region.
     *
     * @param pops The list of population in a region to print.
     */
    public void printPopulationPeopleInARegion(ArrayList<Population> pops) {
        // Check Countries is not null
        if (pops == null) {
            System.out.println("No population");
            return;
        }
        // Print header
        System.out.println("28. The population of a region.");
        //Print report title
        String.format("%-10s  %s", "Region", "Population");
        for (Population population : pops) {
            if (population == null)
                continue;
            String pregion_string =
                    String.format("%-40s", population.getPopulation());
            System.out.println("Total Population of the North America region: "+pregion_string);
        }
        System.out.println();
    }


    /**
     * 29. The population of a country.
     */
    public ArrayList<Population> getPopulationPeopleInACountry() {
        try {
            //Assign connection object to statement variable
            Statement stmt = con.createStatement();
            //Write sql retrieve query for report
            String strSelect =
                    "SELECT SUM(country.Population) AS Population FROM country WHERE country.Name = '" + country + "' GROUP BY country.Name";
            //Create populations arraylist to store population data
            ArrayList<Population> populations = new ArrayList<Population>();
            // Run sql retrieve query and assign result to resultSet variable
            ResultSet rset = stmt.executeQuery(strSelect);
            // Retrieve data from resultSet by using while loop
            while (rset.next())
            {
                Population population = new Population();
                population.setPopulation(rset.getLong("Population"));
                populations.add(population);
            }
            return populations;
        } catch (Exception e) {
            System.out.println(e.getMessage());
            System.out.println("Failed to get population details");
            return null;
        }
    }

    /**
     * Prints a list of population in region.
     *
     * @param pops The list of population in a region to print.
     */
    public void printPopulationPeopleInACountry(ArrayList<Population> pops) {
        // Check Countries is not null
        if (pops == null) {
            System.out.println("No population");
            return;
        }
        // Print header
        System.out.println("29. The population of a country.");
        //Print report title
        String.format("%-10s  %s", "Country", "Population");
        for (Population population : pops) {
            if (population == null)
                continue;
            String pcntry_string =
                    String.format("%-40s", population.getPopulation());
            System.out.println("Total Population of the United Kingdom region: "+pcntry_string);
        }
        System.out.println();
    }


    /**
     * 30. The population of a district.
     */
    public ArrayList<Population> getPopulationPeopleInADistrict() {
        try {
            //Assign connection object to statement variable
            Statement stmt = con.createStatement();
            //Write sql retrieve query for report
            String strSelect =
                    "SELECT SUM(city.Population) AS Population FROM city WHERE city.District = '" + district + "' GROUP BY city.District";
            //Create populations arraylist to store population data
            ArrayList<Population> populations = new ArrayList<Population>();
            // Run sql retrieve query and assign result to resultSet variable
            ResultSet rset = stmt.executeQuery(strSelect);
            // Retrieve data from resultSet by using while loop
            while (rset.next())
            {
                Population population = new Population();
                population.setPopulation(rset.getLong("Population"));
                populations.add(population);
            }
            return populations;
        } catch (Exception e) {
            System.out.println(e.getMessage());
            System.out.println("Failed to get population details");
            return null;
        }
    }

    /**
     * Prints a list of population in region.
     *
     * @param pops The list of population in a region to print.
     */
    public void printPopulationPeopleInADistrict(ArrayList<Population> pops) {
        // Check Countries is not null
        if (pops == null) {
            System.out.println("No population");
            return;
        }
        // Print header
        System.out.println("30. The population of a district.");
        //Print report title
        String.format("%-10s  %s", "District", "Population");
        for (Population population : pops) {
            if (population == null)
                continue;
            String pdist_string =
                    String.format("%-40s", population.getPopulation());
            System.out.println("Total Population of the Hubei district: "+pdist_string);
        }
        System.out.println();
    }


    /**
     * 31. The population of a city.
     */
    public ArrayList<Population> getPopulationPeopleInACity() {
        try {
            //Assign connection object to statement variable
            Statement stmt = con.createStatement();
            //Write sql retrieve query for report
            String strSelect =
                    "SELECT SUM(city.Population) AS Population FROM city WHERE city.Name = '" + city + "' GROUP BY city.Name";
            //Create populations arraylist to store population data
            ArrayList<Population> populations = new ArrayList<Population>();
            // Run sql retrieve query and assign result to resultSet variable
            ResultSet rset = stmt.executeQuery(strSelect);
            // Retrieve data from resultSet by using while loop
            while (rset.next())
            {
                Population population = new Population();
                population.setPopulation(rset.getLong("Population"));
                populations.add(population);
            }
            return populations;
        } catch (Exception e) {
            System.out.println(e.getMessage());
            System.out.println("Failed to get population details");
            return null;
        }
    }

    /**
     * Prints a list of population in region.
     *
     * @param pops The list of population in a region to print.
     */
    public void printPopulationPeopleInACity(ArrayList<Population> pops) {
        // Check City is not null
        if (pops == null) {
            System.out.println("No population");
            return;
        }
        // Print header
        System.out.println("31. The population of a city.");
        //Print report title
        String.format("%-10s  %s", "City", "Population");
        for (Population population : pops) {
            if (population == null)
                continue;
            String pcty_string =
                    String.format("%-40s", population.getPopulation());
            System.out.println("Total Population of the Boston City: "+pcty_string);
        }
        System.out.println();
    }
}


