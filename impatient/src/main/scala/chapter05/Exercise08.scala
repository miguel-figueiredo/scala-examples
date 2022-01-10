package chapter05

object Exercise08 extends App {

  val car1 = new Car("Toyota", "Prius")
  val car2 = new Car("Toyota", "Prius", 2021)
  val car3 = new Car("Toyota", "Prius", 2021, "AA-14-CG")
  val car4 = new Car("Toyota", "Prius", 2015)
  car4.licensePlate = "ED-94-EF"
  car1.modelYear = 2010

  class Car(val manufacturer: String, val modelName: String, var modelYear: Int = -1, var licensePlate: String = "") {

  }
}
