package chapter19

import scala.collection.mutable.ArrayBuffer
import scala.language.{existentials, postfixOps}

object Exercise05 extends App {

  type NetworkMember = n.Member forSome { val n: Network }

  val n1 = new Network
  val m1 = n1.join("Paul")
  val n2 = new Network
  val m2 = n2.join("Baron")

  println(process(m1, m2))

  // Invalid for members from different networks
  //println(process2(m1, m2))

  def process(m1: NetworkMember, m2: NetworkMember) = (m1, m2)

  def process2[M <: n.Member forSome { val n: Network }](m1: M, m2: M) = (m1, m2)

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

      override def toString = s"Member($name)"
    }

    private val members = new ArrayBuffer[Member]

    def join(name: String) = {
      val m = new Member(name)
      members += m
      m
    }
  }
}
