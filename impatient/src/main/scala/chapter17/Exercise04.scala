package chapter17

import scala.concurrent.ExecutionContext.Implicits.global
import scala.concurrent.Future

object Exercise04 extends App {

  val f = doTogether[Int, Int, Int](x => Future(x * 2), x => Future(x + 2))
  f(1).foreach(println)

  def doTogether[T, U, V](f: T => Future[U], g: T => Future[V]): T => Future[(U, V)] =
    (t: T) => f(t).zip(g(t))
}
