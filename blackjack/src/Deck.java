import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;

public class Deck {
  private List<Card> deck = new ArrayList<>();

  public Deck(int wholeNumber) {
  }

  public String giveRandomValue() {
    String[] values = {"1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King", "Ace"};
    return values[(int) (Math.random()*values.length)];
  }

  public void fillDeck() {
    int count = 0;
    for (int i = 0; i < deck.size(); i++) {
      if (count == 0) {
      deck.add(new Card(giveRandomValue(), "Hearts"));
      } else if (count == 1) {
        deck.add(new Card(giveRandomValue(), "Clubs"));
      } else if (count == 2) {
        deck.add(new Card(giveRandomValue(), "Diamonds"));
      } else if (count == 3) {
        deck.add(new Card(giveRandomValue(), "Spades"));
      }
      count++;
      if (count > 3) {
      count = 0;
      }
    }
  }
}
