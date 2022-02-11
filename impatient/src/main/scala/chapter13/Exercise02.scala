package chapter13

object Exercise02 extends App {

  println(indexes("Mississipi"))
  println(indexesGroupBy("Mississipi"))

  def indexes(string: String) = {
    val initialMap: Map[Char, List[Int]] =
      Map[Char, List[Int]]().withDefault(k => List[Int]())

    string.zipWithIndex.foldLeft(initialMap)((m, t) => m + (t._1 -> (m(t._1) :+ t._2)))
  }

  def indexesGroupBy(string: String) = {
    string.zipWithIndex.groupBy(_._1).map(v => v._1 -> v._2.map(_._2).toList)
  }
}
