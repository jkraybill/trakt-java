package com.uwetrottmann.trakt5.entities;

import org.threeten.bp.OffsetDateTime;

public class Episode extends BaseEntity {

	public Integer season;
	public Integer number;
	public EpisodeIds ids;

	// extended info
	public Integer number_abs;
	public OffsetDateTime first_aired;
	public Integer comment_count;
	public Integer runtime;

	@Override
	public String toString() {
		return "Episode [season=" + season + ", number=" + number + ", ids=" + ids + ", number_abs=" + number_abs + ", first_aired=" + first_aired
				+ ", comment_count=" + comment_count + ", runtime=" + runtime + ", title=" + title + ", overview=" + overview + ", rating=" + rating
				+ ", votes=" + votes + ", updated_at=" + updated_at + ", available_translations=" + available_translations + "]";
	}

}
