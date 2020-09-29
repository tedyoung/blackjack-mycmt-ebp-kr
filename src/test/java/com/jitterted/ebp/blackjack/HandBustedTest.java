package com.jitterted.ebp.blackjack;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

public class HandBustedTest {

  @Test
  public void handWithCardsValuedAt22IsBusted() throws Exception {
    Hand hand = HandCreator.createHandOf("Q", "5", "7");

    assertThat(hand.isBusted())
        .isTrue();
  }

  @Test
  public void handWithCardsValuedAt21IsNotBusted() throws Exception {
    Hand hand = HandCreator.createHandOf("10", "9", "2");

    assertThat(hand.isBusted())
        .isFalse();
  }

  @Test
  public void handWithCardsValuedAt20IsNotBusted() throws Exception {
    Hand hand = HandCreator.createHandOf("J", "7", "3");

    assertThat(hand.isBusted())
        .isFalse();
  }

  @Test
  public void handWithCardsValuedAt22WithAceIsBusted() throws Exception {
    Hand hand = HandCreator.createHandOf("A", "9", "8", "4");

    assertThat(hand.isBusted())
        .isTrue();
  }


}