package controlFlow;

import java.util.Scanner;

public class Echo {

  /**
   * An echo program that prints back all user input
   * until the exit code ('#EXIT') is entered.
   */
  public static void main(String[] args) {
    // create a Scanner to read user input
    Scanner userInputReader = new Scanner(System.in);
    String exitcode = "#EXIT";
    
    // print a greeting and explaination to the user
    System.out.println("Greetings, I am Echo!");
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
        // exit the loop
        break;
      }
      // we don't need an `else` here - why?
      System.out.println(currentInput);
    }
  
  }
}
