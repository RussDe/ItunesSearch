package com.apple.itunes.parameters.enums;

import com.apple.itunes.parameters.interfaces.I_Parameter;

/**
 * The search result key version you want to receive back from your search.
 * The default is 2.
 */
public enum E_Version implements I_Parameter {
    //possible values
    One("1"),
    TWO("2");

    private final static String KEY = "version=";
    private final String VERSION;

    //constructor
    E_Version(String value) {
        VERSION = value;
    }

    //creating the final query
    public String createQuery() {
        return KEY + VERSION;
    }
}