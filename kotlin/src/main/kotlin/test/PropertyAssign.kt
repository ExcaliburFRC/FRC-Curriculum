package test

import kotlin.reflect.KMutableProperty0
import kotlin.system.measureTimeMillis

const val k = 1_000_000

class AS {
  var x: Int = 2
}

fun main() {
  val a = AS()

  val t4 = measureTimeMillis {
    val consumer: (Int) -> Unit = { a.x = it }
    repeat(k) { i ->
      consumer(i)
    }
  }
  println("$t4 { a.x = it }")
  assert(a.x == k)
  a.x = 0

  val t = measureTimeMillis {
    repeat(k) { i ->
      a::x.set(i)
    }
  }
  println("$t a::x.set(i)")
  assert(a.x == k)
  a.x = 0

  val t2 = measureTimeMillis {
    repeat(k) { i ->
      bind(a::x, i)
    }
  }
  println("$t2 bind(a::x, i)")
  assert(a.x == k)
  a.x = 0


  val t3 = measureTimeMillis {
    val consumer: (Int) -> Unit = a::x.setter
    repeat(k) { i ->
      consumer(i)
    }
  }
  println("$t3 a::x.setter (cached ref)")
  assert(a.x == k)
  a.x = 0

  val t5 = measureTimeMillis {
    repeat(k) { i ->
      a.x = i
    }
  }
  println("$t5 a.x = i")
  assert(a.x == k)
  a.x = 0


  val t6 = measureTimeMillis {
    val consumer: (Int) -> Unit = a::x::set
    repeat(k) { i ->
      consumer(i)
    }
  }
  println("$t6 a::x::set (cached ref)")
  assert(a.x == k)
  a.x = 0


  val t7 = measureTimeMillis {
    repeat(k) { i ->
      _bind(a::x, i)
    }
  }
  println("$t7 inline bind(a::x, i)")
  assert(a.x == k)
  a.x = 0

  val t8 = measureTimeMillis {
    repeat(k) { i ->
      _bind(a::x, i)
    }
  }
  println("$t8 inline reified bind(a::x, i)")
  assert(a.x == k)
  a.x = 0

  repeat(100) {}
}

fun <T> bind(prop: KMutableProperty0<T>, value: T) {
  prop.set(value)
}

inline fun <T> _bind(prop: KMutableProperty0<T>, value: T) {
  prop.set(value)
}

inline fun <reified T> r_bind(prop: KMutableProperty0<T>, value: T) {
  prop.set(value)
}