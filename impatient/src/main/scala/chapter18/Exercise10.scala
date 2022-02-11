package chapter18

object Exercise10 extends App {

  println(Pair(1, 2).swap)

  case class Pair[T, S](var first: T, var second: S) {
    def swap()(implicit ev: T =:= S): Pair[T, S] = {
      val aux: T = first
      first = second.asInstanceOf[T]
      second = aux
      this
    }
  }
}
