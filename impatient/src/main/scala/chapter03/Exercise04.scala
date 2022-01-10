package chapter03

import scala.collection.mutable.ArrayBuffer

object Exercise04 extends App {
  print(splitNegativeAndPositive(Array(-2, 1, -1, 3, 4, -5, 2)))

  def splitNegativeAndPositive(array: Array[Int]): Array[Int]  = array.filter(_ > 0) ++ array.filter(_ <= 0)

  def print(array: Array[Int]): Unit = {
    // The toString method is useless with arrays
    println(array.mkString(" "))
  }
}
