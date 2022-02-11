package chapter13

import scala.collection.mutable.ListBuffer

object Exercise03 extends App {

  private val list: ListBuffer[Int] = ListBuffer.from(1 to 10)
  removeEvenIndex(list)
  println(list)

  println(removeEven(List.from(1 to 10)))

  def removeEvenIndex(list: ListBuffer[Int]): Unit =
    list.indices.reverse.filter(_ % 2 == 0).foreach(list.remove)

  def removeEven(list: List[Int]): List[Int] =
    list.zipWithIndex.filter(_._2 % 2 != 0).map(_._1)
}
