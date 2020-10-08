package controlFlow;

public class Loops {
  public static void main(String[] args) {
    int i = 0;
    
    /* 
     * This file shows an example of the different loops in Java.
     * All three loops will print the same thing (the numbers 0-4 line-separated).
     */
    
    // The `while` loop checks the condition (here: i < 5) *before* each iteration.
    // So for the first 5 iterations when i is 0..4 the loop will run and print. 
    while(i < 5) {
      // print i
      System.out.println(i);
      // advance i
      i++;
    }
    
    // reset i for the next loop
    i = 0;
    
    // The `do ... while` loop checks the condition (here: i < 5) *after* each iteration.
    // So for the first 5 iterations when i is 0..4 the loop will run and print. 
    do {
      // print i
      System.out.println(i);
      // advance i
      i++;
      //check if i < 5
    } while(i < 5);
    
    
    // The `for` loop is the most complex but also most useful.
    // The `for` loop has three parts in its header - initialization, condition, update
    // The three are separated by semicolons (`;`)
    //
    // The order of a for loop is:
    //    1. run initialization
    //    2. check condition
    //       - if false, exit   
    //    3. run loop body
    //    4. run update
    //    5. start again from 2
    //
    // So for the first 5 iterations when i is 0..4 the loop will run and print. 
    // initilize; condition; update
    for (i = 0; i < 5; i++) {
      // print i
      System.out.println(i);
    }
  }
}
