package chapter13

object Exercise08 extends App {

  printMatrix(Array(1, 2, 4, 5, 6).grouped(2))

  def printMatrix(matrix: Iterator[Array[Int]]): Unit =
    println(matrix.map(_.mkString(" ")).mkString("\n"))
}

