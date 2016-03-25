package com.apple.itunes.parameters.interfaces;

/**
 * The attribute you want to search for in the stores, relative to the specified media type.
 * For example, if you want to search for an artist by name specify entity=allArtist&attribute=allArtistTerm.
 * In this example, if you search for term=maroon, iTunes returns “Maroon 5” in the search results,
 * instead of all artists who have ever recorded a song with the word “maroon” in the title.
 * The default is all attributes associated with the specified media type.
 */
public interface I_Attribute extends I_Parameter {

}
