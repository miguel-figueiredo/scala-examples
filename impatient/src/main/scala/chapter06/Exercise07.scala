package chapter06

object Exercise07 extends App {

  println(Suit.Clubs)
  println(Suit.Diamonds)
  println(Suit.Hearts)
  println(Suit.Spades)
  println(Suit.values)

  println(Suit.isRed(Suit.Spades))

  object Suit extends Enumeration {
    type Suit = Value
    val Clubs = Value("♣")
    val Diamonds = Value("♦")
    val Hearts = Value("♥")
    var Spades = Value("♠")

    def isRed(suit: Suit): Boolean = suit == Suit.Diamonds || suit == Suit.Hearts
  }
}
