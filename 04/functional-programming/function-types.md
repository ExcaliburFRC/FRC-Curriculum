# Function Types
There are three base function types:
- `Runnable`
- `Supplier<T>`
- `Consumer<T>`
- `Function<T,R>`
### `Runnable`
The `Runnable` function type represents a function with a `void` return type and no parameters. To use a function stored in a `Runnable` variable, call the `run()` function:
```java
class A {
    static void foo() {
        System.out.println("A.foo()");
    }
}
...
Runnable r = A::foo;
r.run();
```
prints:
```
A.foo()
```
### `Supplier<T>`
The `Supplier` function type family represents functions that have no parameters but return a value. The basic `Supplier<T>` has no parameters and returns `T`. To call the stored function, use `get()`
For example:
```java
// in Hi.java
String hello() {
    return "Hello World!";
}
...
Hi h = new Hi();
Supplier<String> helloSupplier = h::hello;
System.out.println(helloSupplier.get());
```
prints:
```
Hello World!
```
### `Consumer<T>`
The `Consumer` family represents functions that return `void` and have parameters. The basic `Consumer<T>` is a function with a single parameter of type `T` and returns `void`. To call the stored function, use `accept(t)`.
For example:
```java
Consumer<String> printer = System.out::println;
printer.accept("Hello World!");
```
prints:
```
Hello World!
```
### `Function<T,R>`
The `Function` family represents functions that have both parameters and a meaningful return type. The basic `Function<T,R>` is a function with a single parameter of type `T` and returns `R`.
For example:
```java
// in Hi.java
String parameterizedHello(String name) {
    return "Hello " + name + "!";
}
...
Function<String, String> ph = h::parameterizedHello;
printer.accept(ph.apply("Dan"));
```
prints:
```
Hello Dan!
```
### Primitive Versions
Primitive types (`double`, `int`, `boolean`, etc) don't go well with generics (the `<T>` part), so a version of each family exists for each primitive type, such as: `IntSupplier`, `BooleanConsumer`. The primitive versions of the `Function` family are more complicated, [docs](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/function/package-summary.html) should be searched for them.
