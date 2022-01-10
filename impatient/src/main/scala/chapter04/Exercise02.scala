package chapter04

import java.nio.file.{Files, Paths}
import scala.jdk.CollectionConverters._

object Exercise02 extends App {
  val words = getWords("src/main/resources/words.txt")

  println(count(words))

  private def count(words: Array[String]) = {
    val map = scala.collection.mutable.Map[String, Int]()
    for (word <- words) {
      map(word) = map.getOrElse(word, 0) + 1
    }
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
