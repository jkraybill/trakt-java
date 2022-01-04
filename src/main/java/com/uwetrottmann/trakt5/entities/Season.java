package com.uwetrottmann.trakt5.entities;

import java.util.List;

import org.threeten.bp.OffsetDateTime;

public class Season {

	public Integer number;
	public SeasonIds ids;

	public String title;
	public String overview;
	public String network;
	public OffsetDateTime first_aired;
	public Double rating;
	public Integer votes;
	public Integer episode_count;
	public Integer aired_episodes;
	public List<Episode> episodes;

	@Override
	public String toString() {
		return "Season [number=" + number + ", ids=" + ids + ", title=" + title + ", overview=" + overview + ", network=" + network + ", first_aired="
				+ first_aired + ", rating=" + rating + ", votes=" + votes + ", episode_count=" + episode_count + ", aired_episodes=" + aired_episodes
				+ ", episodes=" + episodes + "]";
	}

}
