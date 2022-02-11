package chapter18

import scala.concurrent.ExecutionContext.Implicits.global
import scala.concurrent.duration.DurationInt
import scala.concurrent.{Await, Future}

object Exercise01 extends App {

  println(Pair(1, "xpto").swap)

  // A case class gets the toString method ;)
  case class Pair[T, S](first: T, second: S) {
    def swap: Pair[S, T] = new Pair(second, first)
  }
}
