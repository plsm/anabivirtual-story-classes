package com.anabivirtual.story.core;

/**
 * Music that is played in the background.
 *
 * <p>
 * The music that is played depends on the user location. The music is played if
 * the user in inside a circle. This circle is characterised by its center
 * latitude and longitude and its radius.
 *
 * @author pedro
 */
public interface BackgroundMusic
{
	/**
	 * Get the identification of this background music.
	 * <p>
	 * This is the primary key.
	 *
	 * @return the identification of this background music.
	 */
	long getID ();

	/**
	 * Get the audio filename of this music.
	 *
	 * @return the audio filename of this music.
	 */
	String getAudioFilename ();

	/**
	 * Get the latitude of the center of the region where the music is played.
	 * Units are degree.
	 *
	 * @return the latitude of the center of the region where the music is
	 * played.
	 */
	public double getRegionCenterLatitude ();

	/**
	 * Get the longitude of the center of the region where the music is played..
	 * Units are degree.
	 *
	 * @return the longitude of the center of the region where the music is
	 * played.
	 */
	public double getRegionCenterLongitude ();

	/**
	 * Get the radius of the region where the music is played.
	 *
	 * @return the radius of the region where the music is played.
	 */
	public double getRegionRadius ();

}
