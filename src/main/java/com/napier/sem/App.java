package com.napier.sem;

import java.util.ArrayList;

public class App {

    public static void main(String[] args)
    {

        /* Connect to database */

        DBConnect dbcon = new DBConnect();

        if(args.length < 1){
            dbcon.connect("localhost:33060", 3000);
        }else{
            dbcon.connect(args[0], Integer.parseInt(args[1]));
        }

        /* Create a CountryReport object */

        CountryReport cntryrpt = new CountryReport();
        cntryrpt.setCon(dbcon.getCon());

        /* Create a CityReport object */

        CityReport ctyrpt = new CityReport();
        ctyrpt.setCon(dbcon.getCon());

        /* Create a CapitalCityReport object */

        CapitalCityReport cctyrpt = new CapitalCityReport();
        cctyrpt.setCon(dbcon.getCon());

        /* Create a PopulationReport object */

        PopulationReport poprpt = new PopulationReport();
        poprpt.setCon(dbcon.getCon());

        /**
         * 1. All the countries in the world organised by largest population to smallest.
         */
        // Get all countries information in the world
        ArrayList<Country> ctrwo = cntryrpt.getAllCountriesIntheWorld();
        // Extract all countries information in a continent
        cntryrpt.printCountriesIntheWorld(ctrwo);


        /**
         * 2. All the countries in a continent organised by largest population to smallest.
         */
        // Get all countries information in a continent
        ArrayList<Country> countriescon = cntryrpt.getAllCountriesInAContinent();
        // Extract all countries information in a continent
        cntryrpt.printAllCountriesInAContinent(countriescon);


        /**
         * 3. All the countries in a region organised by largest population to smallest.
         */
        // Get all countries information in a region
        ArrayList<Country> countriesreg = cntryrpt.getAllCountriesInARegion();
        // Extract all countries information in a region
        cntryrpt.printAllCountriesInARegion(countriesreg);


        /**
         * 4. The top N populated countries in the world where N is provided by the user.
         */
        // Get top N populated countries in the world information in a continent
        ArrayList<Country> countriestwor = cntryrpt.getTopNCountriesInTheWorld();
        // Extract top N populated countries in the world information in a continent
        cntryrpt.printTopNCountriesInTheWorld(countriestwor);


        /**
         * 5. The top N populated countries in a continent where N is provided by the user.
         */
        // Get top N populated countries in a continent information in a continent
        ArrayList<Country> countriestcon = cntryrpt.getTopNCountriesInAContinent();
        // Extract top N populated countries in a continent information in a continent
        cntryrpt.printTopNCountriesInAContinent(countriestcon);


        /**
         * 6. The top N populated countries in a region where N is provided by the user.
         */
        // Get top N populated countries in a region information
        ArrayList<Country> countriestreg = cntryrpt.getTopNPopulatedCountriesInARegion();
        // Extract top N populated countries in a region information
        cntryrpt.printTopNPopulatedCountriesInARegion(countriestreg);


        /**
         * 7. All the cities in the world organised by largest population to smallest.
         */
        // Get all cities information in the world
        ArrayList<City> citieswor = ctyrpt.getAllCitiesInTheWorld();
        // Extract all cities information in the world
        ctyrpt.printAllCitiesInTheWorld(citieswor);


        /**
         * 8. All the cities in a continent organised by largest population to smallest.
         */
        // Get all cities information in a continent
        ArrayList<City> citiescon = ctyrpt.getAllCitiesInAContinent();
        // Extract all cities information in a continent
        ctyrpt.printAllCitiesInAContinent(citiescon);

        /**
         * 9. All the cities in a region organised by largest population to smallest.
         */
        // Get all cities information in a continent
        ArrayList<City> citiesreg = ctyrpt.getAllCitiesInARegion();
        // Extract all cities information in a continent
        ctyrpt.printAllCitiesInARegion(citiesreg);

        /**
         * 10. All the cities in a country organised by largest population to smallest.
         */
        // Get all cities information in a continent
        ArrayList<City> citiescou = ctyrpt.getAllCitiesInACountry();
        // Extract all cities information in a continent
        ctyrpt.printAllCitiesInACountry(citiescou);

        /**
         * 11. All the cities in a district organised by largest population to smallest.
         */
        // Get all cities information in a district
        ArrayList<City> citiesdist = ctyrpt.getAllCitiesInADistrict();
        // Extract all cities information in a district
        ctyrpt.printCitiesInADistrict(citiesdist);

        /**
         * 12. The top N populated cities in the world where N is provided by the user.
         */
        // Get top N populated cities in the world information
        ArrayList<City> citiestwor = ctyrpt.getTopNPopulatedCitiesInTheWorld();
        // Extract top N populated countries in the world information
        ctyrpt.printTopNPopulatedCitiesInTheWorld(citiestwor);


        /**
         * 13. The top N populated cities in a continent where N is provided by the user.
         */
        // Get all cities information in a continent
        ArrayList<City> citiesncon = ctyrpt.getTopNCitiesInAContinent();
        // Extract all cities information in a continent
        ctyrpt.printTopNCitiesInAContinent(citiesncon);

        /**
         * 14. The top N populated cities in a region where N is provided by the user.
         */
        // Get all cities information in a continent
        ArrayList<City> citiesnreg = ctyrpt.getTopNCitiesInARegion();
        // Extract all cities information in a continent
        ctyrpt.printTopNCitiesInARegion(citiesnreg);

        /**
         * 15. The top N populated cities in a country where N is provided by the user.
         */
        // Get all cities information in a country
        ArrayList<City> citiesncntry = ctyrpt.getTopCitiesInACountry();
        // Extract all cities information in a country
        ctyrpt.printTopCitiesInACountry(citiesncntry);

        /**
         * 16. The top N populated cities in a district where N is provided by the user.
         */
        // Get all cities information in a district
        ArrayList<City> citiesndist = ctyrpt.getTopCitiesInADistrict();
        // Extract all cities information in a district
        ctyrpt.printTopCitiesInADistrict(citiesndist);

        /**
         * 17. All the capital cities in the world organised by largest population to smallest.
         */
        // Get all capital cities information in the world
        ArrayList<CapitalCity> capitalCities = cctyrpt.getAllCapitalCitiesInTheWorld();
        // Extract all capital cities information in the world
        cctyrpt.printAllCapitalCitiesInTheWorld(capitalCities);

        /**
         * 18. All the capital cities in a continent organised by largest population to smallest.
         */
        // Get all capital cities information in a continent
        ArrayList<CapitalCity> capitalCities1 = cctyrpt.getAllCapitalCitiesInAContinent();
        // Extract all capital cities information in a continent
        cctyrpt.printAllCapitalCitiesInAContinent(capitalCities1);

        /**
         * 19. All the capital cities in a region organised by largest population to smallest.
         */
        // Get all capital cities information in a region
        ArrayList<CapitalCity> capitalCities2 = cctyrpt.getAllCapitalCitiesInARegion();
        // Extract all capital cities information in a region
        cctyrpt.printAllCapitalCitiesInARegion(capitalCities2);

        /**
         * 20. The top N populated capital cities in the world where N is provided by the user.
         */
        // Get top N populated capital cities in the world
        ArrayList<CapitalCity> capitalCities3 = cctyrpt.getTopNPopulatedCapitalCitiesInTheWorld();
        // Extract top N populated capital cities in the world
        cctyrpt.printTopNPopulatedCapitalCitiesInTheWorld(capitalCities3);

        /**
         * 21. The top N populated capital cities in a continent where N is provided by the user.
         */
        // Get all capital cities information in a continent
        ArrayList<CapitalCity> catalCities = cctyrpt.getTNPCapitalCitiesInAContinent();
        // Extract all cities information in a continent
        cctyrpt.printTopNPopulatedCapitalCitiesInAContinent(catalCities);

        /**
         * 22. The top N populated capital cities in a region where N is provided by the user.
         */
        // Get all capital cities information in a continent
        ArrayList<CapitalCity> capiCities = cctyrpt.getTNPCapitalCitiesInARegion();
        // Extract all cities information in a continent
        cctyrpt.printTopNPopulatedCapitalCitiesInARegion(capiCities);

        /**
         * 23. The population of people, people living in cities, and people not living in cities in each continent.
         */
        // Get all capital cities information in a continent
        ArrayList<Population> populations = poprpt.getpopulationoinacontinent();
        // Extract all cities information in a continent
        poprpt.printPopulationPeopleInContinent(populations);

        /**
         * 24. The population of people, people living in cities, and people not living in cities in each region.
         */
        // Get all capital cities information in a continent
        ArrayList<Population> pops = poprpt.getpopulationoinregion();
        // Extract all cities information in a continent
        poprpt.printPopulationPeopleInRegion(pops);

        /**
         * 25. The population of people, people living in cities, and people not living in cities in each country.
         */
        // Get population information in each country
        ArrayList<Population> popcoun = poprpt.getPopulationPeopleInCountry();
        // Extract population information in each country
        poprpt.printPopulationPeopleInCountry(popcoun);

        /**
         * 26. The population of the world.
         */
        // Get population of the world information.
        ArrayList<Population> popwor = poprpt.getPopulationPeopleInTheWorld();
        // Extract population of the world information.
        poprpt.printPopulationPeopleInTheWorld(popwor);

        /**
         * 27. The population of a continent.
         */
        // Get population of a continent information.
        ArrayList<Population> popcon = poprpt.getPopulationPeopleInAContinent();
        // Extract population of a continent information.
        poprpt.printPopulationPeopleInAContinent(popcon);

        /**
         * 28. The population of a region.
         */
        // Get population of a region information
        ArrayList<Population> popReg = poprpt.getPopulationPeopleInARegion();
        // Extract population of a region
        poprpt.printPopulationPeopleInARegion(popReg);

        /**
         * 29. The population of a country.
         */
        // Get population of a country information
        ArrayList<Population> popCntry = poprpt.getPopulationPeopleInACountry();
        // Extract population of a country
        poprpt.printPopulationPeopleInACountry(popCntry);

        /**
         * 30. The population of a district.
         */
        // Get population of a district information
        ArrayList<Population> popDist = poprpt.getPopulationPeopleInADistrict();
        // Extract population of a country
        poprpt.printPopulationPeopleInADistrict(popDist);

        /**
         * 31. The population of a city.
         */
        // Get population of a city information
        ArrayList<Population> popCity = poprpt.getPopulationPeopleInACity();
        // Extract population of a city
        poprpt.printPopulationPeopleInACity(popCity);

        /**
         * 32. The population of the number of people who speak Chinese, English, Hindi, Spanish, Arabic, from greatest number to smallest, including the percentage of the world population.
         */
        // Get of the number of people who speak Chinese, English, Hindi, Spanish, Arabic, from greatest number to smallest
        ArrayList<Language> languages = poprpt.getPopulationPeopleLanguage();
        // Extract population of people who speak Chinese, English, Hindi, Spanish, Arabic, from greatest number to smallest
        poprpt.printPopulationPeopleLanguage(languages);
    }
}
