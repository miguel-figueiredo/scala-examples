package chapter09

import java.io.PrintWriter
import scala.io.Source

object Exercise05 extends App {
  (0 to 20)
    .map(i => (math.pow(2, i) -> math.pow(2, -i)))
    .map(i => f"${i._1}%8.0f    ${i._2}")
    .foreach(println)
}
