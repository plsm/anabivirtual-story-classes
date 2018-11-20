package com.anabivirtual.story.core;

/**
 * A story that is played to the user when he is nearby its location.
 *
 * <p>
 * All stories have a title and a location.
 * They also have an image that is
 * shown, but this image is independent of the stories.
 * Besides the mp3
 * filename, there is also a transcription, that is displayed to the user if he
 * whishes.
 *
 * <p>
 * Classes that implement this interface represent records of table
 * {@code story}.
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
	 * This is the primary key of the {@code story} table.
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

	/**
	 * Get the audio filename of this story.
	 *
	 * @return the audio filename of this story.
	 */
	public String getFilename ();

	/**
	 * Set the audio filename of this story.
	 *
	 * @param filename the new audio filename of this story.
	 */
	public void setFilename (String filename);

	/**
	 * Get the audio transcription of this story.
	 *
	 * @return the audio transcription of this story.
	 */
	public String getTranscription ();

	/**
	 * Set the audio transcription of this story.
	 *
	 * @param value the new audio transcription of this story.
	 */
	public void setTranscription (String value);
}
