package com.anabivirtual.story.core;

/**
 * Represents a point of interest the map. There is a description of this point
 * of interest in audio and text format. There is an optional image.
 *
 * @author pedro
 * @param <L> The class that implements the {@code Location} interface.
 */
public interface PointOfInterest<L extends Location>
{

	/**
	 * Get the identification of this point of interest.
	 *
	 * This is the primary key of the {@code poi} table.
	 *
	 * @return the identification of this story.
	 */
	public long getID ();

	/**
	 * Get the location of this point of interest in the map.
	 *
	 * @return the location of this point of interest in the map.
	 */
	public L getLocation ();

	/**
	 * Get the image filename of this point of interest.
	 *
	 * @return the image filename of this point of interest.
	 */
	public String getImageFilename ();

	/**
	 * Returns {@code true} if this point of interest has an image.
	 *
	 * @return {@code true} if this point of interest has an image.
	 */
	public boolean hasImage ();

	/**
	 * Get the audio filename containing the description of this point of
	 * interest.
	 *
	 * @return the audio filename containing the description of this point of
	 * interest.
	 */
	public String getAudioFilename ();

	/**
	 * Get the audio transcription of this point of interest.
	 *
	 * @return the audio transcription of this point of interest.
	 */
	public String getTranscription ();
}
