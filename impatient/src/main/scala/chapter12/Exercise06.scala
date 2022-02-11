package chapter12

object Exercise06 extends App {

  val result = largest(x => 10 * x - x * x, 1 to 10)
  println(result)

  def largest(fun: Int => Int, inputs: Seq[Int]): Int =
    inputs.map(x => (x, fun(x))).reduce((x, y) => if(x._2 > y._2) x else y)._1
}
