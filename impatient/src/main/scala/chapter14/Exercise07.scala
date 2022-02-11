package chapter14

object Exercise07 extends App {

  println(sum(Node(Leaf(1), Leaf(2), Leaf(3))))

  def sum(tree: BinaryTree): Int = tree match {
    case Leaf(value) => value
    case Node(trees @ _*) => trees.map(sum).sum
  }

  sealed abstract class BinaryTree

  case class Leaf(value: Int) extends BinaryTree

  case class Node(trees: BinaryTree*) extends BinaryTree
}
