package analysis.q;

public class Ex1 {
  public static boolean f1(int[] a, int[] b) {
    for (int i = 0; i < a.length; i++) {
      for (int j = 0; j < b.length; j++) {
        if(a[i] == b[j]) return false;
      }
    }
    return true;
  }
}
