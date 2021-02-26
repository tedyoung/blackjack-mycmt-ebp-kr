package com.jitterted.ebp.blackjack;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

public class HandBustedTest {

  @Test
  public void handWithCardsValuedAt22IsBusted() throws Exception {
    Hand hand = HandCreator.createHandOf(Rank.QUEEN, Rank.FIVE, Rank.SEVEN);

    assertThat(hand.isBusted())
        .isTrue();
  }

  @Test
  public void handWithCardsValuedAt21IsNotBusted() throws Exception {
    Hand hand = HandCreator.createHandOf(Rank.TEN, Rank.NINE, Rank.TWO);

    assertThat(hand.isBusted())
        .isFalse();
  }

  @Test
  public void handWithCardsValuedAt20IsNotBusted() throws Exception {
    Hand hand = HandCreator.createHandOf(Rank.JACK, Rank.SEVEN, Rank.THREE);

    assertThat(hand.isBusted())
        .isFalse();
  }

  @Test
  public void handWithCardsValuedAt22WithAceIsBusted() throws Exception {
    Hand hand = HandCreator.createHandOf(Rank.ACE, Rank.NINE, Rank.EIGHT, Rank.FOUR);

    assertThat(hand.isBusted())
        .isTrue();
  }


}