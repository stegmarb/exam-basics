import java.util.List;

public class OddAvg {
  public int oddAverage(List<Integer> numbers) {
    int sumOfOddNumbers = 0;
    int numOfOddNumbers = 0;
    for (Integer number : numbers) {
      if (number%2 == 1) {
        sumOfOddNumbers+=number;
        numOfOddNumbers++;
      }
    }
    return sumOfOddNumbers/numOfOddNumbers;
  }
}
