package chapter04

import scala.collection.mutable
import scala.jdk.CollectionConverters._

object Exercise08 extends App {
  val array = Array(1, 2, 3, 4)
  println(minMax(array))

  def minMax(array: Array[Int]): (Int, Int) = {
    (array.min -> array.max)
  }
}
