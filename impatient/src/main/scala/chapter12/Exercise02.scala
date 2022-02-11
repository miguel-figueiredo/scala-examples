package chapter12

import scala.math.max

object Exercise02 extends App {

  val array = Array(1, -1, 15, 2, 100, 3)

  val result = array.reduceLeft(max)

  println(result)
}
