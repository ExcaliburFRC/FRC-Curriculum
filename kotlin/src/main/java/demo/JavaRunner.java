package demo;

import java.util.Optional;

public class JavaRunner {
  public static void main(String[] args) {
    String b = "haiudfhcaue";
    useA(b);
    String a = null;
    // ****
    useA(a);
  }

  private static void useA(String a) {
    if (a == null) {
      return;
    }
    a.length();
  }

  Optional<String> stringToOptional(String str) {
    return Optional.of(str);
  }

  public static String getString() {
    return null;
  }



}
