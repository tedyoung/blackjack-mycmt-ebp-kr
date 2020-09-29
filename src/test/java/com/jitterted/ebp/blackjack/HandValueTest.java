package com.jitterted.ebp.blackjack;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

public class HandValueTest {
  @Test
  public void handWithJackAnd7And3ValueAt20() throws Exception {
    Hand hand = HandCreator.createHandOf("J", "7", "3");

    assertThat(hand.value())
        .isEqualTo(20);
  }
}
