package chapter09

import java.io.PrintWriter
import scala.io.Source

object Exercise02 extends App {
  val number = 10
  val source = Source.fromFile("src/main/scala/chapter09/exercise02.txt")
  val lines = source.getLines.map(l => l.replaceAll("\\t", " " * number))
  val out = new PrintWriter("src/main/scala/chapter09/exercise02_out.txt")
  lines.foreach(out.println(_))
  source.close()
  out.close()
}
