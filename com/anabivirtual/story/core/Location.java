package com.anabivirtual.story.core;

/**
 * Represents a named location in the planet.
 *
 * <p>
 * Instances of this class represent records of table {@code location}.
 *
 * @author pedro
 */
public interface Location
{
	/**
	 * Get the identification of this location.  This is the primary key of
	 * table {@code location}.
	 *
	 * @return the identification of this location.
	 */
	public long getID ();

	/**
	 * Get the latitude of this location.  Units are degree.
	 *
	 * @return the latitude of this location.
	 */
	public double getLatitude ();

	/**
	 * Set the latitude of this location.  Units are degree.
	 *
	 * @param latitude the new latitude of this location.
	 */
	public void setLatitude (double latitude);

	/**
	 * Get the longitude of this location.  Units are degree.
	 *
	 * @return the longitude of this location.
	 */
	public double getLongitude ();

	/**
	 * Set the longitude of this location.  Units are degree.
	 *
	 * @param longitude the new longitude of this location
	 */
	public void setLongitude (double longitude);

	/**
	 * Get the name of this location.
	 *
	 * @return the name of this location.
	 */
	public String getName ();

	/**
	 * Set the name of this location.
	 *
	 * @param name the new name of this location.
	 */
	public void setName (String name);
}
