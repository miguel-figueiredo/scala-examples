package chapter11

object Exercise08 extends App {

  val matrixA = new Matrix(2, 2)
  matrixA(0, 0) = 1
  matrixA(0, 1) = 2
  matrixA(1, 0) = 3
  matrixA(1, 1) = 4

  println(matrixA * 2)

  val matrixB = new Matrix(2, 2)
  matrixB(0, 0) = -1
  matrixB(0, 1) = -2
  matrixB(1, 0) = -3
  matrixB(1, 1) = -4

  println(matrixA + matrixB)

  class Matrix(val m: Int, val n: Int) {

    private val matrix: Array[Array[Int]] = Array.ofDim[Int](m, n)

    def apply(i: Int, j: Int): Int = matrix(i)(j)

    def update(i: Int, j: Int, value: Int): Unit = matrix(i)(j) = value

    def +(that: Matrix): Matrix = {
      val result = new Matrix(m, n)
      for (
        i <- 0 until m;
        j <- 0 until n
      ) {
        result(i, j) = this(i, j) + that(i, j)
      }
      result
    }

    def *(multiplier: Int): Matrix = {
      val result = new Matrix(m, n)
      for (
        i <- 0 until m;
        j <- 0 until n
      ) {
        result(i, j) = this(i, j) * multiplier
      }
      result
    }

    override def toString: String = matrix.map(_.mkString(" ")).mkString("\n")
  }
}
