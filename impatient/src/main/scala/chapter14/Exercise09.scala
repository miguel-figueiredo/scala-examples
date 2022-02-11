package chapter14

object Exercise09 extends App {

  println(sum(List(None, Some(1), Some(1))))

  def sum(list: List[Option[Int]]): Int =
    list.map(_.getOrElse(0)).sum
}
