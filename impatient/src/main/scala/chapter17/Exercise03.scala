package chapter17

import scala.concurrent.ExecutionContext.Implicits.global
import scala.concurrent.Future

object Exercise03 extends App {

  val f = doInOrder[Int](x => Future(x + 1), y => Future(y * 2))

  f(1).map(println)

  def doInOrder[T](functions: T => Future[T]*): T => Future[T] =
    //(t: T) => functions.tail.foldLeft(functions.head(t))((f1, f2) => f1.flatMap(f2))
    functions.reduceLeft((f1, f2) => x => f1(x).flatMap(f2))
}
