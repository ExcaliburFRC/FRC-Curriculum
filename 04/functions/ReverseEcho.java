import java.util.Scanner;

public class ReverseEcho {

  /**
   * An echo program that prints back all user input
   * until the exit code ('#EXIT') is entered.
   */
  public static void main(String[] args) {
    // create a Scanner to read user input
    Scanner userInputReader = new Scanner(System.in);
    String exitcode = "#EXIT";

    // print a greeting and explanation to the user
    System.out.println("Greetings, I am Ohce!");
    System.out.println("I will repeat all input until `"
                       + exitcode + "` is entered.");

    String currentInput;

    // infinite loop, check exitcode inside loop
    while(true) {
      // read the latest input
      currentInput = userInputReader.nextLine();
      // check if the user entered the exitcode
      // make sure to use `.equals()` to compare strings
      // and not `==`
      if(exitcode.equals(currentInput)) {
        System.out.println("You decided to stop. Bye!");
        // exit the loop/program
        return;
      }
      // we don't need an `else` here - why?
      System.out.println(reverseString(currentInput));
    }

  }

  /**
   * Reverses a String
   * @param str the string to reverse
   * @return str, reversed
   */
  public static String reverseString(String str) {
    StringBuilder result = new StringBuilder(str.length());
    for(int i = str.length() - 1; i >= 0; i--) {
      result.append(str.charAt(i));
    }
    return result.toString();
  }
}
