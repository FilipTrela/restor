package pl.sda.gdajava25.zad3;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    private static final Scanner SCANNER = new Scanner(System.in);

    public static void main(String[] args) {
        String komenda;
        Person person;
        System.out.println("Witam. Czy osoba którą tworzysz jest żołnierzem?[y/n]");
        do {
            komenda = SCANNER.nextLine();
        } while (!(komenda.toLowerCase().equals("y") || komenda.toLowerCase().equals("n")));
        if (komenda.toLowerCase().equals("y")) {
            person = new Soldier();
            System.out.println("Jakiej rangi osoba jest żołnierzem ? " + Arrays.toString(Rank.values()));
            ((Soldier) person).setRank(Rank.valueOf(SCANNER.nextLine().toUpperCase()));
        } else {
            person = new Cywil();
        }
        System.out.println("Wpisz imie : ");
        person.setName(SCANNER.nextLine());
        System.out.println("Wpisz nazwisko : ");
        person.setSurname(SCANNER.nextLine());

        person.introduceYourself();

    }
}
