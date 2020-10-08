package functionalProgramming.old;

import java.util.function.*;
public class FP {
    void hello() {
        System.out.println("Hello");
    }
    public static void main(String[] args) {
        FP fp = new FP();
        HRLP hrlp = new HRLP();
        fp.hello();
        Consumer<String> printer = s -> System.out.println(s);
//        printer.accept(3);
        Supplier<HRLP> ctor = HRLP::new;
        Runnable fphello = hrlp::plus;///!!!
        fphello.run();
        fphello = () -> System.out.println("This is a lambda");//!!!
        fphello.run();
        fphello = ctor.get()::plus;
        fphello.run();

        BiConsumer<String, String> printconcat = (a, b) -> System.out.println(a + b);
        printconcat.accept("THIS", "Lambda");
        printconcat = FP::printconcat;
        printconcat.accept("THIS", "Mehtod ref");

    }

    static void printconcat(String a, String b) {
        System.out.println(a + b);
    }
}

class HRLP {
    void plus() {
        System.out.println("1 + 1");
    }
}
