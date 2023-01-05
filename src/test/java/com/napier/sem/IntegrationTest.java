package com.napier.sem;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import java.sql.SQLException;
import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

public class IntegrationTest {

    static CityReport ctyrpt;
    static CountryReport cntryrpt;
    static CapitalCityReport cctyrpt;
    static PopulationReport poprpt;
    static DBConnect db;

    @BeforeAll
    static void init() {
        db = new DBConnect();
        db.connect("Localhost:33060", 3000);

        ctyrpt = new CityReport();
        ctyrpt.setCon(db.getCon());

        cntryrpt = new CountryReport();
        cntryrpt.setCon(db.getCon());

        cctyrpt = new CapitalCityReport();
        cctyrpt.setCon(db.getCon());

        poprpt = new PopulationReport();
        poprpt.setCon(db.getCon());
    }

    /**
     * 1. Integration test for all the countries in the world organised by largest population to smallest.
     */
    @Test
    void testCountry() throws SQLException {
        // create array list
        ArrayList<Country> countries = cntryrpt.getAllCountriesIntheWorld();
        // check array list is null
        assertNotNull(countries);
        /*Check expected data are correct or not*/
        assertEquals(countries.get(0).getCode(),"CHN");
        assertEquals(countries.get(0).getName(),"China");
        assertEquals(countries.get(0).getContinent(),"Asia");
        assertEquals(countries.get(0).getRegion(),"Eastern Asia");
        assertEquals(countries.get(0).getPopulation(),1277558000);
        assertEquals(countries.get(0).getCapital(),"Peking");
        // print report
    }

    /**
     * 2. Integration test for all the countries in a continent organised by largest population to smallest.
     */

    @Test
    void testAllCountriesInAContinent() throws SQLException {
        // create array list
        ArrayList<Country> countries = cntryrpt.getAllCountriesInAContinent();
        // check array list is null
        assertNotNull(countries);
        /*Check expected data are correct or not*/
        assertEquals(countries.get(0).getCode(),"CHN");
        assertEquals(countries.get(0).getName(),"China");
        assertEquals(countries.get(0).getContinent(),"Asia");
        assertEquals(countries.get(0).getRegion(),"Eastern Asia");
        assertEquals(countries.get(0).getPopulation(),1277558000);
        assertEquals(countries.get(0).getCapital(),"Peking");
        // print report
    }


    /**
     * 3. Integration test for all the countries in a region organised by largest population to smallest.
     */
    @Test
    void testAllCountriesInARegion() throws SQLException {
        // create array list
        ArrayList<Country> countries = cntryrpt.getAllCountriesInARegion();
        // check array list is null
        assertNotNull(countries);
        /*Check expected data are correct or not*/
        assertEquals(countries.get(0).getCode(),"CHN");
        assertEquals(countries.get(0).getName(),"China");
        assertEquals(countries.get(0).getContinent(),"Asia");
        assertEquals(countries.get(0).getRegion(),"Eastern Asia");
        assertEquals(countries.get(0).getPopulation(),1277558000);
        //assertEquals(countries.get(0).getCapital(),"Peking");
        // print report
    }

    /**
     * 4. Integration test for the top N populated countries in the world where N is provided by the user.
     */

    @Test
    void testTopNCountriesInTheWorld() throws SQLException {
        // create array list
        ArrayList<Country> countries = cntryrpt.getTopNCountriesInTheWorld();
        // check array list is null
        assertNotNull(countries);
        /*Check expected data are correct or not*/
        assertEquals(countries.get(0).getName(),"China");
        assertEquals(countries.get(0).getContinent(),"Asia");
        assertEquals(countries.get(0).getRegion(),"Eastern Asia");
        assertEquals(countries.get(0).getPopulation(),1277558000);
        assertEquals(countries.get(0).getCapital(),"Peking");
        // print report
    }

    /**
     * 5. Integration test for the top N populated countries in a continent where N is provided by the user.
     */

