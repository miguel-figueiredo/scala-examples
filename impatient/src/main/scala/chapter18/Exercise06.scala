package chapter18

object Exercise06 extends App {

  println(middle("World"))

  def middle[T](iterable: Iterable[T]): T =
    iterable.drop(iterable.size / 2).head
}
