package parameters;


/**
 * The media type you want to search for. For example: movie. The default is all.
 */

public enum E_Media implements I_Parameter {
    // possible values
    MOVIE("movie"),
    PODCAST("podcast"),
    MUSIC("music"),
    MUSIC_VIDEO("musicVideo"),
    AUDIO_BOOK("audiobook"),
    SHORT_FILM("shortFilm"),
    TV_SHOW("tvShow"),
    SOFTWARE("software"),
    E_BOOK("ebook"),
    ALL("all");

    private final String KEY = "media=";
    private final String MEDIA;

    //constructor
    E_Media(String value) {
        MEDIA = value;
    }

    //creating the final query
    public String createQuery() {
        return KEY + MEDIA;
    }
}
