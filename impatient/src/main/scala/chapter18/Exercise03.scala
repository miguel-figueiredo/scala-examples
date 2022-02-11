package chapter18

object Exercise03 extends App {

  println(swap(Pair(2, "two")))

  def swap[T, S](pair: Pair[T, S]): Pair[S, T] =
    new Pair(pair.second, pair.first)

  case class Pair[T, S](first: T, second: S) {
  }
}
