# Checking types at runtime using `instanceof`
- Polymorphism sometimes causes confusion as to the runtime type of an object
- The `instanceof` keyword can be used to check the runtime type of a variable
- The statement `var instanceof T` returns `true` if `var` is an object of class `T` (or a subclass of `T`) and `false` otherwise
Some examples:
```java
new Point(0,0) instanceof Point // true
new Point(0,0) instanceof Time // false
new Point(0,0) instanceof Object // true
null instanceof Point // false
```
A `instanceof` check is usually paired with a _cast_ to the type we checked:
```java
if(p instanceof Point) {
  Point point = (Point) p;
  // here we can use `x` as a `Point` object
}
