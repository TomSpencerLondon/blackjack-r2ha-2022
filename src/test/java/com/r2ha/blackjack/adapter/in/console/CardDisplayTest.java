package com.r2ha.blackjack;

import static org.assertj.core.api.Assertions.*;

import com.r2ha.blackjack.domain.Card;
import com.r2ha.blackjack.domain.Rank;
import com.r2ha.blackjack.domain.Suit;
import org.junit.jupiter.api.Test;

public class CardDisplayTest {
    @Test
    void displayTenAsString() {
        Card card = new Card(Suit.CLUBS, Rank.TEN);

        assertThat(com.r2ha.blackjack.ConsoleCard.display(card))
                .isEqualTo("[30m┌─────────┐[1B[11D│10       │[1B[11D│         │[1B[11D│    ♣    │[1B[11D│         │[1B[11D│       10│[1B[11D└─────────┘");
    }

    @Test
    void displayNonTenAsString() {
        Card card = new Card(Suit.SPADES, Rank.SEVEN);

        assertThat(com.r2ha.blackjack.ConsoleCard.display(card))
                .isEqualTo("[30m┌─────────┐[1B[11D│7        │[1B[11D│         │[1B[11D│    ♠    │[1B[11D│         │[1B[11D│        7│[1B[11D└─────────┘");
    }

}
