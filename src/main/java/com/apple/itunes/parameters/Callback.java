package com.apple.itunes.parameters;

import com.apple.itunes.parameters.interfaces.I_Parameter;

/**
 * The name of the Javascript callback function you want to use when returning search results to your website.
 * For example: wsSearchCB.
 */

// required (for cross-site searches)
public class Callback implements I_Parameter {
    private final String KEY = "callback=";
    private final String CALLBACK;

    //constructor
    public Callback(String value) {
        CALLBACK = value;
    }

    //creating the final query
    public String createQuery() {
        return KEY + CALLBACK;
    }
}
