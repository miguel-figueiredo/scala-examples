package chapter06

object Exercise02 extends App {

  println(InchesToCentimeters.convert(1))

  class UnitConversion(val factor: Double) {
    def convert(value: Double): Double = factor * value
  }

  object InchesToCentimeters extends UnitConversion(2.54)
  object GallonsToLiters extends UnitConversion(3.78541178)
  object MilesToKilometers extends UnitConversion(1.609344)
}
