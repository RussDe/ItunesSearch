package com.apple.itunes.parameters;

import com.apple.itunes.parameters.interfaces.I_Parameter;

import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.List;

/**
 * The URL-encoded text string you want to search for. For example: jack+johnson.
 */
// required
public class Term implements I_Parameter {
    // creating the first starting word in the query
    private final String KEY = "term=";
    private List<String> terms;

    //constructor
    public Term(List<String> value) {
        terms = value;
    }

    // building a query with " " between words
    private String buildQuery(List<String> terms) {
        StringBuilder queryTerm = new StringBuilder();
        for (String term : terms) {
            queryTerm.append(term).append(" ");
        }
        return queryTerm.toString();
    }

    // building the final query in url format
    public String createQuery() throws UnsupportedEncodingException {
        String readyURL = URLEncoder.encode(buildQuery(terms), "UTF-8");
        return KEY + readyURL;
    }
}




