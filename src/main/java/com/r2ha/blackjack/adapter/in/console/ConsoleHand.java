package com.r2ha.blackjack.adapter.in.console;

import com.r2ha.blackjack.ConsoleCard;
import com.r2ha.blackjack.domain.Hand;

import static org.fusesource.jansi.Ansi.ansi;

import java.util.stream.Collectors;

public class ConsoleHand {
    public static String displayFaceUpCard(Hand hand) {
        return ConsoleCard.display(hand.dealerFaceUpCard());
    }

    public static String cardsAsString(Hand hand) {
        return hand.cards().stream()
                   .map(ConsoleCard::display)
                   .collect(Collectors.joining(
                            ansi().cursorUp(6).cursorRight(1).toString()));
    }
}
