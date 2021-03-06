package com.jitterted.ebp.blackjack;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

public class HandValueAceTest {

  // 1: A + 10: A = 11
  // 2: A + 12: A = 1

  @Test
  public void handWithOneAceAndTwoCardsValuedAt10ShouldTotal21() throws Exception {
    Hand hand = HandCreator.createHandOf("A", "5", "5");

    assertThat(hand.value())
        .isEqualTo(11 + 5 + 5);
  }

  @Test
  public void handWithOneAceAndOtherCardsValuedAt12ShouldTotal13() throws Exception {
    Hand hand = HandCreator.createHandOf("A", "6", "6");

    assertThat(hand.value())
        .isEqualTo(1 + 6 + 6);
  }

  @Test
  public void handWithOneAceTwoCardsIsValuedAt11() throws Exception {
    Hand hand = HandCreator.createHandOf("A", "5");

    assertThat(hand.value())
        .isEqualTo(11 + 5);
  }

  @Test
  public void handWithOneAceAndOtherCardsEqualTo11IsValuedAt1() throws Exception {
    Hand hand = HandCreator.createHandOf("A", "8", "3");

    assertThat(hand.value())
        .isEqualTo(1 + 8 + 3);
  }

}
