package chapter21

import scala.language.postfixOps

object Exercise04 extends App {

  Read in aString askingFor "Your name" and anInt askingFor "Your age" and aDouble askingFor "Your weight"

  object aString
  object anInt
  object aDouble

  object Read {
    def in(obj: aString.type): aString.type = obj
    def in(obj: anInt.type): anInt.type = obj
    def in(obj: aDouble.type): aDouble.type = obj

  }

  object ReadAfter {
    def and(obj: aString.type): aString.type = obj
    def and(obj: anInt.type): anInt.type = obj
    def and(obj: aDouble.type): aDouble.type = obj
  }

  implicit class StringReader(obj: aString.type) {
    def askingFor(string: String): ReadAfter.type = {
      print(s"$string: ")
      scala.io.StdIn.readLine
      ReadAfter
    }
  }

  implicit class IntReader(obj: anInt.type) {
    def askingFor(string: String): ReadAfter.type = {
      print(s"$string: ")
      scala.io.StdIn.readInt()
      ReadAfter
    }
  }

  implicit class DoubleReader(obj: aDouble.type) {
    def askingFor(string: String): ReadAfter.type = {
      print(s"$string: ")
      scala.io.StdIn.readDouble()
      ReadAfter
    }
  }

}
