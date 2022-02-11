package chapter17

import scala.concurrent.ExecutionContext.Implicits.global
import scala.concurrent.duration.Duration
import scala.concurrent.{Await, Future}

object Exercise07 extends App {

  private val f: Future[Int] = countPrimes(100)

  f.map(x => println(s"Count: $x"))

  Await.result(f, Duration.Inf)

  def countPrimes(n: Int): Future[Int] =
    Future.sequence(slices(n, processors).map(countPrimes)).map(l => l.sum)

  def countPrimes(list: Seq[Int]): Future[Int] =
    Future(list.count(x => BigInt(x).isProbablePrime(100)))

  def slices(n: Int, number: Int): Seq[IndexedSeq[Int]] =
    (1 to n).groupBy(_ % number).values.toSeq

  def processors = Runtime.getRuntime.availableProcessors()

}
