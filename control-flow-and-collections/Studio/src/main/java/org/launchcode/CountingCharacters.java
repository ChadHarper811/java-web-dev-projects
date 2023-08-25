package org.launchcode;

import java.util.Scanner;
import java.util.HashMap;
import java.util.Map;

public class CountingCharacters {
    public static void main(String[] args) {
        String myString = "If the product of two terms is zero then common sense says at least one of the two terms has to be zero to start with. So if you move all the terms over to one side, you can put the quadratics into a form that can be factored allowing that side of the equation to equal zero. Once you’ve done that, it’s pretty straightforward from there.";
        Scanner input = new Scanner(System.in);
        System.out.println("Enter text to count characters from: ");
        String userString = input.nextLine();
        String alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";

        char[] charactersInString = userString.toUpperCase().toCharArray();
        HashMap<Character, Integer> Characters = new HashMap<>();

        for (char letter : charactersInString) {
            if (alphabet.indexOf(letter) >= 0) {
                if (Characters.containsKey(letter)) {
                    Characters.put(letter, Characters.get(letter) + 1);
                } else {
                    Characters.put(letter, 1);
                }
            }
        }
        for (Map.Entry<Character, Integer> character : Characters.entrySet()) {
            System.out.println(character.getKey() + ": " + character.getValue());
        }
    }
}
