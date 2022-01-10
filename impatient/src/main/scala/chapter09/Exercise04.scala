package chapter09

import java.io.PrintWriter
import scala.io.Source

object Exercise04 extends App {
  private val source = Source.fromFile("src/main/scala/chapter09/exercise04.txt")
  private val target = new PrintWriter("src/main/scala/chapter09/exercise04_out.txt")
  private val numbers: Array[Float] = source.mkString.split("""[\s\t\n]+""").map(_.toFloat)
  Seq(numbers.sum, numbers.sum/numbers.length, numbers.max, numbers.min).foreach(target.println(_))
  source.close()
  target.close()
}
