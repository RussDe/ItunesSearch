package com.apple.itunes.parameters;

import com.apple.itunes.parameters.interfaces.I_Parameter;

/**
 * The number of search results you want the iTunes Store to return.
 * For example: 25.The default is 50.
 */
public class Limit implements I_Parameter {
    //maximum limit
    private final String KEY = "limit=";
    private final int MAX_LIMIT = 200;
    private final int LIMIT;

    //constructor
    public Limit(int value) {
        if (value > 200) {
            LIMIT = MAX_LIMIT;
        } else LIMIT = value;
    }

    //creating the final query
    public String createQuery() {
        return KEY + LIMIT;
    }

}
