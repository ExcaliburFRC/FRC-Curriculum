package git;

import java.util.function.Consumer;
import java.util.function.Supplier;

public class LambdaTricks {
  public static <T> Runnable combine(Supplier<T> supplier, Consumer<T> consumer) {
    return () -> {
      consumer.accept(supplier.get());
    };
  }
}
