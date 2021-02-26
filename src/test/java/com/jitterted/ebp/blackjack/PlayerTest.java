package com.jitterted.ebp.blackjack;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertEquals;

import java.lang.reflect.Field;

import org.junit.Test;

public class PlayerTest {

	@Test
	public void testClearHand() {
		Player player = new Player(false, HandCreator.createHandOf(Rank.ACE, Rank.FIVE, Rank.FIVE));
		player.clearHand();
		
		assertEquals(0, player.getHandValue());
	}
	
	@Test
	public void testBeats() {
		Player p1 = new Player(true, HandCreator.createHandOf(Rank.ACE, Rank.FIVE, Rank.FIVE));
		Player p2 = new Player(true, HandCreator.createHandOf(Rank.FIVE, Rank.FIVE, Rank.FIVE));
		
		assertThat(p1.beats(p2));
	}
	
	@Test
	public void testDraw() {
		Player p1 = new Player(true, HandCreator.createHandOf(Rank.EIGHT, Rank.TWO, Rank.FIVE));
		Player p2 = new Player(true, HandCreator.createHandOf(Rank.EIGHT, Rank.TWO, Rank.FIVE));
		
		assertThat(!p1.beats(p2));
		assertThat(!p2.beats(p1));
		assertThat(p1.pushesWith(p2));
	}
	
	@Test
	public void testDrawCard() {
		Player p1 = new Player(true);
		p1.drawCard(new Deck());
		assertThat(p1.getHandValue() > 0);
	}
	
	@Test
	public void testDealerPlay() {
		Player p1 = new Player(true);
		p1.play(new Deck());
		assertThat(p1.getHandValue() > 0);
	}
}
