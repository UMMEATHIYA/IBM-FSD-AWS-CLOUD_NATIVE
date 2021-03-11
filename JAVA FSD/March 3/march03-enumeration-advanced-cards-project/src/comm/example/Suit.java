package comm.example;

public enum Suit {
    SPADES("Spades"),
    HEARTS("Hearts"),
    CLUBS("clubs"),
    DIAMONDS("Diamonds");
    private final String name;

    private Suit(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
