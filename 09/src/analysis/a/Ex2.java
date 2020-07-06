package analysis.a;

public class Ex2 {
  /**
   * Finds the majority of the array - defaults to true
   */
  public static boolean boolMajority(boolean[] array) {
    int v1 = 0;
    for (int i = 0; i < array.length; i++) {
      v1 += array[i]? 1 : -1;
    }
    return v1 >= 0;
  }
}
