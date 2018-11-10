package com.anabivirtual.story.core;

/**
 * Base interface of all stories.
 *
 * <p>
 * All stories have a title and a location.
 *
 * <p>
 * Classes that implement this interface represent records of table
 * {@code story}. Interfaces that extend this one, when they are implemented,
 * represent other tables in the database.
 *
 * @author pedro
 * @param <L> The class that represents a location.
 */
public interface Story
  <L extends Location>
{

	/**
	 * Get the identification of this story.
	 *
	 * This is either the primary key or the foreign key, depending if this
	 * interface is extended or not.
	 *
	 * @return the identification of this story.
	 */
	public long getID ();

	/**
	 * Get the title of this story.
	 *
	 * <p>
	 * This is a short string intended to be displayed on the map, or on the
	 * screen, when the user is interacting with the story.
	 *
	 * @return the title of this story.
	 */
	public String getTitle ();

	/**
	 * Set the title of this story.
	 *
	 * @param title the new title of this story.
	 */
	public void setTitle (String title);

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
}
