public class StringFormat {
  public static void main(String[] args) {
    String str = "habgdirnfcvijanf";

    System.out.println(str.charAt(7)); // 'n'
    System.out.println(str.indexOf('a')); // 1
    System.out.println(str.lastIndexOf('a')); // 13
    System.out.println(str.replace('f', ' ')); // "habgdirn cvijan "
    System.out.println(str.replace("fc", "")); // "habgdirnvijanf"
    System.out.println(str.toUpperCase()); // "HABGDIRNFCVIJANF"

    System.out.println(String.format("The string is: %s", str)); // "The string is: habgdirnfcvijanf"
    System.out.println(String.format("The number is: %d", 3)); // "The number is: 3"
    System.out.println(String.format("(%d, %d)", 5, 3)); // "(5, 3)"
    System.out.println(String.format("i am %s and i am %d years old", "myname", 3)); // "i am myname and i am 3 years old"

  }
}
