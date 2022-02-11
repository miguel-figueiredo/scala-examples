package chapter10

import java.awt.Point

object Exercise02 extends App {

  val point = new OrderedPoint
  println(point.compare(new Point(0, 0)))
  println(point.compare(new Point(-1, 30)))
  println(point.compare(new Point(0, 30)))

  class OrderedPoint extends Point with scala.math.Ordered[Point] {
    override def compare(that: Point): Int = {
      if(this.x != that.x) this.x.compare(that.x)
      else this.y.compare(y)
    }
  }
}
