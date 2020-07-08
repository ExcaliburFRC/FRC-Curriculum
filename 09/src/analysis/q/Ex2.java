package analysis.q;

public class Ex2 {
  public static boolean f2(boolean[] array) {
    int v1 = 0;
    for (int i = 0; i < array.length; i++) {
      if (array[i] == true) {
        v1 += 1;
      } else {
        v1 += -1;
      }
    }
    //v1 = (true_count) - (false_count)
    return v1 >= 0;
  }
}
