import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;

public class OddAvgTest {
  private static List<Integer> numbers = Arrays.asList(1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20);
  private List<Integer> emptyList;

  @Test
  public void testOddAverage() {
    double result = OddAvg.oddAverage(numbers);
    assertTrue(result == 10);
  }

  @Test
  public void testNullOddAverage() {
    assertNull(emptyList);
  }
}