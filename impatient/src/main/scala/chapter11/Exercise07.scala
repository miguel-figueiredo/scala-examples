package chapter11

object Exercise07 extends App {

  private val sequence = new BitSequence()
  sequence(1) = true
  sequence(0) = true
  sequence(2) = true
  sequence(0) = false

  println(sequence)
  println(sequence(2))
  println(sequence(0))

  class BitSequence {

    private var value: Long = 0;

    def update(position: Int, bit: Boolean): Unit =
      if(bit) set(position)
      else unset(position)

    def set(position: Int): Unit = value |= 1L << position

    def unset(position: Int): Unit = value &= ~(1L << position)

    def apply(position: Int): Long = value >> position & 1

    override def toString: String = value.toBinaryString
  }
}