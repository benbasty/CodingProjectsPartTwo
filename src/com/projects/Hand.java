package com.projects;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Hand implements Comparable<Hand> {
    private ArrayList<Card> hand;


    public Hand(){
        this.hand = new ArrayList<>();
    }

    public void add(Card card){
        this.hand.add(card);
    }

    public void print() {
        //Iterator<Card> iterator = hand.iterator();
        //iterator.forEachRemaining(card -> System.out.println(card));
        for (Card card : this.hand) {
            System.out.println(card.toString());
        }
    }

    public void sort() {
        Collections.sort(this.hand);
    }

    @Override
    public int compareTo(Hand o) {
        int firstValue = this.hand.stream()
                .map(card -> card.getValue())
                .reduce(0, (a,b) -> a + b);
        int secondValue = o.hand.stream()
                .map(card -> card.getValue())
                .reduce(0, (a,b) -> a + b);
        return firstValue - secondValue;
    }

    public void sortBySuit() {
        Collections.sort(this.hand, new BySuitInValueOrder());
    }


}
