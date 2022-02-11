package chapter14

object Exercise03 extends App {

  println(swap(Array(1)).mkString)
  println(swap(Array(1, 2)).mkString)

  def swap(array: Array[Int]): Array[Int] =
    array match {
      case Array(a, b, tail @ _*) => Array(b, a) ++ tail
      case _ => array
    }
}
