package chapter19

import scala.collection.mutable.ArrayBuffer
import scala.language.postfixOps

object Exercise04 extends App {

  val atreides = new Network
  val paul1 = atreides.join("Paul")
  val paul2 = atreides.join("Paul")

  val harkonnen = new Network
  val paul3 = harkonnen.join("Paul")

  paul1.contacts += paul2

  // Invalid
  // paul1.contacts += paul3

  println(paul1.equals(paul2))
  println(paul1.equals(paul3))

  class Network {
    class Member(val name: String) {

      val contacts = new ArrayBuffer[Member]

      def canEqual(other: Any): Boolean = other.isInstanceOf[Member]

      override def equals(other: Any): Boolean = other match {
        case that: Member =>
          (that canEqual this) &&
            name == that.name
        case _ => false
      }

      override def hashCode(): Int = {
        val state = Seq(name)
        state.map(_.hashCode()).foldLeft(0)((a, b) => 31 * a + b)
      }
    }

    private val members = new ArrayBuffer[Member]

    def join(name: String) = {
      val m = new Member(name)
      members += m
      m
    }
  }
}
