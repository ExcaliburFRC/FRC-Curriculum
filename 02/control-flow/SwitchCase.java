public class SwitchCase {
  public static void main(String[] args) {
    int x = 2;
    
    /*
     * A `switch` conditional compares the value (here: x)
     * to the different `case`s and runs the first match.
     * This is useful when we want to compare to multiple values.
     */
    switch (x) {
    // check if x == 1
      case 1:
        // print
        System.out.println("x == 1");
        // without `break`,
        // code will continue to the next case (fall-through)
        break;
      case 2:
        System.out.println("x == 2");
        break;
      // the `default` clause is run if no match has been found
      default:
        System.out.println("x is neither 1 nor 2");
    }

    // an `if` equivalent to the `switch` above
    // with few cases this is ok,
    // but with more it will be ugly
    if (x == 1) {
      System.out.println("x == 1");
    } else if (x == 2) {
      System.out.println("x == 2");
    } else {
      System.out.println("x is neither 1 nor 2");
    }

  }
}
