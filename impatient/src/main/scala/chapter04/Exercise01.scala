package chapter04

object Exercise01 extends App {
  val gizmos = Map("x" -> 10, "y" -> 100, "z" -> 200)

  val discount = gizmos.view.mapValues(v => v * 0.9).toMap
  println(discount)

  val discount2 = gizmos.map(i => (i._1, i._2 * 0.9))
  println(discount2)

  val discount3 = for((k, v) <- gizmos) yield (k, v * 0.9)
  println(discount3)
}
