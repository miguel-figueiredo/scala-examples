package chapter13

object Exercise04 extends App {

  val collection = Seq("x", "p", "t", "o")
  val map = Map(("x" -> 1), ("t" -> 10))

  println(valuesOf(collection, map))

  def valuesOf(collection: Seq[String], map: Map[String, Int]): Seq[Int] = {
    collection.flatMap(map.get)
  }
}
