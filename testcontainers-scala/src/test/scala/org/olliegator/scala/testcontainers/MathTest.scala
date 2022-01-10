package org.olliegator.scala.testcontainers

import org.scalatest.FunSuite

class MathTest extends FunSuite {

  test("Given a number, when calculate cube, then the number cube is calculated") {
    assertResult(9)(Math.cube(3))
  }

}
