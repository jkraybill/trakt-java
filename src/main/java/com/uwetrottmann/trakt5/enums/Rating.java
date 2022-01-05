package com.uwetrottmann.trakt5.enums;

public class Rating {

	public static final int WEAKSAUCE = 1;
	public static final int TERRIBLE = 2;
	public static final int BAD = 3;
	public static final int POOR = 4;
	public static final int MEH = 5;
	public static final int FAIR = 6;
	public static final int GOOD = 7;
	public static final int GREAT = 8;
	public static final int SUPERB = 9;
	public static final int TOTALLYNINJA = 10;

	public int value;

	public Rating(int value) {
		this.value = value;
	}

	@Override
	public String toString() {
		return String.valueOf(value);
	}

}
