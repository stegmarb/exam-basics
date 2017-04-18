import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Deck {
  private List<Card> deck = new ArrayList<>();

  public Deck(int wholeNumber) {
  }

  public String giveRandomValue() {
    String[] values = {"1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King", "Ace"};
    return values[(int) (Math.random()*values.length)];
  }

  public String giveRandomCorol() {
    String[] colors = {"Hearts", "Clubs", "Spades", "Diamonds"};
    return colors[(int) (Math.random()*colors.length)];
  }
}
