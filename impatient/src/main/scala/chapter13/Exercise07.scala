package chapter13

object Exercise07 extends App {
  val prices = List(1.4, 20.1, 10.5)
  val quantities = List(10, 20, 30)

  val result = prices.zip(quantities).map(Function.tupled(_ * _))

  println(result)
}
