package chapter09

object Exercise06 extends App {
  val s: String = """"like this, maybe with \" or \\""""
  val regexp = """(".+")*""".r
  regexp.findAllMatchIn(s).foreach(println)
}
