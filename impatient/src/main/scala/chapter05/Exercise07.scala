package chapter05

import scala.math.max

object Exercise07 extends App {

  val person = new Person("Miguel Figueiredo")
  println(person.firstName)
  println(person.lastName)

  class Person(fullName: String) {
    private val names = fullName.split(" ")
    val firstName: String = names(0)
    val lastName: String = names(1)
  }
}
