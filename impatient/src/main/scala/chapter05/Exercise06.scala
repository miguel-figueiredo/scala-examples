package chapter05

import scala.math.max

object Exercise06 extends App {

  val person1 = new Person
  println(person1.age)

  val person2 = new Person(10)
  println(person2.age)

  val person3 = new Person(-1)
  println(person3.age)

  class Person(var age: Int = 0) {
    age = max(age, 0)
  }
}
