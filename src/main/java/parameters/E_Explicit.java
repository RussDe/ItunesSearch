package parameters;

/**
 * A flag indicating whether or not you want to include explicit content in your search results.The default is Yes.
 */
public enum E_Explicit implements I_Parameter {
    //possible values
    YES("Yes"),
    NO("No");

    private final String DEFAULT_EXPLICIT = E_Explicit.YES;
    private final String EXPLICIT;

    //default constructor
    E_Explicit() {
        EXPLICIT = DEFAULT_EXPLICIT;
    }

    //constructor
    E_Explicit(String value) {
        if (value != E_Explicit.YES || value != E_Explicit.NO) {
            EXPLICIT = E_Explicit.YES;
        } else EXPLICIT = value;
    }

    //creating the final query
    public String createQuery() {
        return KEY + EXPLICIT;
    }


}
