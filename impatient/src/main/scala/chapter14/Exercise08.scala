package chapter14

import java.util.function.{BiFunction, UnaryOperator}

object Exercise08 extends App {

  println(eval(Leaf(1)))
  println(eval(Node('-', Leaf(1))))
  println(eval(Node('-', Leaf(1), Leaf(1))))
  println(eval(Node('+', Leaf(1), Leaf(1), Leaf(1), Node('*', Leaf(10)))))

  def eval(tree: BinaryTree): Int = tree match {
    case Leaf(value) => value
    // Takes care of the unary operator with the foldLeft
    case Node('-', list @ _*) => list.map(eval).foldLeft(0)(_ - _)
    case Node('+', list @ _*) => list.map(eval).sum
    case Node('*', list @ _*) => list.map(eval).product
  }

  sealed abstract class BinaryTree

  case class Leaf(value: Int) extends BinaryTree

  case class Node(op: Char, trees: BinaryTree*) extends BinaryTree
}
