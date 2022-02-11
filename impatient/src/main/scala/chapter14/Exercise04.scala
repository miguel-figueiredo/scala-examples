package chapter14

object Exercise04 extends App {

  println(price(Multiple(10, Article("a", 10.0))))
  println(price(Multiple(10, Bundle("a", 20, Multiple(2, Article("x", 1)), Article("x", 100)))))

  abstract class Item
  case class Article(description: String, price: Double) extends Item
  case class Bundle(description: String, discount: Double, items: Item*) extends Item
  case class Multiple(size: Int, item: Item) extends Item

  def price(it: Item): Double = it match {
    case Article(_, p) => p
    case Bundle(_, d, its @ _*) => its.map(price).sum - (100 - d)/100
    case Multiple(num, item) => num * price(item)
  }
}
