package chapter09

import scala.io.{BufferedSource, Source}

object Exercise07 extends App {
  val source = Source.fromURL("https://kernel.org")
  val regexp = """<img src="([:\w./_-]+)"""".r
  source.getLines().flatMap(s => regexp.findAllMatchIn(s)).foreach(m => println(m.group(1)))
}
