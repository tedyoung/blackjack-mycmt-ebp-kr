package com.jitterted.ebp.blackjack;

import java.util.ArrayList;
import java.util.List;

public class HandCreator {
  private static final Suit DONT_CARE_ABOUT_SUIT = Suit.HEART;

  public static Hand createHandOf(Rank... ranks) {
    List<Card> cards = new ArrayList<>();
    for (Rank rank : ranks) {
      cards.add(new Card(DONT_CARE_ABOUT_SUIT, rank));
    }
    return new Hand(cards);
  }
}
