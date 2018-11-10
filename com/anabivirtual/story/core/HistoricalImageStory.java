package com.anabivirtual.story.core;

/**
 * Represents an historical image at a given location.
 *
 * @author pedro
 * @param <L>
 */
public interface HistoricalImageStory<L extends Location>
  extends Story<L>
{
	/**
	 * Get the filename with the historical image.
	 *
	 * @return the filename with the historical image.
	 */
	public String getFilename ();

	/**
	 * Set the filename with the historical image.
	 *
	 * @param filename the new filename with the historical image.
	 */
	public void setFilename (String filename);
}
