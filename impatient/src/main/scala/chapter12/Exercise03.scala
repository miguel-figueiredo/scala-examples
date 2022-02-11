package chapter12

import scala.math.{max, signum}

object Exercise03 extends App {

  println(fact(0))
  println(fact(3))
  println(fact(-3))

  def fact(n: Int): Int = signum(n) match {
    case 0 => 1
    case 1 => (1 to n).reduceLeft(_ * _)
    case -1 => -(1 to -n).reduceLeft(_ * _)
  }
}
