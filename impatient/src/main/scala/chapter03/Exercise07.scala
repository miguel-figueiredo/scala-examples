package chapter03

object Exercise07 extends App {
  print(removeDuplicated(Array(1, 2, 1, 3, 4, 5, 3)))

  // The same can be used for an ArrayBuffer
  def removeDuplicated(array: Array[Int]): Array[Int] = array.distinct

  def print(array: Array[Int]): Unit = {
    // The toString method is useless with arrays
    println(array.mkString(" "))
  }
}
