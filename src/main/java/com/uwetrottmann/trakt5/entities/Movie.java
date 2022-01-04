package com.uwetrottmann.trakt5.entities;

import java.util.List;

import org.threeten.bp.LocalDate;

public class Movie extends BaseEntity {

	public Integer year;
	public MovieIds ids;

	// extended info
	public String certification;
	public String tagline;
	/** Date in UTC time. */
	public LocalDate released;
	public Integer runtime;
	public String trailer;
	public String homepage;
	public String language;
	public List<String> genres;

	@Override
	public String toString() {
		return "Movie [year=" + year + ", ids=" + ids + ", certification=" + certification + ", tagline=" + tagline + ", released=" + released + ", runtime="
				+ runtime + ", trailer=" + trailer + ", homepage=" + homepage + ", language=" + language + ", genres=" + genres + "]";
	}

}
