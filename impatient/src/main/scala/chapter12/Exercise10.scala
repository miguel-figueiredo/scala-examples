package chapter12

object Exercise10 extends App {

  unless(1 == 2) {
    println("Hello")
  }

  // The absence of () make it call by name
  def unless(condition: => Boolean)(block: => Unit): Unit =
    if(!condition) block
}
