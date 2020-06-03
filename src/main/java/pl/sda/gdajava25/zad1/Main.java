package pl.sda.gdajava25.zad1;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class Main {
    private static final Scanner SCANNER = new Scanner(System.in);

    public static void main(String[] args) {
        String text;
        Map<Character, Integer> numberOfDotsAndCommas = new HashMap<>();
        initMap(numberOfDotsAndCommas);
        System.out.println("Wpisz tekst : ");
        text = SCANNER.nextLine();
        counting(text, numberOfDotsAndCommas);
        print(numberOfDotsAndCommas);


    }

    private static void print(Map<Character, Integer> numberOfDotsAndCommas) {
        Set<Character> keySet = numberOfDotsAndCommas.keySet();
        for (Character key : keySet) {
            System.out.println(key + " wpisałeś " + numberOfDotsAndCommas.get(key) + " razy.");
        }
    }

    private static void counting(String text, Map<Character, Integer> numberOfDotsAndCommas) {
        char[] textToChars = text.toCharArray();
        for (char c : textToChars) {
            for (Character key : numberOfDotsAndCommas.keySet()) {
                if (c == key) {
                    numberOfDotsAndCommas.replace(key, numberOfDotsAndCommas.get(key) + 1);
                }
            }
        }
    }

    private static void initMap(Map<Character, Integer> numberOfDotsAndCommas) {
        numberOfDotsAndCommas.put('.', 0);
        numberOfDotsAndCommas.put(',', 0);
    }

}
