package chapter17

import scala.concurrent.ExecutionContext.Implicits.global
import scala.concurrent.duration.DurationInt
import scala.concurrent.{Await, Future}

object Exercise01 extends App {

  // The functions are executed concurrently
  val f1 = Future {
    Thread.sleep(1000)
    2
  }
  val f2 = Future {
    Thread.sleep(1000)
    40
  }

  val r1 = f1.map(n1 => f2.map(n2 => n1 + n2))
  val i1: Int = Await.result(Await.result(r1, 10.seconds), 10.seconds)
  println(i1)

  val r2 = f1.flatMap(n1 => f2.map(n2 => n1 + n2))
  val i2: Int = Await.result(r2, 10.seconds)
  println(i2)

  // The println is executed in the main thread
  f1.flatMap(n1 => f2.map(n2 => n1 + n2))
    .onComplete(_.foreach(println))

  // The println is executed in the
  f1.flatMap(n1 => f2.map(n2 => n1 + n2))
    .map(println)
}
