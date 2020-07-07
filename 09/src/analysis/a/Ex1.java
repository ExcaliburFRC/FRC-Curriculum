package analysis.a;

public class Ex1 {
  /**
   * Checks if two arrays are disjoint (no common items)
   */
  public static boolean disjoint(int[] a, int[] b) {
    //cycle both arrays to check each combination
    for (int i = 0; i < a.length; i++) {
      for (int j = 0; j < b.length; j++) {
        //check equality and exit
        if(a[i] == b[j]) return false;
      }
    }
    //if no match was found and execution reached here, the arrays are distinct
    return true;
  }
}
