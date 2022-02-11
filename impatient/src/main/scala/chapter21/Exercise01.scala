package chapter21

object Exercise01 extends App {

  // ArrowAssoc provides an implicit -> method which doesn't exist in string, which converts the string into ArrowAssoc.
  println("Hello" -> 1)
  println("Hello".->(2))
  println(new ArrowAssoc[Int](1).->(1))
}
