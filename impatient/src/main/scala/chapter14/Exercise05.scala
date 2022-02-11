package chapter14

object Exercise05 extends App {

  println(sumInner(List(List(3, 8), 2, List(5))))

  // Using partial functions
  def sumInner(list: List[Any]): Long =
    list.map {
      case value: Int => value;
      case inner: List[Any] => sumInner(inner)
    }.sum

  // Classic match
  def leafSum2(list: List[Any]): Int = list match {
    case Nil => 0
    case (value: Int)::rest => value + leafSum2(rest)
    case (inner: List[Any])::rest => leafSum2(inner) + leafSum2(rest)
  }
}
