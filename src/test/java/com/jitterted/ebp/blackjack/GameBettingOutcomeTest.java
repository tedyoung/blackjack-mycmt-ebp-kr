package com.jitterted.ebp.blackjack;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

public class GameBettingOutcomeTest {

  // Player Ties = get Bet back
  // Player BJ = Bet + Bet + 50% Bet

//  @Test
//  public void playerWith20Bets10WhenWinsBalanceIs30() throws Exception {
//    Game game = createGameWithPlayerBalanceOf(20);
//    game.playerBets(10);
//
//    game.playerWins();
//
//    assertThat(game.playerBalance())
//        .isEqualTo(30);
//  }
//
//  @Test
//  public void playerWith80Bets70WhenTiesBalanceIs80() throws Exception {
//    Game game = createGameWithPlayerBalanceOf(80);
//    game.playerBets(70);
//
//    game.playerTies();
//
//    assertThat(game.playerBalance())
//        .isEqualTo(80);
//  }
//
//  @Test
//  public void playerWith35Bets30WhenLosesBalanceIs5() throws Exception {
//    Game game = createGameWithPlayerBalanceOf(35);
//
//    game.playerBets(30);
//    game.playerLoses();
//
//    assertThat(game.playerBalance())
//        .isEqualTo(5);
//  }
//
//  @Test
//  public void playerWith40Bets15BalanceIs25() throws Exception {
//    Game game = createGameWithPlayerBalanceOf(40);
//
//    game.playerBets(15);
//
//    assertThat(game.playerBalance())
//        .isEqualTo(25);
//  }
//
//  @Test
//  public void playerDeposits18DollarsBalanceIs18Dollars() throws Exception {
//    Game game = createGameWithPlayerBalanceOf(18);
//
//    assertThat(game.playerBalance())
//        .isEqualTo(18);
//  }
//
//
//  private Game createGameWithPlayerBalanceOf(int amount) {
//    Game game = new Game();
//    game.playerDeposits(amount);
//    return game;
//  }
}