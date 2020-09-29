package com.jitterted.ebp.blackjack;

public enum Suit {
  SPADE("♠", false),
  DIAMOND("♦", true),
  HEART("♥", true),
  CLUB("♣", false);

  private final String symbol;
  private final boolean isRed;

  Suit(String symbol, boolean isRed) {
    this.symbol = symbol;
    this.isRed = isRed;
  }

  public String symbol() {
    return symbol;
  }

  public boolean isRed() {
    return isRed;
  }
}
