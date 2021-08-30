package chapter02

import java.time.LocalDate
import scala.annotation.tailrec
import scala.collection.StringOps

object Main {
  def main(args: Array[String]): Unit = {
    // Exercise 1
    println("Exercise 1")
    println(signum(-10))
    println(signum(100))
    println(signum(0))
    println("----------------")

    // Exercise 2
    // () and {} are of type Unit

    // Exercise 3
    // x must be of type unit
    println("Exercise 3")
    var y = 2
    var x: Unit = ()
    x = y = 1
    println(y)
    println("----------------")

    // Exercise 4
    println("Exercise 4")
    Range(10, -1, -1).foreach(println)
    10 to (0, -1) foreach println
    println("----------------")

    // Exercise 5
    println("Exercise 5")
    countdown(10)
    println("----------------")

    // Exercise 6/7
    println("Exercise 6 and 7")
    val productResult = "Hello".map(Char.char2long).product
    println(productResult)

    val productResultWithFold = "Hello".foldLeft(1L)((x, y) => x * y)
    println(productResultWithFold)

    val productResultWithFold2 = "Hello".foldLeft(1L)(_ * _)
    println(productResultWithFold2)
    println("----------------")

    // Exercise 8
    println("Exercise 8")
    println(product("Hello"))
    println("----------------")

    // Exercise 9
    println("Exercise 9")
    println(productRecursive("Hello"))
    println(productTailRecursive("Hello"))
    println("----------------")

    // Exercise 10
    println("Exercise 10")
    println(power(2, 0))
    println(power(2, 2))
    println(power(2, -1))
    println(power(2, -2))
    println("----------------")

    // Exercise 11
    println("Exercise 11")
    date "$year-$month-$day"
    println("----------------")
  }

  def signum(i: Int): Int = {
    if (i > 0) 1
    else if (i < 0) -1
    else 0
  }

  def countdown(n: Int): Unit = {
    n to (0, 1) foreach println
  }

  def product(str: String): Long = {
    str.foldLeft(1L)(_ * _)
  }

  def productRecursive(string: String): Long = {
    string match {
      case "" => 1L
      case _  => string.head * productRecursive(string.tail)
    }
  }

  @tailrec
  def productTailRecursive(string: String, acc: Long = 1L): Long = {
    string match {
      case "" => acc
      case _  => productTailRecursive(string.tail, acc * string.head.toLong)
    }
  }

  def power(x: Double, n: Int): Double = {
    if(n > 0 && n % 2 == 0)
      power(x, n/2) * 2
    else if (n > 0 && n % 2 != 0)
      x * power(x, n - 1)
    else if (n < 0)
      1 / power(x, -n)
    else
      1
  }

  implicit class DateInterpolator(val sc: StringContext) extends AnyVal {
    def date(args: Any*): LocalDate = {
      println(args)
      LocalDate.now()
    }
  }

}
