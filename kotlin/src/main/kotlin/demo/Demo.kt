package demo

fun main() {
  val x = 5

  println(
    when {
      x >= 4 -> "hi"
      x == 1 || x == 2 -> "bye"
      else -> "nope"
    }
  )
  repeat(10) { i ->
  }
}
