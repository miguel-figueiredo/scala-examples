package chapter12

object Exercise01 extends App {

  println(values(x => x * x, -5, 5))

  def values(fun: Int => Int, min: Int, max: Int): Seq[(Int, Int)] =
    (min to max).map(i => (i, fun(i)))
}
