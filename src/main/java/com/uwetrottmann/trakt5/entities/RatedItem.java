package com.uwetrottmann.trakt5.entities;

/**
 * A rating - can contain a show, a season, an episode, or a movie.
 */
public class RatedItem extends BaseRatedEntity {

	/** movie / show / season / episode */
	public String type;

	public Show show;
	public Episode episode;
	public Season season;
	public Movie movie;

	@Override
	public String toString() {
		return "RatedItem [type=" + type + ", show=" + show + ", episode=" + episode + ", season=" + season + ", movie=" + movie + "]";
	}

}
