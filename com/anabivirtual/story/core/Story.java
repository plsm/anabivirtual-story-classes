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
	 * Get the location of this story in the map.
	 *
	 * @return the location of this story in the map.
	 */
	public L getLocation ();

	/**
	 * Get the audio filename of this story.
	 *
	 * @return the audio filename of this story.
	 */
	public String getAudioFilename ();

	/**
	 * Get the audio transcription of this story.
	 *
	 * @return the audio transcription of this story.
	 */
	public String getTranscription ();

}
