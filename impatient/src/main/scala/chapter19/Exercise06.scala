package chapter19

import scala.collection.mutable.ArrayBuffer
import scala.language.{existentials, postfixOps}

object Exercise06 extends App {

  println(closest(Array(1), 1))
  println(closest(Array(1, 2, 3, 4), 2))
  println(closest(Array(1, 2, 3, 4), 6))

  def closest(array: Array[Int], value: Int): Int Either Int = {
    val min = array.map(x => math.abs(x - value)).zipWithIndex.min
    if(min._1 == 0) Left(min._2) else Right(min._2)
  }
}
