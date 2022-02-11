package chapter11

object Exercise03 extends App {

  println(Money(1, 200))
  println(Money(-1, -1))
  println(Money(1, -1))
  println(Money(-1, 1))
  println(Money(-1, 0))
  println(Money(0, -1))

  println(Money(1, 50) + Money(1, -10))
  println(Money(1, 50) - Money(1, 60))
  println(Money(1, 1) < Money(1, 1))
  println(Money(1, 1) == Money(1, 1))


  class Money(euros: Int, cents: Int) {
    def getEuros: Int = this.euros + this.cents / 100
    def getCents: Int = this.cents % 100

    def +(that: Money): Money =
      Money(this.getEuros + that.getEuros , this.getCents + that.getCents)

    def -(that: Money): Money =
      Money(this.getEuros - that.getEuros , this.getCents - that.getCents)

    private def value: Double = getEuros + 0.01 * getCents

    def <(that: Money): Boolean = this.value < that.value

    def ==(that: Money): Boolean = this.value == that.value

    override def toString: String = value.toString
  }

  object Money {
    def apply(euros: Int, cents: Int): Money = new Money(euros, cents)
  }
}