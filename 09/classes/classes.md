# Writing Classes
To define an object type, or _class_, use the `class` keyword:
```java
public class Message {
  // class definition
}
```
- the content of the definition is surrounded by braces (`{}`)
- the class name (should be in `UpperCamelCase`) needs to be identical to the name of the file 
  - (ex: the class `Message` must be in a file named `Message.java`)
- for now, classes should always be declared as `public`

### Object Properties
To declare object properties (and static class fields too), declare them inside the class braces:
```java
  private String message; // object property
  private static final String LINE_SEPARATOR = "\n"; // a static constant belonging to the class
```

### Methods
_Methods_, or object functions, are defined similarly to static functions, but without the `static` keyword.
The object the function is being called on can be accessed using the `this` keyword.
```java
  public void printMessage() {
    System.out.println(this.message);
  }
```
Multiple methods with the same name (with different parameter sets) are allowed

### Constructors
Definition of a constructor (special methods to create objects of the class), with a few differences:
- no return type
- the name of the method must be identical to the name of the class
```java
  public Message(String message) {
    this.message = message;
  }
```
Note that any object properties *must* be initialized in the constructor. 
Multiple constructors (with different parameter sets) are allowed.

### Visibility/Access Modifiers
Methods (including constructors) and properties/fields should be defined with an access modifier:
- `public`: accessible from anywhere
- `private`: accessible only from the class itself

### [Example](Message.java)
