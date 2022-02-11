package chapter10

object Exercise03 extends App {

  new Logger(4)
    .log("xpto")

  new AnotherLogger with CryptoLogger { override val key = 4 }
    .log("xpto")

  class Logger(override val key: Int) extends CryptoLogger

  class AnotherLogger

  trait CryptoLogger {
    val key: Int = 3
    // TODO: map each char of the message
    def log(message: String): Unit =
      println(message.map(c => (c + key).toChar))
  }
}
