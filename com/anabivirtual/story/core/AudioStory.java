package com.anabivirtual.story.core;

/**
 * An audio story that contains an audio filename.
 *
 * <p>
 * The user can only listen to this story.
 *
 * <p>
 * Instances of this class represent records of the table audio.
 *
 * @author pedro
 */
public interface AudioStory
  extends Story
{
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
}
