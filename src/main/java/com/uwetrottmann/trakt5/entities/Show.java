package com.uwetrottmann.trakt5.entities;

import java.util.List;

import org.threeten.bp.OffsetDateTime;

import com.uwetrottmann.trakt5.enums.Status;

public class Show extends BaseEntity {

	public Integer year;
	public ShowIds ids;

	// extended info
	public OffsetDateTime first_aired;
	public Airs airs;
	public Integer runtime;
	public String certification;
	public String network;
	public String country;
	public String trailer;
	public String homepage;
	public Status status;
	public String language;
	public List<String> genres;

	@Override
	public String toString() {
		return "Show [year=" + year + ", ids=" + ids + ", first_aired=" + first_aired + ", airs=" + airs + ", runtime=" + runtime + ", certification="
				+ certification + ", network=" + network + ", country=" + country + ", trailer=" + trailer + ", homepage=" + homepage + ", status=" + status
				+ ", language=" + language + ", genres=" + genres + "]";
	}

}
