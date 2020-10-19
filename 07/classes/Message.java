package classes;
import java.util.function.Consumer;
public class Message {
  private String message; // a private object property/field
  
  /**
   * Create a new Message object with the given message String.
   */
  public Message(String message) {
    this.message = message;
  }
  
  /**
   * Print the message to an output.
   */
  public void printMessage(Consumer<String> output) {
    output.accept(message);
  }
  
  /**
   * Print the message to {@code System.out }
   */
  public void printMessage() {
    this.printMessage(System.out::println);
  }
  
  /**
   * Changes the message stored.
   */
  public void setMessage(String newMessage) {
    this.message = newMessage;
  }
}
