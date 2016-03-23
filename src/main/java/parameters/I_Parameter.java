package parameters;

import java.io.UnsupportedEncodingException;

/**
 * Interface to create a string query for each parameter
 */
public interface I_Parameter {
    // the first starting word in the query
    public final static String KEY = "";

    // create the final query
    String createQuery() throws UnsupportedEncodingException;
}
