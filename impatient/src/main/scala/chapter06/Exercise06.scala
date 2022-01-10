package chapter06

object Exercise06 extends App {

  println(Suits.Clubs)
  println(Suits.Diamonds)
  println(Suits.Hearts)
  println(Suits.Spades)
  println(Suits.values)

  object Suits extends Enumeration {
    type Suits = Value
    val Clubs = Value("♣")
    val Diamonds = Value("♦")
    val Hearts = Value("♥")
    var Spades = Value("♠")
  }
}
