package chapter18

object Exercise02 extends App {

  println(Pair(1, 2).swap)

  case class Pair[T](var first: T, var second: T) {
    def swap: Pair[T] = {
      val aux: T = first
      first = second
      second = aux
      this
    }
  }
}
