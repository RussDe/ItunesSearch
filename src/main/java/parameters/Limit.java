package parameters;

/**
 * The number of search results you want the iTunes Store to return.
 * For example: 25.The default is 50.
 */
public class Limit implements I_Parameter {
    //default limit
    private final String DEFAULT_LIMIT = "50";
    //maximum limit
    private final String MAX_LIMIT = "200";
    private final String LIMIT;

    //default constructor
    public Limit() {
        LIMIT = DEFAULT_LIMIT;
    }

    //constructor
    public Limit(String value) {
        if (Integer.parseInt(value) < 0 || Integer.parseInt(value) > 200) {
            LIMIT = DEFAULT_LIMIT;
        } else LIMIT = value;
    }

    //creating the final query
    public String createQuery() {
        return KEY + LIMIT;
    }

}
