package com.jitterted.ebp.blackjack;

public class Rank {
  private final String rank;

  public Rank(String rank) {
    this.rank = rank;
  }

  public static Rank of(String rank) {
    return new Rank(rank);
  }

  public int rankValue() {
    if ("JQK".contains(rank)) {
      return 10;
    } else if (rank.equals("A")) {
      return 1;
    } else {
      return Integer.parseInt(rank);
    }
  }

  public String display() {
    return rank;
  }
}
