package chapter06

object Exercise03 extends App {

  Origin.x = 1
  Origin.y = 2
  println(Origin)

  // This is not a good idea because Point is not immutable
  object Origin extends java.awt.Point
}
