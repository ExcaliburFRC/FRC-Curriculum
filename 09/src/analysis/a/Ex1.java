package analysis.a;

public class Ex1 {
  /**
   * Checks if two arrays are disjoint (no common items)
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
