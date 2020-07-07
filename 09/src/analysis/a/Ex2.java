package analysis.a;

public class Ex2 {
  /**
   * Returns which value appears more in the boolean array - True or False. Defaults to true
   * result:  True     False     True   
   *
   *          True     False     False
   *          False    False     False
   *          True     False     True
   *          True     True      True
   */
  public static boolean boolMajority(boolean[] array) {
    int v1 = 0;
    for (int i = 0; i < array.length; i++) {
      v1 += array[i]? 1 : -1;
    }
    return v1 >= 0;
  }
}
