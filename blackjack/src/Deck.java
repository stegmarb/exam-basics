import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Deck {
  private List<Card> deck = new ArrayList<>();

  public Deck(int wholeNumber) {
    fillDeck(wholeNumber);
  }

  public String giveRandomValue() {
    String[] values = {"1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King", "Ace"};
    return values[(int) (Math.random()*values.length)];
  }

  public void fillDeck(int wholeNumber) {
    int count = 0;
    for (int i = 0; i < wholeNumber; i++) {
      if (count == 0) {
      deck.add(new Card("Hearts", giveRandomValue()));
      } else if (count == 1) {
        deck.add(new Card("Clubs", giveRandomValue()));
      } else if (count == 2) {
        deck.add(new Card("Diamonds", giveRandomValue()));
      } else if (count == 3) {
        deck.add(new Card( "Spades", giveRandomValue()));
      }
      count++;
      if (count > 3) {
      count = 0;
      }
    }
  }

  public void deckShuffle() {
    Collections.shuffle(deck);
  }

  public Card draw() {
    deckShuffle();
    Card topCard = deck.get(0);
    deck.remove(deck.get(0));
    return topCard;
  }

  public int getColorAmount(String color) {
    int count = 0;
    for (Card card : deck) {
      if (card.getColor() == color) {
        count++;
      }
    }
    return count;
  }

  public String toString() {
    return deck.size() + " cards - " + getColorAmount("Clubs") + " Clubs, " + getColorAmount("Diamonds") + " Diamonds, " + getColorAmount("Hearts") + " Hearts, " + getColorAmount("Spades") + " Spades";
  }
}
