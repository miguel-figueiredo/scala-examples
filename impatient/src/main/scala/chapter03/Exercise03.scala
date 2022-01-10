package chapter03

import java.lang.Math.min

object Exercise03 extends App {

  print(swap(Array(1, 2, 3, 4, 5, 6, 7)))

  def swap(array: Array[Int]): Array[Int] = {
    for(i <- 0 until array.length - 1 by 2) {
      val current = array(i)
      array(i) = array(i + 1)
      array(i + 1) = current
    }
    array
  }

  def print(array: Array[Int]): Unit = {
    // The toString method is useless with arrays
    println(array.mkString(" "))
  }
}
