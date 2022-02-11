package chapter11

import scala.math.abs

object Exercise02 extends App {

  println(new Fraction(1, 1) + new Fraction(1, 1))
  println(new Fraction(1, 1) + new Fraction(1, 2))
  println(new Fraction(1, 1) - new Fraction(1, 2))
  println(new Fraction(1, 1) * new Fraction(1, 2))
  println(new Fraction(1, 1) / new Fraction(1, 2))

  class Fraction(n: Int, d: Int) {
    private val num: Int = if (d == 0) 1 else n * sign(d) / gcd(n, d)
    private val den: Int = if (d == 0) 0 else d * sign(d) / gcd(n, d)

    override def toString: String = s"$num/$den"

    def sign(a: Int): Int = if (a > 0) 1 else if (a < 0) -1 else 0

    def gcd(a: Int, b: Int): Int = if (b == 0) abs(a) else gcd(b, a % b)

    def +(fraction: Fraction): Fraction =
      new Fraction(num * fraction.den + fraction.num * den, fraction.den * den)

    def -(fraction: Fraction): Fraction =
      new Fraction(num * fraction.den - fraction.num * den, fraction.den * den)

    def *(fraction: Fraction): Fraction =
      new Fraction(num * fraction.num, fraction.den * den)

    def /(fraction: Fraction): Fraction =
      new Fraction(num * fraction.den, den * fraction.num)
  }
}