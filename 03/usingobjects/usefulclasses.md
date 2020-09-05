# Useful Java classes
Each class contains more members than written here, but these are the more used ones.
### `System`
The `java.lang.System` class contains three useful static fields:
- `in` (terminal input): useful to create a Scanner object
- `out` (terminal output), `err` (error printing): useful for printing program output, errors, and user prompts

### `Random`
The `java.util.Random` class can be used to generate random numbers:
```java
import java.util.Random;
...
Random random = new Random();
double randomDouble = random.nextFloat(); // random double between 0.0 and 1.0
int randomInt1 = random.nextInt(limit); // random int between 0 and limit
int randomInt2 = random.nextInt(); // random int in full range of int values
```

### `Math`
The `java.lang.Math` class contains many static functions for mathematical operations, such as:
- `Math.abs(int)` : absolute value
- `Math.pow(double, int)` : raises a number to a power
- `Math.sqrt(double)` : square root of a number

### `String`
The `java.lang.String` class contains many functions, some static. Assuming a `String` object named `str`:
- `str.charAt(int)`: the character at an index, note that indexes start at 0
- `str.length()`: the length of the string
- `String.format(String, Object...)`: formats a string
- `str.toUpper/LowerCase()`: converts the string to upper/lower case
- `str.indexOf(char)`: returns the first index of the character (if not found, `-1`)
