package chapter14

object Exercise06 extends App {

  println(sum(Node(Leaf(1), Leaf(2))))

  def sum(tree: BinaryTree): Int = tree match {
    case Leaf(value) => value
    case Node(left, right) => sum(left) + sum(right)
  }

  sealed abstract class BinaryTree
  case class Leaf(value: Int) extends BinaryTree
  case class Node(left: BinaryTree, right: BinaryTree) extends BinaryTree
}
