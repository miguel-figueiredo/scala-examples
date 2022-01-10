package chapter09

import scala.io.Source

object Exercise01 extends App {
  private val source = Source.fromFile("src/main/resources/words.txt")
  source.getLines.toArray.reverse.foreach(println)
  source.close()
}
