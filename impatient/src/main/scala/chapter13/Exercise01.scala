package chapter13

import scala.collection.mutable
import scala.collection.mutable._

object Exercise01 extends App {

  println(indexes("Mississipi"))

  def indexes(string: String) = {
    val result: Map[Char, SortedSet[Int]] = Map[Char, SortedSet[Int]]()

    string.zipWithIndex.foreach(i =>
      if(result.contains(i._1)) result(i._1) += i._2
      else result(i._1) = SortedSet(i._2)
    )

    result
  }
}
