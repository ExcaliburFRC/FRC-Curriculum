package git;

import java.util.Scanner;
import java.util.function.Consumer;
import java.util.function.Supplier;

public class LambdaTricks {
  public static <T> Runnable combine(Supplier<T> supplier, Consumer<T> consumer) {
    return () -> {
      consumer.accept(supplier.get());
    };
  }

  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    Runnable run2 = combine(() -> in.nextLine().toUpperCase(),
            System.out::println);
    for (int i = 0; i < 8; i++) {
      run2.run();
    }
  }
}
