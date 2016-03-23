package parameters;

/**
 * The language, English or Japanese, you want to use when returning search results.
 * Specify the language using the five-letter codename. For example: en_us.The default is en_us (English).
 */
public class Lang implements I_Parameter {
    private final String LANG;
    //default language
    private final String DEFAULT_LANG = "en_us";

    //default constructor
    public Lang() {
        LANG = DEFAULT_LANG;
    }

    //constructor (check if no more than 5 symbols and "_" letter in the middle)
    public Lang(String value) {
        if ((value.length() == 4) && (value.charAt(2) == '_')) {
            LANG = value;
        } else LANG = DEFAULT_LANG;
    }

    //creating the final query
    public String createQuery() {
        return KEY + LANG;
    }
}
