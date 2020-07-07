package analysis.q;

import java.util.Set;

public class Ex4 {
  public static int avg(Set<Integer> numbers) {
    int count = 0;
    int sum = 0;
    for (int number : numbers) {
      sum += number;
      count++;
    }
    return sum / count;
  }
}
