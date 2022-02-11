package chapter14

import scala.collection.mutable._

object Exercise02 extends App {

  println(swap(1 -> 2))

  def swap(x: (Int, Int)): (Int, Int) =
    x match {
      case (a, b) => (b, a)
    }
}
