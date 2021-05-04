package demo

import java.lang.Math.random

/*
This is a demo of Kotlin variables/properties.
Docs: https://kotlinlang.org/docs/reference/properties.html

Key questions:
- can an immutable/read-only/final/constant property have a different value each time it's read?

 */


fun main() {
  println("x = ${x}")
  println("y = ${y}")
//     x = 2 // error: Val cannot be reassigned
  y = 4.toDouble()
  println("x = ${x}")
  println("y = ${y}")
}

/*
Properties can have custom getters/setters; otherwise they behave as usual variables.
The backing field can be referenced as `field` inside the getters/setters; it will be generated if needed.

For each of these properties (`x` and `y`), you can experiment to see if the backing field is generated or not:
1. comment out all references of `field`, the initial value; and uncomment the custom getter.
  - or the other way around: comment out the custom getter and uncomment the initial value and references of `field`.
2. recompile.
3. run `javap -private ./build/classes/kotlin/main/demo/VariablesKt.class` in the terminal.
If the backing field is generated, a line with `private static final double x`/`private static double y` will be in the terminal output.
 */

val x: Double // val(value): read-only property
//    = 5.0 // initial value
  get() { // custom getter - fits `getX()`
    return random()
  }

var y: Double // var(variable): read/write property
        = 2.0 // initial value
  set(value) { // custom setter - fits `setX()`
    field = value // field is the backing variable
    // the backing variable (`private final y`) will be generated if needed
    println("y was set to $value")
  }
//  get() = random() // custom getter `getY()`
