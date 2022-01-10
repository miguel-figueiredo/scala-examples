package chapter03

import scala.collection.mutable.ArrayBuffer

object Exercise08 extends App {
  private val array: ArrayBuffer[Int] = ArrayBuffer(1, 2, 3, -2, 4, 5, -10)
  removeFromFirstNegative(array)
  println(array)

  // The same can be used for an ArrayBuffer
  def removeFromFirstNegative(array: ArrayBuffer[Int]): Unit = {
    // The reverse is required otherwise after the first removal the indices will not be the same
    array.indices
      .filter(array(_) < 0)
      .tail
      .reverse
      .foreach(array.remove(_))
  }

}
