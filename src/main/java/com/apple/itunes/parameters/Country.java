package com.apple.itunes.parameters;

/*
 *  The two-letter country code for the store you want to search.
 *  The search uses the default store front for the specified country.
 *  For example: US. The default is US
 */

import com.apple.itunes.parameters.interfaces.I_Parameter;

// required
public class Country implements I_Parameter {
    // creating the first starting word in the query
    private final String KEY = "country=";
    private final String COUNTRY;

    //constructor
    public Country(String value) {
        COUNTRY = value;
    }

    // building the final query
    public String createQuery() {
        return KEY + COUNTRY;
    }
}
