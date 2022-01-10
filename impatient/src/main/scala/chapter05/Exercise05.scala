package chapter05

import scala.beans.BeanProperty

object Exercise05 extends App {

  val student = new Student("Miguel", 1)
  student.id = 2
  student.setName("Pedro")
  println(student.name)
  println(student.id)
  println(student.getId)

  class Student(@BeanProperty var name: String, @BeanProperty var id: Long) {

  }

}
