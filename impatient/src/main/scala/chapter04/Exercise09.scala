package chapter04

object Exercise09 extends App {
  val array = Array(1, 2, 3, 4, 5)
  println(lteqgt(array, 3))

  def lteqgt(values: Array[Int], v: Int): (Int, Int, Int) = {
    (values.count(_ < v), values.count(_ == v), values.count((_ > v)))
  }
}
