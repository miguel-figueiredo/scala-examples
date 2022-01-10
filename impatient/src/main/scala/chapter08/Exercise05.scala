package chapter08

object Exercise05 extends App {

 val point = new LabeledPoint("Black Thursday", 1929, 230.07)
 println(point.label)
 println(point.x)
 println(point.y)

 class LabeledPoint(val label: String, x: Double, y: Double) extends Point(x, y)

 class Point(val x: Double, val y: Double)

}
