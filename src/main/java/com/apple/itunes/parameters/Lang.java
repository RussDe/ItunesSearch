package com.apple.itunes.parameters;

import com.apple.itunes.parameters.interfaces.I_Parameter;

/**
 * The language, English or Japanese, you want to use when returning search results.
 * Specify the language using the five-letter codename. For example: en_us.The default is en_us (English).
 */
public class Lang implements I_Parameter {
    private final String KEY = "lang=";
    private final String LANG;

    //constructor (check if no more than 5 symbols and "_" letter in the middle)
    public Lang(String value) {
        LANG = value;
    }

    //creating the final query
    public String createQuery() {
        return KEY + LANG;
    }
}
