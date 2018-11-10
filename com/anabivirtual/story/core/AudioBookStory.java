package com.anabivirtual.story.core;

/**
 * An audio book story that has an audio filename and an audio transcription.
 *
 * <p>
 * The user can either listen to the story or read it.
 *
 * <p>
 * Instances of this class represent records of table {@code audio_book}.
 *
 * @author pedro
 * @param <L> The location concrete type.
 */
public interface AudioBookStory
  <L extends Location>
  extends AudioStory<L>
{
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
