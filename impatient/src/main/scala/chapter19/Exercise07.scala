package chapter19

import scala.language.{existentials, postfixOps, reflectiveCalls}

object Exercise07 extends App {

  println(closeA(new CloseableA))
  println(closeA(new CloseableB))

  println(closeB(new CloseableB))
  println(closeB(new CloseableB))

  type Closeable = { def close(): Unit }

  def closeA(x: { def close(): Unit}) = x.close()

  def closeB(x: Closeable) = x.close()

  class CloseableA {
    def close(): Unit = println("Closing A")
  }

  class CloseableB {
    def close(): Unit = println("Closing B")
  }
}
