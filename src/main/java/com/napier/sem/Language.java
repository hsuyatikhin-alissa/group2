package com.napier.sem;

/**
 * Represent language
 */
public class Language {
    /**
     * Country Code
     */
    private String CountryCode;

    /**
     * Language
     */
    private String Language;

    /**
     * IsOfficial
     */
    private String IsOfficial;

    /**
     * Population
     */
    private long Population;

    /**
     * Percentage
     */
    private double Percentage;

    public String getCountryCode() {
        return CountryCode;
    }

    public void setCountryCode(String countryCode) {
        CountryCode = countryCode;
    }

    public String getLanguage() {
        return Language;
    }

    public void setLanguage(String language) {
        Language = language;
    }

    public String getIsOfficial() {
        return IsOfficial;
    }

    public void setIsOfficial(String isOfficial) {
        IsOfficial = isOfficial;
    }

    public double getPercentage() {
        return Percentage;
    }

    public void setPercentage(double percentage) {
        Percentage = percentage;
    }

    public long getPopulation() {
        return Population;
    }

    public void setPopulation(long population) {
        Population = population;
    }
}
