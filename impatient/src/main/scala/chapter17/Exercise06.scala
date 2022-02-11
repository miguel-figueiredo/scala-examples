package chapter17

import scala.annotation.tailrec
import scala.concurrent.ExecutionContext.Implicits.global
import scala.concurrent.duration.Duration
import scala.concurrent.{Await, Future}

object Exercise06 extends App {

  private val f: Future[String] = repeat {
    print("Input password: ")
    scala.io.StdIn.readLine
  }(_ == "password")

  f.onComplete(_ => println("Logged in"))

  // Await forever
  Await.result(f, Duration.Inf)

  def repeat[T](action: => T)(until: T => Boolean): Future[T] = {
    Future(action)
      .flatMap(r => Future(until(r))
        .flatMap(p => if(p) Future(r) else repeat(action)(until)))
  }
}
