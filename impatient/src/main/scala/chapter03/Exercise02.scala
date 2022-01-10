package chapter03

import java.lang.Math.min

object Exercise02 extends App {

  print(swapLoop(Array(1, 2, 3, 4, 5, 6, 7)))
  print(swap(Array(1, 2, 3, 4, 5, 6, 7)))

  def swapLoop(array: Array[Int]): Array[Int] = {
    for(i <- 0 until array.length - 1 by 2) {
      val current = array(i)
      array(i) = array(i + 1)
      array(i + 1) = current
    }
    array
  }

  def swap(array: Array[Int]): Array[Int] = {
      val result = for(i <- array.indices) yield {
        if(i % 2 == 0) array(min(i + 1, array.length - 1)) else array(i - 1)
      }
      result.toArray
  }

  def print(array: Array[Int]): Unit = {
    // The toString method is useless with arrays
    println(array.mkString(" "))
  }
}
