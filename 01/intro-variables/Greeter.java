import java.util.Scanner;

public class Greeter {
  public static void main(String[] args) {
  
    // create a new Scanner that reads user-entered input
    Scanner input = new Scanner(System.in);
    
    // prompts the user to enter their name
    System.out.println("What's your name?");
    
    // stores the user's response
    String name = input.nextLine();
    
    // prints a greeting
    System.out.println("Hello " + name);
  }
}
