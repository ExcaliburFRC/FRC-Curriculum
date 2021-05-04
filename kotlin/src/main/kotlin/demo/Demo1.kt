package demo

fun main() {
  I bought 3.watermelons


  Box.contents.forEach {
    println(it)
  }

  val x = 2
  abc(x, y = 2, z = 34)
}



























object I {
  infix fun bought(vegetable: Watermelon) {
    Watermelon()
  }
}

val Int.watermelons get() = Watermelon(this)

class Watermelon(private val amount: Int = 0) {
  fun ajufhdio() = amount
  init {
    print(amount)
  }
}

fun abc(x: Int = 3, y: Int = 4, z:Int = 3) {
  println("x [${x}] + y [$y] + z [$z] = ${x + y + z}")
}

object Box {
  val x = 0
  init {
    println("constructed")
  }
  var contents = listOf(1,2,3)
  init {
    print("list ctored")
  }
}
