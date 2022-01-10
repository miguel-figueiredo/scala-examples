package org.olliegator.scala.testcontainers

import org.scalatest.GivenWhenThen
import org.scalatest.funspec.AnyFunSpec

class MathSpec extends AnyFunSpec with GivenWhenThen {

  describe("Math") {

    it("should calculate cube") {
      Given("a number")
      val number: Int = 3

      When("cube is invoked")
      val result = Math.cube(number)

      Then("result is cube")
      assertResult(9)(result)
    }
  }



}
