package chapter21

object Exercise02 extends App {

  println(100 +% 20)

  implicit class Percentage(val self: Float) extends AnyVal {
    def +%(percentage: Float): Float = self + self * percentage / 100
  }
}
