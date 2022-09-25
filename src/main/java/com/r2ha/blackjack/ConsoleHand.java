package com.r2ha.blackjack;

import static org.fusesource.jansi.Ansi.ansi;

import java.util.stream.Collectors;

public class ConsoleHand {
    static String displayFaceUpCard(Hand hand) {
        return ConsoleCard.display(hand.dealerFaceUpCard());
    }

    public static String cardsAsString(Hand hand) {
        return hand.cards().stream()
                   .map(ConsoleCard::display)
                   .collect(Collectors.joining(
                            ansi().cursorUp(6).cursorRight(1).toString()));
    }
}
