package chapter17

import scala.concurrent.ExecutionContext.Implicits.global
import scala.concurrent.duration.DurationInt
import scala.concurrent.{Await, Future}

object Exercise02 extends App {

  val f = doInOrder[Int, Int, Int](x => Future(x + 1), y => Future(y * 2))

  f(1).map(println)

  def doInOrder[T,U,V](f: T => Future[U], g: U => Future[V]): T => Future[V] =
    (t: T) => f(t).flatMap(g)
}
