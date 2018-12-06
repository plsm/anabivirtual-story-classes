package com.anabivirtual.story.core;

import java.util.Collection;

/**
 * Defines methods to access information in a story database. These methods are
 * used by both the story database editor and reader applications.
 *
 * @author pedro
 * @param <L> The class that implements locations.
 * @param <S> The class that implements stories.
 * @param <P> The class that implements points of interest.
 * @param <B> The class that implements background music.
 */
public interface Database
  <L extends Location,
  S extends Story<L>,
  P extends PointOfInterest<L>,
  B extends BackgroundMusic>
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
	 * Get all the points of interest that are in the database.
	 *
	 * @return all the points of interest in the database.
	 */

	Collection<P> getPointsOfInterest ();

	/**
	 * Get all the background music that are in the database.
	 *
	 * @return all the background music in the database.
	 */
	Collection<B> getBackgroundMusic ();
}
