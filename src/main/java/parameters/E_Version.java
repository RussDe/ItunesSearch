package parameters;

/**
 * The search result key version you want to receive back from your search.
 * The default is 2.
 */
public enum E_Version implements I_Parameter {
    //possible values
    ONE("1"),
    TWO("2");

    private final String DEFAULT_VERSION = "2";
    private final String VERSION;

    //default constructor
    E_Version() {
        VERSION = DEFAULT_VERSION;
    }

    //constructor
    E_Version(String value) {
        if (Integer.parseInt(value) == 1 || Integer.parseInt(value) == 0) {
            VERSION = value;
        } else VERSION = DEFAULT_VERSION;
    }

    //creating the final query
    public String createQuery() {
        return KEY + VERSION;
    }
}