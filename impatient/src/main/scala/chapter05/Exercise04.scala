package chapter05

object Exercise04 extends App {

  val time = new Time(10, 14)
  val other = new Time(10, 15)
  println(time.before(other))

  class Time(hrs: Int, min: Int) {
    if (hrs < 0 || hrs > 23)
      throw new IllegalArgumentException(s"Invalid hour: $hrs")

    if (min < 0 || min > 59)
      throw new IllegalArgumentException(s"Invalid minute: $min")

    val minutes: Int  = hrs * 60 + min

    def before(other: Time): Boolean = minutes < other.minutes
  }
}
