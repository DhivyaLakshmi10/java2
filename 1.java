"""Collect Unique Symbols From Set of Cards
Playing cards during travel is a fun-filled experience. For this game, they wanted to collect all four unique symbols. Can you help these guys to
collect unique symbols from a set of cards?
Create Card class with attributes symbol and number. From our main method collect each card details (symbol and number) from the user.
Collect all these cards in a set, since the set is used to store unique values or objects.
Cards need to be compared with each other to identify whether both the cards are the same symbol. For this, we need to implement equals
method to tell whether both the cards are same or not.
Once we collect all four different symbols display the first occurrence of card details in alphabetical order.
Hint :
The first file name should be Main.java """

import java.lang.*;
import java.util.*;

public class p1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Map<Character,Card> map = new TreeMap<>();
        int count = 0;
        boolean flag;
        do {
            Card c  = new Card();
            System.out.println("Enter a card: ");
            c.setSymbol(sc.nextLine().trim().charAt(0));
            c.setNumber(sc.nextInt());
            sc.nextLine();
            if(!map.containsKey(c.getSymbol()))
                map.put(c.getSymbol(),c);
            count++;
            flag = !map.containsKey('a') || !map.containsKey('b') || !map.containsKey('c') || !map.containsKey('d');

        }while(flag);


        System.out.println();
        System.out.println("Four symbols gathered in "+count+" Cards.");
        System.out.println("Cards in Set are: ");

        for(char ch:map.keySet()) {
            System.out.println(ch+" "+map.get(ch).getNumber());
        }
        sc.close();
    }

}

class Card {
    private Character symbol;
    private Integer number;

    public Card() {
    }

    public Card(Character symbol, Integer number) {
        this.symbol = symbol;
        this.number = number;
    }

    public Character getSymbol() {
        return symbol;
    }

    public void setSymbol(Character symbol) {
        this.symbol = symbol;
    }

    public Integer getNumber() {
        return number;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }


    @Override
    public boolean equals(Object card) {
        if (card instanceof Card c) {
            return (c.symbol == this.symbol);
        } else {
            return false;
        }
    }

    @Override
    public String toString() {
        return "Card{" +
                "symbol='" + symbol + '\'' +
                ", number='" + number + '\'' +
                '}';
    }
    @Override
    public int hashCode() {
        return String.valueOf(symbol).hashCode();
    }
}
