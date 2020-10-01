public class BreakContinueExample {
  public static void main(String[] args) {
    /*
     * This shows the difference between
     * `continue` and `break`
     
     * This will print 0 1 3 4 (separated by lines)
     * because it skips 2 and exits on  5
     */

    int k = -1;
    while(true) {
      k++;
      if(k == 5) {
        // `break` completely exits the loop
        break;
      }
      // if k == 2 continue to next iteration
      if(k == 2) {
        // `continue` skips to the next iteration /
        // goes to the top of the loop
        continue;
      }
      System.out.println("k = " + k);
    }
    
  }
}
