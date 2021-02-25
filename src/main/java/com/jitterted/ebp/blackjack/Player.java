package com.jitterted.ebp.blackjack;

import static org.fusesource.jansi.Ansi.ansi;

public class Player {
	private Wallet wallet = new Wallet();
	private Hand hand = new Hand();
	private boolean isDealer;

	public Player(boolean isDealer) {
		this.isDealer = isDealer;
	}

	public void clearHand() {
		hand = new Hand();
	}

	public void drawCard(Deck deck) {
		this.hand.drawCard(deck);
	}

	public boolean isBusted() {
		return hand.isBusted();
	}

	public boolean beats(Player p) {
		return this.hand.beats(p.hand);
	}

	boolean pushesWith(Player p) {
		return this.hand.pushesWith(p.hand);
	}

	public void play(Deck deck) {
		if (isDealer) {
			while (hand.dealerMustDraw()) {
				hand.drawCard(deck);
			}
		}
	}

	public void displayHand() {
		if (isDealer) {
			displayDealerUpCard();
			displayDealerHoleCard();
		} else {
			displayPlayerCard();
		}
	}

	private void displayPlayerCard() {
		System.out.println();
		System.out.println("Player has: ");
		hand.displayHand();
		System.out.println(" (" + hand.value() + ")");
	}

	private void displayDealerUpCard() {
		System.out.println("Dealer has: ");
		System.out.println(hand.displayFirstCard()); // first card is Face Up
	}

	private void displayDealerHoleCard() {
		System.out.print(ansi().cursorUp(7).cursorRight(12).a("┌─────────┐").cursorDown(1).cursorLeft(11)
				.a("│░░░░░░░░░│").cursorDown(1).cursorLeft(11).a("│░ J I T ░│").cursorDown(1).cursorLeft(11)
				.a("│░ T E R ░│").cursorDown(1).cursorLeft(11).a("│░ T E D ░│").cursorDown(1).cursorLeft(11)
				.a("│░░░░░░░░░│").cursorDown(1).cursorLeft(11).a("└─────────┘"));
	}

	public void displayFinalDealerHand() {
		if (isDealer) {
			System.out.println("Dealer has: ");
			hand.displayHand();
			System.out.println(" (" + hand.value() + ")");
		}
	}
}