    @Test
    void testTopNCountriesInAContinent() throws SQLException {
        // create array list
        ArrayList<Country> countries = cntryrpt.getTopNCountriesInAContinent();
        // check array list is null
        assertNotNull(countries);
        /*Check expected data are correct or not*/
        assertEquals(countries.get(0).getCode(), "CHN");
        assertEquals(countries.get(0).getName(), "China");
        assertEquals(countries.get(0).getContinent(), "Asia");
        assertEquals(countries.get(0).getRegion(), "Eastern Asia");
        assertEquals(countries.get(0).getPopulation(), 1277558000);
        assertEquals(countries.get(0).getCapital(), "Peking");
        // print report
    }

    /**
     * 6. Integration test for the top N populated countries in a region where N is provided by the user.
     */

    @Test
    void testNPopulatedCountriesInARegion() throws SQLException {
        // create array list
        ArrayList<Country> countries = cntryrpt.getTopNPopulatedCountriesInARegion();
        // check array list is null
        assertNotNull(countries);
        /*Check expected data are correct or not*/
        assertEquals(countries.get(0).getCode(), "CHN");
        assertEquals(countries.get(0).getName(), "China");
        assertEquals(countries.get(0).getContinent(), "Asia");
        assertEquals(countries.get(0).getRegion(), "Eastern Asia");
        assertEquals(countries.get(0).getPopulation(), 1277558000);
        //assertEquals(countries.get(0).getCapital(), "Peking");
        // print report
    }

    /**
     * 7. Integration test for all the cities in the world organised by largest population to smallest.
     */

    @Test
    void testAllCitiesInTheWorld() throws SQLException {
        // create array list
        ArrayList<City> cities = ctyrpt.getAllCitiesInTheWorld();
        // check array list is null
        assertNotNull(cities);
        /*Check expected data are correct or not*/
        assertEquals(cities.get(1).getName(),"Seoul");
        assertEquals(cities.get(1).getCountryCode(),"KOR");
        assertEquals(cities.get(1).getPopulation(),9981619);

    }

    /**
     * 8. Integration test for all the cities in a continent organised by largest population to smallest.
     */

    @Test
    void testAllCitiesInAContinent() throws SQLException {
        // create array list
        ArrayList<City> cities = ctyrpt.getAllCitiesInAContinent();
        // check array list is null
        assertNotNull(cities);
        /*Check expected data are correct or not*/
        assertEquals(cities.get(0).getName(),"Mumbai (Bombay)");
        assertEquals(cities.get(0).getCountry().getName(),"India");
        assertEquals(cities.get(0).getCountry().getContinent(),"Asia");
        assertEquals(cities.get(0).getDistrict(),"Maharashtra");
        assertEquals(cities.get(0).getPopulation(),10500000);
        // print report
    }

    /**
     * 9. Integration test for all the cities in a region organised by largest population to smallest.
     */

    @Test
    void testAllCitiesInARegion() throws SQLException {
        // create array list
        ArrayList<City> cities = ctyrpt.getAllCitiesInARegion();
        // check array list is null
        assertNotNull(cities);
        /*Check expected data are correct or not*/
        assertEquals(cities.get(0).getName(),"Seoul");
        assertEquals(cities.get(0).getCountry().getName(),"South Korea");
        assertEquals(cities.get(0).getCountry().getRegion(),"Eastern Asia");
        assertEquals(cities.get(0).getDistrict(),"Seoul");
        assertEquals(cities.get(0).getPopulation(),9981619);
        // print report
    }

    /**
     * 10. Integration test for all the cities in a country organised by largest population to smallest.
     */

    @Test
    void testAllCitiesInACountry() throws SQLException {
        // create array list
        ArrayList<City> cities = ctyrpt.getAllCitiesInACountry();
        // check array list is null
        assertNotNull(cities);
        /*Check expected data are correct or not*/
        assertEquals(cities.get(0).getName(),"New York");
        assertEquals(cities.get(0).getCountry().getName(),"United States");
        assertEquals(cities.get(0).getCountry().getContinent(),"North America");
        assertEquals(cities.get(0).getDistrict(),"New York");
        assertEquals(cities.get(0).getPopulation(),8008278);
        // print report
    }


    /**
     * 11. Integration test for all the cities in a district organised by largest population to smallest.
     */
    @Test
    void testAllCitiesInADistrict() throws SQLException {
        // create array list
        ArrayList<City> cities = ctyrpt.getAllCitiesInADistrict();
        // check array list is null
        assertNotNull(cities);
        /*Check expected data are correct or not*/
        assertEquals(cities.get(0).getName(),"Amsterdam");
        assertEquals(cities.get(0).getCountry().getName(),"Netherlands");
        assertEquals(cities.get(0).getDistrict(),"Noord-Holland");
        assertEquals(cities.get(0).getPopulation(),731200);
        // print report
    }

