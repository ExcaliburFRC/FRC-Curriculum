package analysis.a;

public class Ex1 {
  /**
   * Checks if two arrays share at least 1 common value somewhere within them (the array are called "disjoint")
   *  true:      a       b       false:            a     b   
   *             1       2                         1     2
   *             3       4                         3     5    // will exit after 5 iterations
   *             5       6                         5     6
   *
   */
  public static boolean disjoint(int[] a, int[] b) {
    for (int i = 0; i < a.length; i++) {
      for (int j = 0; j < b.length; j++) {
        if(a[i] == b[j]) return false;
      }
    }
    return true;
  }
}
