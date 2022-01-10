package chapter03

import scala.util.Random

object Exercise01 extends App {

  print(randomArrayLoop(10))
  print(randomArray(10))

  def randomArrayLoop(size: Int): Array[Int] = {
    val a = new Array[Int](size)

    for(i <- 0 until size) {
      a(i) = Random.nextInt(size)
    }

    a
  }

  def randomArray(size: Int): Array[Int] = Array.fill(size)(Random.nextInt(size))

  def print(array: Array[Int]): Unit = {
    // The toString method is useless with arrays
    println(array.mkString(" "))
  }
}
