/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author alexe
 */
import java.util.ArrayList;
import java.util.List;
import java.util.Iterator;
import java.util.Collections;
import java.util.Comparator;

public class Hand implements Comparable<Hand> {

    private List<Card> cards;

    public Hand() {
        this.cards = new ArrayList<>();
    }

    public void add(Card newCard) {
        this.cards.add(newCard);
    }

    public void print() {
        Iterator<Card> iterator = this.cards.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }

    public void sort() {
        Comparator<Card> comparator = Comparator.comparing(Card::getValue)
                .thenComparing(Card::getSuit);

        Collections.sort(cards, comparator);
    }

    public void sortBySuit(){
        BySuitInValueOrder sortByValueSorter=new BySuitInValueOrder();
        
        Collections.sort(cards,sortByValueSorter);
    }


    @Override

    public int compareTo(Hand compareHand) {
        int thisSum = this.cards.stream()
                .mapToInt(Card::getValue)
                .sum();
        int compareSum = compareHand.cards.stream()
                .mapToInt(Card::getValue)
                .sum();

        return thisSum - compareSum;

    }



}
