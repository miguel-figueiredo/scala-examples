package chapter04

import java.nio.file.{Files, Paths}
import java.util
import scala.collection.SortedMap
import scala.jdk.CollectionConverters._

object Exercise04 extends App {
  val words = getWords("src/main/resources/words.txt")
  
  println(count(words))

  private def count(words: Array[String]) = {
    var map = SortedMap[String, Int]()
    words.foreach(word => map = map + (word -> (map.getOrElse(word, 0) + 1)))
    map
  }

  private def getWords(file : String): Array[String] = {
    val lines = Files.readAllLines(Paths.get(file)).asScala
    lines
      .flatMap(_.split("\\s+"))
      .map(_.replaceAll("\\W", ""))
      .map(_.toLowerCase)
      .toArray
  }
}
