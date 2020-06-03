package pl.sda.gdajava25.zad3;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public abstract class Person {
    String name;

    String surname;

    public abstract void introduceYourself();
}
