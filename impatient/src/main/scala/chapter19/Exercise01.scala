package chapter19

object Exercise01 extends App {

  val bugsy: Bug = new Bug()

   bugsy.move(4).show().move(6).show().turn().move(5).show()

  class Bug() {

    private var position: Int = 0
    private var direction: Int = 1

    def move(distance: Int): Bug = {
      position += distance * direction
      this
    }

    def turn(): Bug = {
      direction = -direction
      this
    }

    def show(): Bug = {
      println(this.position)
      this
    }

  }
}
