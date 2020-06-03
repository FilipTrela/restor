package pl.sda.gdajava25.zad2;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    private static final Scanner SCANNER = new Scanner(System.in);

    public static void main(String[] args) {
        Map<String, Integer> countingCommas = new HashMap<>();
        initalMap(countingCommas);
        StringBuilder textBuilder = new StringBuilder();
        String text;
        System.out.println("Wpisz zdania. By zakończyć wpisz [koniec]");
        do {
            text = SCANNER.nextLine();
            if (!text.toLowerCase().equals("koniec")) {
                textBuilder.append(text);
                countingCommas(countingCommas, text);
            }
        } while (!text.toLowerCase().equals("koniec"));
        String[] sentence = getSplit(textBuilder.toString());
        System.out.println("Wpisałeś " + sentence.length + " zdań.");
        System.out.println("Wpisałeś " + countingCommas.get("NoComma") + " zdań prostych.");
        System.out.println("Wpisałeś "
                + (sentence.length - countingCommas.get("NoComma"))
                + " zdań złożonych. Z czego " + countingCommas.get("OneComma")
                + " zdań posiadało jeden przecinek, " + countingCommas.get("TwoComma")
                + " zdań posiadało dwa przecinki, a " + countingCommas.get("MoreThanTwoComma")
                + " zdań posiadało więcej niż dwa przecinki.");


    }

    private static String[] getSplit(String text) {
        return text.split("[.?!]");
    }

    private static void countingCommas(Map<String, Integer> countingCommas, String text) {
        String[] split = getSplit(text);
        for (String sentence : split) {
            if (sentence.contains(",")) {
                int commas = 0;
                for (int i = 0; i < sentence.length(); i++) {
                    if (sentence.charAt(i) == ',') {
                        commas++;
                    }
                }
                if (commas == 1) {
                    countingCommas.replace("OneComma", countingCommas.get("OneComma") + 1);
                }
                if (commas == 2) {
                    countingCommas.replace("TwoComma", countingCommas.get("TwoComma") + 1);
                }
                if (commas > 2) {
                    countingCommas.replace("MoreThanTwoComma", countingCommas.get("MoreThanTwoComma") + 1);
                }

            } else {
                countingCommas.replace("NoComma", countingCommas.get("NoComma") + 1);
            }
        }
    }

    private static void initalMap(Map<String, Integer> countingCommas) {
        countingCommas.put("NoComma", 0);
        countingCommas.put("OneComma", 0);
        countingCommas.put("TwoComma", 0);
        countingCommas.put("MoreThanTwoComma", 0);
    }
}
