package com.jitterted.ebp.blackjack;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

public class WalletTest {

  @Test
  public void newWalletIsEmpty() throws Exception {
    Wallet wallet = new Wallet();

    assertThat(wallet.isEmpty())
        .isTrue();
  }

  @Test
  public void addMoneyToNewWalletIsNotEmpty() throws Exception {
    Wallet wallet = new Wallet();

    wallet.addMoney(15);

    assertThat(wallet.isEmpty())
        .isFalse();
  }

  @Test
  public void add12DollarsIsBalanceOf12Dollars() throws Exception {
    Wallet wallet = new Wallet();

    wallet.addMoney(12);

    assertThat(wallet.balance())
        .isEqualTo(12);
  }

  @Test
  public void add8DollarsAnd6DollarsIsBalanceOf14Dollars() throws Exception {
    Wallet wallet = new Wallet();

    wallet.addMoney(8);
    wallet.addMoney(6);

    assertThat(wallet.balance())
        .isEqualTo(14);
  }

}
