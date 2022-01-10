package chapter08

object Exercise04 extends App {

  val item = new SimpleItem(1, "bike")

  println(item.price)
  println(item.description)

  val bundle = new Bundle(item, item)
  println(bundle.price)
  println(bundle.description)

  abstract class Item {
    def price: Double
    def description: String
  }

  class SimpleItem(val price: Double, val description: String) extends Item

  class Bundle(items: Item*) extends Item {

    val bundle = items.map(i => (i.price, i.description))
      .reduce((i1, i2) => (i1._1 + i2._1, s"${i1._2}, ${i2._2}"))

    val price = bundle._1
    val description = bundle._2
  }

}
