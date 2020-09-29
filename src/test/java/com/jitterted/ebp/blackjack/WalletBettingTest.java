package com.jitterted.ebp.blackjack;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

public class WalletBettingTest {

  @Test
  public void walletWith18DollarsBet7DollarsIsBalanceOf11Dollars() throws Exception {
    Wallet wallet = new Wallet();
    wallet.addMoney(18);

    wallet.bet(7);

    assertThat(wallet.balance())
        .isEqualTo(18 - 7);
  }

  @Test
  public void walletWith30DollarsBet15AndBet14IsBalanceOf1Dollar() throws Exception {
    Wallet wallet = new Wallet();
    wallet.addMoney(30);

    wallet.bet(15);
    wallet.bet(14);

    assertThat(wallet.balance())
        .isEqualTo(30 - 15 - 14);
  }

  @Test
  public void walletWith9DollarsBet9DollarsIsEmpty() throws Exception {
    Wallet wallet = new Wallet();
    wallet.addMoney(9);

    wallet.bet(9);

    assertThat(wallet.isEmpty())
        .isTrue();
  }

  @Test
  public void walletWith20DollarsBet21DollarsThrowsException() throws Exception {
    Wallet wallet = new Wallet();
    wallet.addMoney(20);

    assertThatThrownBy(() -> {
      wallet.bet(21);
    })
        .isInstanceOf(IllegalArgumentException.class);
  }

}
