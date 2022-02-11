package chapter11

object Exercise04 extends App {

  println(Table() | "Java" | "Scala" || "Gosling" | "Odersky" || "JVM" | "JVM, .NET")

  class Table(val value: String = "") {

    def |(value: String): Table = Table(this.value + "<td>" + value + "</td>")

    def ||(value: String): Table = Table(this.value + "</tr><tr><td>" + value + "</td>")

    override def toString: String = "<table><tr>" + value + "</tr><table>"
  }

  object Table {
    def apply(value: String = ""): Table = new Table(value)
  }
}