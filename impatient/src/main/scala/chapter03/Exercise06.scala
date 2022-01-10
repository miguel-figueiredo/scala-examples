package chapter03

object Exercise06 extends App {
  print(reverseSorted(Array(-2, 1, -1, 3, 4, -5, 2)))

  // The same can be used for an ArrayBuffer
  def reverseSorted(array: Array[Int]): Array[Int] = array.sortWith(_ > _)

  def print(array: Array[Int]): Unit = {
    // The toString method is useless with arrays
    println(array.mkString(" "))
  }
}
