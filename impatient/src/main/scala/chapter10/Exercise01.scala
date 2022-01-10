package chapter10

import java.awt.geom.Ellipse2D

object Exercise01 extends App {

  val egg = new Ellipse2D.Double(5, 10, 20, 30) with RectangleLike
  egg.translate(10, -10)
  egg.grow(10, 5)
  println(s"X: ${egg.getX}, Y: ${egg.getY}, Width: ${egg.getWidth}, Height: ${egg.getHeight}")

  trait RectangleLike {
    def translate(x: Double, y: Double): Unit =
      setFrame(getX + x, getY + y, getWidth, getHeight)

    def grow(w: Double, h: Double): Unit =
      setFrame(getX, getY, getWidth + w, getHeight + h)

    def getX: Double

    def getY: Double

    def getWidth: Double

    def getHeight: Double

    def setFrame(x: Double, y: Double,  w: Double, h: Double): Unit
  }
}
