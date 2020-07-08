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
    int balance = 0;
    for (int i = 0; i < array.length; i++) {
      //count in a way that false and true values cancel each other,
      //meaning that the state of balance points to the majority:
      // balance > 0 -> true majority
      // balance > 0 -> false majority
      // balance = 0 -> equal
      if (array[i]) {
        balance += 1;
      } else {
        balance += -1;
      }
    }
    return balance >= 0;
  }
}
