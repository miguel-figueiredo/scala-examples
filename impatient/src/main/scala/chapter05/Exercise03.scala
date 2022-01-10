package chapter05

object Exercise03 extends App {

  val time = new Time(10, 14)
  val other = new Time(10, 15)
  println(time.before(other))

  class Time(val hrs: Int, val min: Int) {
    if (hrs < 0 || hrs > 23)
      throw new IllegalArgumentException(s"Invalid hour: $hrs")

    if (min < 0 || min > 59)
      throw new IllegalArgumentException(s"Invalid minute: $min")

    // The toMin method could use the fields, but I wanted to practice
    // the access of the fields in the other instance
    def before(other: Time): Boolean = toMin(hrs, min) < toMin(other.hrs, other.min)

    private def toMin(hrs: Int, min: Int): Int = hrs * 60 + min
  }
}
