package chapter12

object Exercise08 extends App {

  val strings = Array("Olá", "Hello")
  val sizes = Array(3, 5)

  println(strings.corresponds(sizes)(_.length == _))
}
