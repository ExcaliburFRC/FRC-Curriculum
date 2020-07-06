package analysis.q;

public class Ex2 {
  public static boolean f2(boolean[] array) {
    int v1 = 0;
    for (int i = 0; i < array.length; i++) {
      v1 += array[i]? 1 : -1;
    }
    return v1 >= 0;
  }
}
