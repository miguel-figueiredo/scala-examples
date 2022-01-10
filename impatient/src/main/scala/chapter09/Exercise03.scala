package chapter09

import scala.io.Source

object Exercise03 extends App {
  private val source = Source.fromFile("src/main/scala/chapter09/exercise03.txt")
  source.mkString.split(" ").filter(w => w.length > 12).foreach(println)
  source.close()
}
