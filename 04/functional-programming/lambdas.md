### Lambdas
We sometimes want to pass a function type value without creating a function for it. This can be done with lambda/anonymous functions, shortly referred to as lambdas.
The syntax for a lambda:
```java
(_<parameterlist>_) -> {_<lambda body>_}
```
Such as:
```java
Runnable helloWorld = () -> {
    System.out.println("Hello World!");
}
helloWorld.run();
```
prints:
```
Hello World!
```
Another example:
```java
Consumer<String> parameterizedHello = (String name) -> {
    System.out.println("Hello " + name + "!");
}