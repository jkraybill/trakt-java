package com.uwetrottmann.trakt5.entities;

public class TraktListPopularity {

	public int like_count;
	public int comment_count;
	public TraktList list;

	@Override
	public String toString() {
		return "TraktListPopularity [like_count=" + like_count + ", comment_count=" + comment_count + ", list=" + list + "]";
	}

}
