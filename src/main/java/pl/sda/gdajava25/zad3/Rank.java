package pl.sda.gdajava25.zad3;

public enum Rank {
    POLKOWNIK("Półkownik"),
    MAJOR("Major"),
    KAPITAN("Kapitan"),
    PORUCZNIK("Porucznik"),
    CHORAZY("Chorąży"),
    SIERZANT("Sierżant"),
    KAPRAL("Kapral");

    private String rank;

    Rank(String rank) {
        this.rank = rank;
    }

    public String getRank() {
        return rank;
    }
}
