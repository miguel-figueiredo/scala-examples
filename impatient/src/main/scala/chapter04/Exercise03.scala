package chapter04

import java.nio.file.{Files, Paths}
import scala.jdk.CollectionConverters._

object Exercise03 extends App {
  val words = getWords("src/main/resources/words.txt")
  
  println(count(words))

  private def count(words: Array[String]) = {
    words.groupMapReduce(identity)(_ => 1)(_ + _)
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
