package chapter19

import scala.language.{existentials, postfixOps, reflectiveCalls}

object Exercise09 extends App {

  abstract class Dim[T](val value: Double, val name: String) {

    this: T =>

    protected def create(v: Double): T

    def +(other: Dim[T]) = create(value + other.value)

    override def toString = s"$value $name"
  }

  class Seconds(v: Double) extends Dim[Seconds](v, "s") {
    override protected def create(v: Double) = new Seconds(v)
  }

  // Compile error thanks to the self type
//  class Meters(v: Double) extends Dim[Seconds](v, "m") {
//    override protected def create(v: Double) = new Seconds(v)
//  }
}
