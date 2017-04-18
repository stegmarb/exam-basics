public class Card {
  private String color;
  private String value;

  public Card(String color, String value) {
    this.color = color;
    this.value = value;
  }

  public void representCard() {
    System.out.println(value + " " + color);
  }

  public String getColor() {
    return color;
  }
}
