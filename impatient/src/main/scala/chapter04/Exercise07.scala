package chapter04

import scala.collection.mutable
import scala.jdk.CollectionConverters._

object Exercise07 extends App {
  private val map: mutable.Map[String, String] = System.getProperties.asScala
  private val maxLength: Int = map.keys.map(_.length).max
  map.foreach(e => println(s"${e._1}${" " * (maxLength - e._1.length)} | ${e._2}"))
}
