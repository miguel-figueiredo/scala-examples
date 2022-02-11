package chapter10

import java.awt.Point

object Exercise05 extends App {

  private val point = new Point() with PropertyChangeSupport
  point.setLocation(1, 2)

  println(point)

  trait PropertyChangeSupport
}
