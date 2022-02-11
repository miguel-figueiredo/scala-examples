package chapter13

object Exercise05 extends App {

  println(mkString(Seq(1, 2, 3, 4), ", "))

  def mkString(it: Iterable[_], separator: String = ""): String =
    it.map(_.toString)reduceLeft(_ + separator + _)

}
