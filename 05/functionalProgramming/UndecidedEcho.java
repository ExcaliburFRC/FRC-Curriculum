package functionalProgramming;
import java.util.Scanner;
import java.util.function.Function;

public class UndecidedEcho {
  public static void main(String[] args) {
    final Scanner input = new Scanner(System.in);
    System.out.println(""); // greeting
    final String exitcode = "#EXIT";
    final String reversecode = "#OHCE";
    final String directcode = "#ECHO";

    String currentInput;
    Function<String, String> currentMode = Function.identity();

    while (true) {
      currentInput = input.nextLine();
      if (exitcode.equals(currentInput)) {
        // bye!
        return;
      }
      if (reversecode.equals(currentInput)) {
        // save method ref to `reverseString` to mode
        currentMode = UndecidedEcho::reverseString;
        // lambda version of the previous line
        // currentMode = str -> reverseString(str);

        // continue to next iteration, don't run on
        continue;
      }
      if (directcode.equals(currentInput)) {
        // save identity function (returns the input) to mode
        currentMode = str -> str; // Function.identity() can be used instead
        continue;
      }
      String output = currentMode.apply(currentInput);
      System.out.println(output);
    }

  }


  /**
   * Reverses a String
   *
   * @param str the string to reverse
   * @return str, reversed
   */
  public static String reverseString(String str) {
    StringBuilder result = new StringBuilder(str.length());
    for (int i = str.length() - 1; i >= 0; i--) {
      result.append(str.charAt(i));
    }
    return result.toString();
  }
}
