package demo

fun main() {
  println("What's your name?")
  val name: String? = readLine()


  name?.run {
    println("Your name is $this")
  }
}
