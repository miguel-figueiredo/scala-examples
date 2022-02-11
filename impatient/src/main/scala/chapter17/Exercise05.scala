package chapter17

import scala.concurrent.ExecutionContext.Implicits.global
import scala.concurrent.Future

object Exercise05 extends App {

  map(Future(1), Future(2), Future(3))
    .map(println)

  def map[T](futures: Future[T]*): Future[Seq[T]] =
    Future.sequence(futures)
}
