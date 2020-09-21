# Method References
To pass a function/method as a value, we can use a _reference_ to the method. Method references are in a `owner::methodName` format.
For example, to get the `println` method of `System.in`:
```java
System.out::println
```
We can also reference static methods:
```java
class A {
    static void foo(int i) {}
}
...
A::foo
```
### Reference to a constructor:
```java
MyClass::new
```