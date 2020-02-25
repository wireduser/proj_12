package com.education_wired_.work11;

import java.util.Arrays;

public class Runner {
    public void Run(){
        Card cards[] = fillCards();
        printCards(cards);
    }

    private Card[] fillCards(){
        Card[] cards = new Card[52];
        int index = 0;
        for (Suit suit : Suit.values()){
            for(Rank rank: Rank.values()){
                cards[index++] = new Card(suit,rank);
            }
        }
        return cards;
    }

    private void  printCards(Card[] cards){
        for (Card card: cards){
            System.out.println(card.toString());
        }
    }

}

