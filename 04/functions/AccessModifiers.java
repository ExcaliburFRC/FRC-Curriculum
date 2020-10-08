package functions;

public class AccessModifiers {
  public static void main(String[] args) {
    /*
     * `public` - accessible from anywhere
     * `private` - only from current class/file
     */

    // sayHello() is accessible because it is `public`
    OtherFile.sayHello(); // works

    // whisperHello() is not accessible because it is `private`
    /* OtherFile.whisperHello();  -- compile error: `whisperHello is private in OtherFile` */

  }


}
