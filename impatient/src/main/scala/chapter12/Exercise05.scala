package chapter12

import scala.math.{max, signum}

object Exercise05 extends App {

  val result = largest(x => 10 * x - x * x, 1 to 10)
  println(result)

  def largest(fun: Int => Int, inputs: Seq[Int]) =
    inputs.map(fun).max
}
