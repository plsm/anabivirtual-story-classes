package com.anabivirtual.story.core;

import java.util.Collection;

/**
 * Defines methods to access information in a story database. These methods are
 * used by both the story database editor and reader applications.
 *
 * @author pedro
 * @param <L> The class that implements locations.
 * @param <S> The class that implements stories.
 * @param <P> The class that implements places.
 */
public interface Database
  <L extends Location,
  S extends Story<L>,
  P extends Place<L>>
{

	/**
	 * Get all the locations that are in the database.
	 *
	 * @return all the locations in the database.
	 */
	Collection<L> getLocations ();

	/**
	 * Get all the stories that are in the database.
	 *
	 * @return all the stories in the database.
	 */
	Collection<S> getStories ();

	/**
	 * Get all the places that are in the database.
	 *
	 * @return all the places in the database.
	 */
	Collection<P> getPlaces ();
}
