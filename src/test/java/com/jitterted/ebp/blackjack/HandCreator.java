package com.jitterted.ebp.blackjack;

public class HandCreator {
  private static final Suit DONT_CARE_ABOUT_SUIT = Suit.HEART;

  public static Hand createHandOf(String... ranks) {
    Hand hand = new Hand();
    for (String rank : ranks) {
      hand.add(new Card(DONT_CARE_ABOUT_SUIT, rank));
    }
    return hand;
  }
}
