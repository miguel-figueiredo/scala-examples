package chapter14

object Exercise10 extends App {

  val f = (x: Double) => if(x != 1) Some(x) else None
  val g = (x: Double) => if(x > 0) Some(x) else None

  val h = compose(f, g)

  println(h(2))
  println(h(1))
  println(h(0))

  def compose(f: Double => Option[Double], g: Double => Option[Double]): Double => Option[Double] = f(_).flatMap(g)
}
