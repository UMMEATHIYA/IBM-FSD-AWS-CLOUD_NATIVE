package comm.example;

public class PlayingCardVersion2 {
    private Suit suit;
    private int rank;

    public PlayingCardVersion2(Suit suit, int rank)
    {
        this.suit = suit;
        this.rank = rank;
    }

    public Suit getSuit(){
        return suit;
    }

    public String getSuitName() {
        String name = "";
        switch (suit){
            case SPADES: name = "Spades";
            break;
            case HEARTS: name = "Hearts";
            break;
            case CLUBS: name = "Clubs";
            break;
            case DIAMONDS: name = "Diamonds";
            break;
            default:
        }
        return name;
    }

    public int getRank() {
        return rank;
    }

    public void setRank(int rank){
        this.rank = rank;
    }
}
