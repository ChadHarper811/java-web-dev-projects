package org.launchcode;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class CountingCharactersSuperBonus {
    public static void main(String[] args) {
        String quoteFromFile = "";
        try {
            File textFromFile = new File("control-flow-and-collections/Studio/src/main/java/org/launchcode/quote.txt");
            Scanner myReader = new Scanner(textFromFile);
            if (myReader.hasNextLine()) {
                quoteFromFile = myReader.nextLine();
            }
            myReader.close();
        } catch (FileNotFoundException e) {
            System.out.println("An error occurred when trying to read quote from file.");
        }
        String alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";

        char[] charactersInString = quoteFromFile.toUpperCase().toCharArray();
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
