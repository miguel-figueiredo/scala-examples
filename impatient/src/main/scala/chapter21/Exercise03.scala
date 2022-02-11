package chapter21

import scala.language.postfixOps

object Exercise03 extends App {

  println(0!)
  println(5!)

  implicit class Factorial(val i: Int) extends AnyVal {
    def ! =
      if(i == 0) 1
      else (0 until i).map(i - _).product
  }
}
