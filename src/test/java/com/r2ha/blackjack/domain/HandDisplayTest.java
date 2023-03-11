package com.r2ha.blackjack;

import static org.assertj.core.api.Assertions.*;

import java.util.List;

import com.r2ha.blackjack.adapter.in.console.ConsoleHand;
import com.r2ha.blackjack.domain.Card;
import com.r2ha.blackjack.domain.Hand;
import com.r2ha.blackjack.domain.Rank;
import com.r2ha.blackjack.domain.Suit;
import org.junit.jupiter.api.Test;

public class HandDisplayTest {
    @Test
    void displayFaceUpCardReturnsAsCorrectString() {
        List<Card> cards = List.of(
                new Card(Suit.HEARTS, Rank.ACE),
                new Card(Suit.CLUBS, Rank.JACK)
        );

        Hand hand = new Hand(cards);

        assertThat(ConsoleHand.displayFaceUpCard(hand))
                .isEqualTo("[31m┌─────────┐[1B[11D│A        │[1B[11D│         │[1B[11D│    ♥    │[1B[11D│         │[1B[11D│        A│[1B[11D└─────────┘");
    }

    @Test
    void displayHandReturnsAsCorrectString() {
        List<Card> cards = List.of(
                new Card(Suit.HEARTS, Rank.ACE),
                new Card(Suit.CLUBS, Rank.JACK)
        );

        Hand hand = new Hand(cards);

        assertThat(ConsoleHand.cardsAsString(hand))
                .isEqualTo("[31m┌─────────┐[1B[11D│A        │[1B[11D│         │[1B[11D│    ♥    │[1B[11D│         │[1B[11D│        A│[1B[11D└─────────┘[6A[1C[30m┌─────────┐[1B[11D│J        │[1B[11D│         │[1B[11D│    ♣    │[1B[11D│         │[1B[11D│        J│[1B[11D└─────────┘");
    }
}
