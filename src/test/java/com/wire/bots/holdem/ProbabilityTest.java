package com.wire.bots.holdem;

import org.junit.Test;

import java.util.ArrayList;

public class ProbabilityTest {
    @Test
    public void holeCards() {
        ArrayList<Card> board = new ArrayList<>();
        Probability probability = new Probability(board);

        int combinations = probability.combinations();
        assert combinations == 1326;
    }

    @Test
    public void flopTest() {
        ArrayList<Card> board = new ArrayList<>();
        board.add(new Card(1, 0));
        board.add(new Card(2, 6));
        board.add(new Card(1, 8));
        Probability probability = new Probability(board);

        Player p1 = new Player("1", "1", board);
        p1.addCard(new Card(1, 7));
        p1.addCard(new Card(0, 2));

        Player p2 = new Player("2", "2", board);
        p2.addCard(new Card(2, 0));
        p2.addCard(new Card(2, 1));

        float chance1 = probability.chance(p1);
        float chance2 = probability.chance(p2);

        assert chance1 < chance2;
    }

    @Test
    public void turnTest() {
        ArrayList<Card> board = new ArrayList<>();
        board.add(new Card(1, 12));
        board.add(new Card(2, 10));
        board.add(new Card(1, 9));
        board.add(new Card(0, 9));
        Probability probability = new Probability(board);

        Player p1 = new Player("1", "1", board);
        p1.addCard(new Card(1, 0));
        p1.addCard(new Card(0, 1));

        Player p2 = new Player("2", "2", board);
        p2.addCard(new Card(2, 0));
        p2.addCard(new Card(2, 7));

        float chance1 = probability.chance(p1);
        float chance2 = probability.chance(p2);

        assert chance1 < chance2;
    }

    @Test
    public void riverTest() {
        ArrayList<Card> board = new ArrayList<>();
        board.add(new Card(1, 12));
        board.add(new Card(2, 10));
        board.add(new Card(1, 9));
        board.add(new Card(0, 9));
        board.add(new Card(0, 4));
        Probability probability = new Probability(board);

        Player p1 = new Player("1", "1", board);
        p1.addCard(new Card(1, 0));
        p1.addCard(new Card(0, 1));

        Player p2 = new Player("2", "2", board);
        p2.addCard(new Card(2, 0));
        p2.addCard(new Card(2, 7));

        float chance1 = probability.chance(p1);
        float chance2 = probability.chance(p2);

        assert chance1 < chance2;
    }
}
