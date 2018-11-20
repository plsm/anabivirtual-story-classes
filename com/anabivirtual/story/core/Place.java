package com.anabivirtual.story.core;

/**
 * Represents a place in the map with an image.
 *
 * @author pedro
 * @param <L> The class that implements the {@code Location} interface.
 */
public interface Place<L extends Location>
{

	/**
	 * Get the identification of this place.
	 *
	 * This is the primary key of the {@code place} table.
	 *
	 * @return the identification of this story.
	 */
	public long getID ();

	/**
	 * Get the location of this story in the map.
	 *
	 * @return the location of this story in the map.
	 */
	public L getLocation ();

	/**
	 * Set the location of this story in the map.
	 *
	 * @param location the new location of this story in the map.
	 */
	public void setLocation (L location);

	/**
	 * Get the image filename of this place.
	 *
	 * @return the image filename of this place.
	 */
	public String getImageFilename ();

	/**
	 * Set the image filename of this place.
	 *
	 * @param imageFilename the new image filename of this place.
	 */
	public void setImageFilename (String imageFilename);
}
