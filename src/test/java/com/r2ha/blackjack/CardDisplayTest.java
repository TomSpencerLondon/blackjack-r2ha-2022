package com.r2ha.blackjack;

import static org.assertj.core.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class CardDisplayTest {
    @Test
    void displayTenAsString() {
        Card card = new Card(Suit.HEARTS, Rank.TEN);
        assertThat(card.display())
                .isEqualTo("[31m┌─────────┐[1B[11D│10       │[1B[11D│         │[1B[11D│    ♥    │[1B[11D│         │[1B[11D│       10│[1B[11D└─────────┘");
    }


}
