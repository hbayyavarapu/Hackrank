package algorithms.codinginterview;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.List;

public class MainPoker {
    /**
     * Iterate through each line of input.
     */
    public static void main(String[] args) throws IOException {
        InputStreamReader reader = new InputStreamReader(System.in, StandardCharsets.UTF_8);
        BufferedReader in = new BufferedReader(reader);
        String line;
        List<String> hands = new ArrayList<String>();
        while ((line = in.readLine()) != null) {
            System.out.println(line);
            hands.add(line);
        }
        String[] hand1 = new String[5];
        String[] hand2 = new String[5];
        int i = 0;
        for(String str: hands) {
            if(i < 5) {
                hand1[i] = str;
            } else {
                hand2[i] = str;
            }
            i++;
        }

        System.out.println(hand1);
        System.out.println(hand2);
    }


}

class Card implements Comparable<Card>{
    private int value;
    private String suit;

    public Card(String s) {
        char[] c = s.toCharArray();
        if(c[0] == '1' || c[0] == '2' || c[0] == '3' || c[0] == '4' || c[0] == '5' ||  c[0] == '6'
                || c[0] == '7' || c[0] == '8' || c[0] == '9') {
            value = Integer.valueOf(c[0]);
        } else if(c[0] == 1 && c[1] == 0) {
            value = 10;
        } else {
            if(c[0] == 'J') {
                value = 11;
            } else if(c[0] == 'Q') {
                value = 12;
            } else if(c[0] == 'K') {
                value = 13;
            } else if(c[0] == 'A') {
                value = 14;
            }
        }
        suit = String.valueOf(c[1]);

    }

    public String getString() {
        String val = "";

        if(value >= 2 && value <= 10) {
            return String.valueOf(value);
        } else {
            if(value == 11 ) {
                return "J";
            }
            if(value == 12 ) {
                return "Q";
            }
            if(value == 13 ) {
                return "K";
            }
            if(value == 14 ) {
                return "A";
            }
        }

    return "";

    }

    public String getSuit() {
        return suit;
    }

    public int getValue() {
        return value;
    }

    public int compareTo(Card card) {

        if(this.getValue() > card.getValue()) {
            return 1;
        } else if(this.getValue() < card.getValue() ) {
            return -1;
        } else {
            return 0;
        }
    }

}

class Hand implements Comparable<Hand> {
    private  ArrayList<Card> hand;
    private int[] cardValues;
    private String[] suits;

    public Hand(ArrayList<Card> hand) {
        this.hand = hand;
        cardValues = cardValues();
        suits = getSuits();
    }


    public double getWinnerHand() {
        if(1 == 1) {
            return 1.0;
        }
        return 0.0;
    }

    private int[] cardValues() {
        int[] result = new int[5];
        for(int i = 0; i < hand.size(); i++) {
            result[i] = hand.get(i).getValue();
        }
        return result;
    }

    private String[] getSuits() {
        String[] suit = new String[5];
        for(int i = 0 ;i < hand.size(); i++) {
            suit[i] = hand.get(i).getSuit();
        }
        return suit;
    }

    public double isPair() {
        double result = 0.0;
        for(int i = 0; i < cardValues.length; i++) {
            result = 1.0 + (cardValues[i] * 0.01);
        }
        return result;
    }

    @Override
    public int compareTo(Hand o) {
        return 0;
    }
}
