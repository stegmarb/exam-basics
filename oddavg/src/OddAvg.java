import java.util.Arrays;
import java.util.List;

public class OddAvg {
  public static double oddAverage(List<Integer> numbers) {
    double sumOfOddNumbers = 0;
    double numOfOddNumbers = 0;
    for (Integer number : numbers) {
      if (number%2 == 1) {
        sumOfOddNumbers+=number;
        numOfOddNumbers++;
      }
    }
    return sumOfOddNumbers/numOfOddNumbers;
  }
}
