package com.wire.bots.holdem;

import org.junit.Test;

import java.util.ArrayList;

public class HandsTests {
    @Test
    public void pairAcesOverPairEights() {
        ArrayList<Card> cards1 = new ArrayList<>();
        cards1.add(new Card(1, 13));
        cards1.add(new Card(2, 13));
        cards1.add(new Card(1, 1));
        cards1.add(new Card(1, 2));
        cards1.add(new Card(1, 3));

        Hand h1 = new Hand(cards1);

        ArrayList<Card> cards2 = new ArrayList<>();
        cards2.add(new Card(1, 7));
        cards2.add(new Card(2, 7));
        cards2.add(new Card(1, 1));
        cards2.add(new Card(1, 2));
        cards2.add(new Card(1, 3));

        Hand h2 = new Hand(cards2);

        int res = h1.compareTo(h2);
        assert res == 1;
    }

    @Test
    public void pairKingsOverPairEights() {
        ArrayList<Card> cards1 = new ArrayList<>();
        cards1.add(new Card(1, 12));
        cards1.add(new Card(2, 12));
        cards1.add(new Card(1, 1));
        cards1.add(new Card(1, 2));
        cards1.add(new Card(1, 3));

        Hand h1 = new Hand(cards1);

        ArrayList<Card> cards2 = new ArrayList<>();
        cards2.add(new Card(1, 7));
        cards2.add(new Card(2, 7));
        cards2.add(new Card(0, 1));
        cards2.add(new Card(0, 2));
        cards2.add(new Card(0, 3));

        Hand h2 = new Hand(cards2);

        int res = h1.compareTo(h2);
        assert res == 1;
    }

    @Test
    public void pairTwosOverPairEights() {
        ArrayList<Card> cards1 = new ArrayList<>();
        cards1.add(new Card(1, 0));
        cards1.add(new Card(2, 0));
        cards1.add(new Card(1, 1));
        cards1.add(new Card(1, 2));
        cards1.add(new Card(1, 3));

        Hand h1 = new Hand(cards1);

        ArrayList<Card> cards2 = new ArrayList<>();
        cards2.add(new Card(1, 7));
        cards2.add(new Card(2, 7));
        cards2.add(new Card(0, 1));
        cards2.add(new Card(0, 2));
        cards2.add(new Card(0, 3));

        Hand h2 = new Hand(cards2);

        int res = h1.compareTo(h2);
        assert res == -1;
    }

    @Test
    public void highCardAce() {
        ArrayList<Card> cards1 = new ArrayList<>();
        cards1.add(new Card(1, 13));
        cards1.add(new Card(1, 1));
        cards1.add(new Card(0, 2));
        cards1.add(new Card(1, 3));
        cards1.add(new Card(2, 4));

        Hand h1 = new Hand(cards1);

        ArrayList<Card> cards2 = new ArrayList<>();
        cards2.add(new Card(1, 7));
        cards2.add(new Card(1, 1));
        cards2.add(new Card(1, 2));
        cards2.add(new Card(2, 3));
        cards2.add(new Card(3, 4));

        Hand h2 = new Hand(cards2);

        int res = h1.compareTo(h2);
        assert res == 1;
    }

    @Test
    public void highCardAceKing() {
        ArrayList<Card> cards1 = new ArrayList<>();
        cards1.add(new Card(1, 13));
        cards1.add(new Card(2, 12));
        cards1.add(new Card(0, 2));
        cards1.add(new Card(1, 3));
        cards1.add(new Card(2, 4));

        Hand h1 = new Hand(cards1);

        ArrayList<Card> cards2 = new ArrayList<>();
        cards2.add(new Card(2, 13));
        cards2.add(new Card(3, 11));
        cards2.add(new Card(1, 2));
        cards2.add(new Card(2, 3));
        cards2.add(new Card(3, 4));

        Hand h2 = new Hand(cards2);

        int res = h1.compareTo(h2);
        assert res == 1;
    }

    @Test
    public void highCardAceKingQueen() {
        ArrayList<Card> cards1 = new ArrayList<>();
        cards1.add(new Card(0, 13));
        cards1.add(new Card(0, 12));
        cards1.add(new Card(0, 11));
        cards1.add(new Card(1, 3));
        cards1.add(new Card(1, 4));

        Hand h1 = new Hand(cards1);

        ArrayList<Card> cards2 = new ArrayList<>();
        cards2.add(new Card(1, 13));
        cards2.add(new Card(1, 12));
        cards2.add(new Card(1, 11));
        cards2.add(new Card(2, 2));
        cards2.add(new Card(3, 4));

        Hand h2 = new Hand(cards2);

        int res = h1.compareTo(h2);
        assert res == 1;
    }

    @Test
    public void threeOfKindAce() {
        ArrayList<Card> cards1 = new ArrayList<>();
        cards1.add(new Card(0, 13));
        cards1.add(new Card(1, 13));
        cards1.add(new Card(2, 13));
        cards1.add(new Card(1, 3));
        cards1.add(new Card(2, 4));

        Hand h1 = new Hand(cards1);

        ArrayList<Card> cards2 = new ArrayList<>();
        cards2.add(new Card(0, 12));
        cards2.add(new Card(2, 12));
        cards2.add(new Card(3, 12));
        cards2.add(new Card(2, 3));
        cards2.add(new Card(3, 4));

        Hand h2 = new Hand(cards2);

        int res = h1.compareTo(h2);
        assert res == 1;
    }
}