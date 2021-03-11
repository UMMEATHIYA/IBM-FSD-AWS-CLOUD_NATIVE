package comm.example;

public class TestPlayingCard2 {
    public static void main(String args[])
    {
        PlayingCardVersion2 card3 = new PlayingCardVersion2(Suit.SPADES,2);
        System.out.println("card1 is the " +card3.getRank()+ " of " +card3.getSuitName());
    }
}
