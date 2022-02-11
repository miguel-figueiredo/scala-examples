package chapter19

object Exercise02 extends App {

  val bugsy: Bug = new Bug

  bugsy move 4 and show and after move 6 and show turn around move 5 and show

  object show {}
  object after {}
  object around {}
  object move {}

  class Bug() {
    var direction: Int = 1
    var position: Int = 0

    def move(distance: Int): Bug = {
      position += distance * direction
      this
    }

    def turn(): Bug = {
      direction = -direction
      this
    }

    def turn(obj: around.type): Bug = {
      direction = -direction
      this
    }

    def doShow(): Bug = {
      println(position)
      this
    }

    def and(obj: after.type): Bug = this
    def and(obj: show.type): Bug = {
      doShow()
      this
    }
  }
}
