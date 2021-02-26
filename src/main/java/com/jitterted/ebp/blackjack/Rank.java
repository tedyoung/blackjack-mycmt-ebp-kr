package com.jitterted.ebp.blackjack;

public enum Rank {
	ACE(1, "A"),
	TWO(2, "2"),
	THREE(3, "3"),
	FOUR(4, "4"),
	FIVE(5, "5"),
	SIX(6, "6"),
	SEVEN(7, "7"),
	EIGHT(8, "8"),
	NINE(9, "9"),
	TEN(10, "10"),
	JACK(10, "J"),
	QUEEN(10, "Q"),
	KING(10, "K");
	
	private final int val;
	private final String strVal;
	
	Rank(int val, String strVal) {
		this.val = val;
		this.strVal = strVal;
	}
	
	public int rankValue() {
		return this.val;
	}
	
	public String display() {
		return this.strVal;
	}
}
