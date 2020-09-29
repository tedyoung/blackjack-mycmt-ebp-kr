package com.jitterted.ebp.blackjack;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Deck {
  private final List<Card> cards = new ArrayList<>();

  public Deck() {
    List<String> cardValues = new ArrayList<>();
    cardValues.add("A");
    cardValues.add("2");
    cardValues.add("3");
    cardValues.add("4");
    cardValues.add("5");
    cardValues.add("6");
    cardValues.add("7");
    cardValues.add("8");
    cardValues.add("9");
    cardValues.add("10");
    cardValues.add("J");
    cardValues.add("Q");
    cardValues.add("K");

    for (Suit suit : Suit.values()) {
      for (String cardValue : cardValues) {
        cards.add(new Card(suit, cardValue));
      }
    }
    Collections.shuffle(cards);
  }

  public int size() {
    return cards.size();
  }

  public Card draw() {
    return cards.remove(0);
  }
}
