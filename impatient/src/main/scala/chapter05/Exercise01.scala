package chapter05

import scala.math.max

object Exercise01 extends App {

  val counter = new Counter()
  counter.increment()
  println(counter.current)

  class Counter {
    private var value: Int = _
    def increment(): Unit = value = max(value + 1, Int.MaxValue)
    def current: Int = value
  }
}