    /**
     * 12. Integration test for the top N populated cities in the world where N is provided by the user.
     */

    @Test
    void testTopNPopulatedCitiesInTheWorld() throws SQLException {
        // create array list
        ArrayList<City> cities = ctyrpt.getTopNPopulatedCitiesInTheWorld();
        // check array list is null
        assertNotNull(cities);
        /*Check expected data are correct or not*/
        assertEquals(cities.get(4).getName(),"Jakarta");
        assertEquals(cities.get(4).getCountry().getName(),"Indonesia");
        assertEquals(cities.get(4).getDistrict(),"Jakarta Raya");
        assertEquals(cities.get(4).getPopulation(),9604900);
    }

    /**
     * 13. Integration test for top N populated cities in a continent.
     */

    @Test
    void testTopNCitiesInAContinent() throws SQLException {
        // create array list
        ArrayList<City> cities = ctyrpt.getTopNCitiesInAContinent();
        // check array list is null
        assertNotNull(cities);
        /*Check expected data are correct or not*/
        assertEquals(cities.get(0).getName(),"Mumbai (Bombay)");
        assertEquals(cities.get(0).getCountry().getName(),"India");
        assertEquals(cities.get(0).getCountry().getContinent(),"Asia");
        assertEquals(cities.get(0).getDistrict(),"Maharashtra");
        assertEquals(cities.get(0).getPopulation(),10500000);
        // print report
    }

    /**
     * 14. Integration test for top N populated cities in a region.
     */

    @Test
    void testTopNCitiesInARegion() throws SQLException {
        // create array list
        ArrayList<City> cities = ctyrpt.getTopNCitiesInARegion();
        // check array list is null
        assertNotNull(cities);
        /*Check expected data are correct or not*/
        assertEquals(cities.get(0).getName(),"Seoul");
        assertEquals(cities.get(0).getCountry().getName(),"South Korea");
        assertEquals(cities.get(0).getCountry().getRegion(),"Eastern Asia");
        assertEquals(cities.get(0).getDistrict(),"Seoul");
        assertEquals(cities.get(0).getPopulation(),9981619);
        // print report
    }

    /**
     * 15. Integration test for the top N populated cities in a country where N is provided by the user.
     */
    @Test
    void testTopPopulatedCitiesInACountry() throws SQLException {
        // create array list
        ArrayList<City> cities = ctyrpt.getTopCitiesInACountry();
        // check array list is null
        assertNotNull(cities);
        /*Check expected data are correct or not*/
        assertEquals(cities.get(0).getName(),"Wien");
        assertEquals(cities.get(0).getCountry().getName(),"Austria");
        assertEquals(cities.get(0).getDistrict(),"Wien");
        assertEquals(cities.get(0).getPopulation(),1608144);
        // print report
    }

    /**
     * 16. Integration test for the top N populated cities in a district where N is provided by the user.
     */
    @Test
    void testTopPopulatedCitiesInADistrict() throws SQLException {
        // create array list
        ArrayList<City> cities = ctyrpt.getTopCitiesInADistrict();
        // check array list is null
        assertNotNull(cities);
        /*Check expected data are correct or not*/
        assertEquals(cities.get(0).getName(),"Amsterdam");
        assertEquals(cities.get(0).getCountry().getName(),"Netherlands");
        assertEquals(cities.get(0).getDistrict(),"Noord-Holland");
        assertEquals(cities.get(0).getPopulation(),731200);
        // print report
    }

    /**
     * 17. Integration test for all the capital cities in the world organised by largest population to smallest.
     */

    @Test
    void testAllCapitalCitiesInTheWorld() throws SQLException {
        // create array list
        ArrayList<CapitalCity> capitalCities = cctyrpt.getAllCapitalCitiesInTheWorld();
        // check array list is null
        assertNotNull(capitalCities);
        /*Check expected data are correct or not*/
        assertEquals(capitalCities.get(0).getName(),"Seoul");
        assertEquals(capitalCities.get(0).getCountry(),"South Korea");
        assertEquals(capitalCities.get(0).getPopulation(),9981619);
        // print report
    }

