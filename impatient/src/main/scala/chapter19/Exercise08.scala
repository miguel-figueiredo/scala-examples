package chapter19

import scala.language.{existentials, postfixOps, reflectiveCalls}

object Exercise08 extends App {

  // Doesn't work...
  // printValues((x: Int) => x * x, 3, 6)
  printValues(Array(1, 1, 2, 3, 5, 8, 13, 21, 34, 55), 3, 6)

  type Consumer = { def apply(i: Int): Int }

  def printValues(f: Consumer, from: Int, to: Int): Unit =
    (from to to).map(f(_)).foreach(println)

}
