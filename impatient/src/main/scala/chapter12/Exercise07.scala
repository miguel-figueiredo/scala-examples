package chapter12

object Exercise07 extends App {

  val pairs = (1 to 10) zip (11 to 20)
  println(pairs.map(adjustToPair(_ * _)))

  def adjustToPair(fun: (Int, Int) => Int): ((Int, Int)) => Int =
    x => fun(x._1, x._2)
}
