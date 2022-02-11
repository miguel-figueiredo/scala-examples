package chapter13

object Exercise06 extends App {

  val list: List[Int] = List(1, 2, 3, 4)

  // Deprecated
  println((list :\ List[Int]())(_ :: _))
  println((list /: List[Int]())(_ :+ _))

  println(list.foldRight(List[Int]())(_ :: _))
  println(list.foldLeft(List[Int]())(_ :+ _))

  // Revert
  println(list.foldRight(List[Int]())((e, l) => l :+ e))
  println(list.foldLeft(List[Int]())((l, e) => e +: l))
}
