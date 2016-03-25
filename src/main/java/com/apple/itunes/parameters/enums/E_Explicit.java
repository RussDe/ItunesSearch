package com.apple.itunes.parameters.enums;

import com.apple.itunes.parameters.interfaces.I_Parameter;

/**
 * A flag indicating whether or not you want to include explicit content in your search results.The default is Yes.
 */
public enum E_Explicit implements I_Parameter {
    //possible values
    YES("Yes"),
    NO("No");
    private final String KEY = "explicit=";
    private final String EXPLICIT;

    //constructor
    E_Explicit(String value) {
        EXPLICIT = value;
    }

    //creating the final query
    public String createQuery() {
        return KEY + EXPLICIT;
    }


}
