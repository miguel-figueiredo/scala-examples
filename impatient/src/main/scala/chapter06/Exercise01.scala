package chapter06

object Exercise01 extends App {

  object Conversions {
    def inchesToCentimeter(inches: Double): Double = inches * 2.54

    def gallonsToLitters(gallons: Double): Double = gallons * 3.78541

    def milesToKilometers(miles: Double): Double = miles * 1.60934
  }
}
