package test

class A {
  val s = "a"
  fun InSim.f() = s
}

class InSim

fun sim(action: InSim.()->Unit) = InSim().action()

fun main() {
  val a = A()
  sim { a }

}
