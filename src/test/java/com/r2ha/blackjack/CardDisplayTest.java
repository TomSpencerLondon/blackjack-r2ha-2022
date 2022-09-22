package com.r2ha.blackjack;

import static org.assertj.core.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class CardDisplayTest {
    @Test
    void displayTenAsString() {
        Card card = new Card(Suit.HEARTS, Rank.TEN);
        assertThat(ConsoleCard.display(card))
                .isEqualTo("[31m┌─────────┐[1B[11D│10       │[1B[11D│         │[1B[11D│    ♥    │[1B[11D│         │[1B[11D│       10│[1B[11D└─────────┘");
    }

    @Test
    void displayNonTenAsString() {
        Card card = new Card(Suit.HEARTS, Rank.SEVEN);

        assertThat(ConsoleCard.display(card))
                .isEqualTo("[31m┌─────────┐[1B[11D│7        │[1B[11D│         │[1B[11D│    ♥    │[1B[11D│         │[1B[11D│        7│[1B[11D└─────────┘");
    }

    @Test
    void displayNonTenAsString() {
        Card card = new Card(Suit.SPADES, Rank.SEVEN);

        assertThat(card.display())
                .isEqualTo("[30m┌─────────┐[1B[11D│7        │[1B[11D│         │[1B[11D│    ♠    │[1B[11D│         │[1B[11D│        7│[1B[11D└─────────┘");
    }
}
