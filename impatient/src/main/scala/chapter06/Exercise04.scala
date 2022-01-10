package chapter06

object Exercise04 extends App {

  val origin = Origin(1, 2)
  println(origin.x)
  println(origin.y)

  class Origin(val x: Int, val y: Int)

  object Origin {
    def apply(x: Int, y: Int): Origin = {
      new Origin(x, y)
    }
  }
}
