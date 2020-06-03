package pl.sda.gdajava25.zad3;

import lombok.Data;

@Data
public class Soldier extends Person {
    private Rank rank;

    @Override
    public void introduceYourself() {
        System.out.println("Tu " + name + " " + surname + ", " + rank.getRank() + " Polskich sił zbrojnych!");
    }
}
