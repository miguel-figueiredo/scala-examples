package org.olliegator.scala.testcontainers

import org.scalatest.funsuite.AnyFunSuite

class MathTest extends AnyFunSuite {

  test("Given a number, when calculate cube, then the number cube is calculated") {
    assertResult(9)(Math.cube(3))
  }

}