    /**
     * 18. Integration test for all the capital cities in a continent organised by largest population to smallest.
     */

    @Test
    void testAllCapitalCitiesInAContinent() throws SQLException {
        // create array list
        ArrayList<CapitalCity> capitalCities = cctyrpt.getAllCapitalCitiesInAContinent();
        // check array list is null
        assertNotNull(capitalCities);
        /*Check expected data are correct or not*/
        assertEquals(capitalCities.get(0).getName(),"Mumbai (Bombay)");
        assertEquals(capitalCities.get(0).getCountry(),"India");
        assertEquals(capitalCities.get(0).getPopulation(),10500000);
        // print report
    }

    /**
     * 19. Integration test for all the capital cities in a region organised by largest population to smallest.
     */

    @Test
    void testAllCapitalCitiesInARegion() throws SQLException {
        // create array list
        ArrayList<CapitalCity> capitalCities = cctyrpt.getAllCapitalCitiesInARegion();
        // check array list is null
        assertNotNull(capitalCities);
        /*Check expected data are correct or not*/
        assertEquals(capitalCities.get(0).getName(),"Seoul");
        assertEquals(capitalCities.get(0).getCountry(),"South Korea");
        assertEquals(capitalCities.get(0).getPopulation(),9981619);
        // print report
    }

    /**
     * 20. Integration test for the top N populated capital cities in the world where N is provided by the user.
     */

    @Test
    void testTopNPopulatedCapitalCitiesInTheWorld() throws SQLException {
        // create array list
        ArrayList<CapitalCity> capitalCities = cctyrpt.getTopNPopulatedCapitalCitiesInTheWorld();
        // check array list is null
        assertNotNull(capitalCities);
        /*Check expected data are correct or not*/
        assertEquals(capitalCities.get(0).getName(),"Seoul");
        assertEquals(capitalCities.get(0).getCountry(),"South Korea");
        assertEquals(capitalCities.get(0).getPopulation(),9981619);
        // print report
    }

    /**
     * 21. Integration test for the top N populated capital cities in a continent where N is provided by the user.
     */
    @Test
    void testTNPCapitalCitiesInAContinent() throws SQLException {
        // create array list
        ArrayList<CapitalCity> capitalCities = cctyrpt.getTNPCapitalCitiesInAContinent();
        // check array list is null
        assertNotNull(capitalCities);
        /*Check expected data are correct or not*/
        assertEquals(capitalCities.get(0).getName(),"Mumbai (Bombay)");
        assertEquals(capitalCities.get(0).getCountry(),"India");
        assertEquals(capitalCities.get(0).getPopulation(),10500000);
        // print report
    }

    /**
     * 22. Integration test for the top N populated capital cities in a region where N is provided by the user.
     */

    @Test
    void testgetTNPCapitalCitiesInARegion() throws SQLException {
        // create array list
        ArrayList<CapitalCity> capitalCities = cctyrpt.getTNPCapitalCitiesInARegion();
        // check array list is null
        assertNotNull(capitalCities);
        /*Check expected data are correct or not*/
        assertEquals(capitalCities.get(0).getName(),"Seoul");
        assertEquals(capitalCities.get(0).getCountry(),"South Korea");
        assertEquals(capitalCities.get(0).getPopulation(),9981619);
        // print report
    }

    /**
     * 23. Integration test for The population of people, people living in cities, and people not living in cities in each continent.
     */

    @Test
    void testgetpopulationoinacontinent() throws SQLException {
        // create array list
        ArrayList<Population> populations = poprpt.getpopulationoinacontinent();
        // check array list is null
        assertNotNull(populations);
        /*Check expected data are correct or not*/
        assertEquals(populations.get(0).getName(),"North America");
        assertEquals(populations.get(0).getPopulation(),482993000);
        assertEquals(populations.get(0).getPopInCity(),168250381);
        assertEquals(populations.get(0).getPopNotInCity(),314742619);
        // print report
    }

    /**
     * 24. Integration test for The population of people, people living in cities, and people not living in cities in each region.
     */

