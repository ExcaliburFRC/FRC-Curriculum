package demo

fun main() {
  1 + 3 + 7
  1.plus(3).plus(7)

  add(3, 4)
  plus(3, 4)

  "Hello There!".print()

  repeat(4) {
    println(it)
  }

  listOf(1,2,3,4,5,6,7,8,9,10).filter {it > 4}.forEach { println(it)}
}

val plus: (Int, Int)->Int = {a: Int, b: Int -> a + b}
fun add(a: Int, b: Int): Int {
  return a + b
}

fun String.print() = println(this)
val strprint: String.()->Unit = {this.print()}
