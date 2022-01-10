package chapter03

import java.lang.Math.max
import java.util.TimeZone
import scala.collection.mutable.ArrayBuffer

object Exercise10 extends App {

  private val prefix = "America/"
  private val result: Array[String] = TimeZone.getAvailableIDs
    .filter(_.startsWith(prefix))
    .map(_.drop(prefix.length))
    .sorted

  println(result.mkString("\n"))

}