    @Test
    void testgetpopulationoinregion() throws SQLException {
        // create array list
        ArrayList<Population> populations = poprpt.getpopulationoinregion();
        // check array list is null
        assertNotNull(populations);
        /*Check expected data are correct or not*/
        assertEquals(populations.get(0).getName(),"Caribbean");
        assertEquals(populations.get(0).getPopulation(),38140000);
        assertEquals(populations.get(0).getPopInCity(),11067550);
        assertEquals(populations.get(0).getPopNotInCity(),27072450);
        // print report
    }

    /**
     * 25. Integration test for The population of people, people living in cities, and people not living in cities in each country.
     */
    @Test
    void testPopulationPeopleInCountry() throws SQLException {
        // create array list
        ArrayList<Population> pops = poprpt.getPopulationPeopleInCountry();
        // check array list is null
        assertNotNull(pops);
        /*Check expected data are correct or not*/
        assertEquals(pops.get(0).getName(),"Aruba");
        assertEquals(pops.get(0).getPopulation(), 103000);
        assertEquals(pops.get(0).getPopInCity(), 29034);
        assertEquals(pops.get(0).getPopNotInCity(),73966);
        // print report
    }

    /**
     * 26. Integration test for The population of the world.
     */

    @Test
    void testPopulationPeopleInTheWorld() throws SQLException {
        // create array list
        ArrayList<Population> pops = poprpt.getPopulationPeopleInTheWorld();
        // check array list is null
        assertNotNull(pops);
        /*Check expected data are correct or not*/
        assertEquals(pops.get(0).getPopulation(),6078749450l);
        // print report
    }

    /**
     * 27. Integration test for The population of a continent.
     */

    @Test
    void testPopulationPeopleInAContinent() throws SQLException {
        // create array list
        ArrayList<Population> pops = poprpt.getPopulationPeopleInAContinent();
        // check array list is null
        assertNotNull(pops);
        /*Check expected data are correct or not*/
        assertEquals(pops.get(0).getPopulation(),3705025700l);
        // print report
    }

    /**
     * 28. The population of a region.
     */
    @Test
    void testPopulationPeopleInARegion() throws SQLException {
        // create array list
        ArrayList<Population> pops = poprpt.getPopulationPeopleInARegion();
        // check array list is null
        assertNotNull(pops);
        /*Check expected data are correct or not*/
        assertEquals(pops.get(0).getPopulation(),309632000l);
        // print report
    }

    /**
     * 29. The population of a country.
     */
    @Test
    void testPopulationPeopleInACountry() throws SQLException {
        // create array list
        ArrayList<Population> pops = poprpt.getPopulationPeopleInACountry();
        // check array list is null
        assertNotNull(pops);
        /*Check expected data are correct or not*/
        assertEquals(pops.get(0).getPopulation(),59623400l);
        // print report
    }

    /**
     * 30. The population of a district.
     */
    @Test
    void testPopulationPeopleInADistrict() throws SQLException {
        // create array list
        ArrayList<Population> pops = poprpt.getPopulationPeopleInADistrict();
        // check array list is null
        assertNotNull(pops);
        /*Check expected data are correct or not*/
        assertEquals(pops.get(0).getPopulation(),8547585l);
        // print report
    }

    /**
     * 31. The population of a city.
     */
    @Test
    void testPopulationPeopleInACity() throws SQLException {
        // create array list
        ArrayList<Population> pops = poprpt.getPopulationPeopleInACity();
        // check array list is null
        assertNotNull(pops);
        /*Check expected data are correct or not*/
        assertEquals(pops.get(0).getPopulation(),589141l);
        // print report
    }

    /**
     * 32. The population of the number of people who speak Chinese, English, Hindi, Spanish, Arabic, from greatest number to smallest, including the percentage of the world population.
     */
    @Test
    void testPopulationPeopleLanguage() throws SQLException {
        // create array list
        ArrayList<Language> languages = poprpt.getPopulationPeopleLanguage();
        // check array list is null
        assertNotNull(languages);
        /*Check expected data are correct or not*/
        assertEquals(languages.get(0).getLanguage(),"Chinese");
        assertEquals(languages.get(0).getPopulation(),1191843539l);
        assertEquals(languages.get(0).getPercentage(),19.61);
        // print report
    }
}