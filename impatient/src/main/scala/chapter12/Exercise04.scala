package chapter12

import scala.math.signum

object Exercise04 extends App {
  println(fact(0))
  println(fact(3))
  println(fact(-3))

  def fact(n: Int): Int = n match {
    case 0 => 1
    case _ => (1 to math.abs(n)).foldLeft(signum(n))(_ * _)
  }
}
