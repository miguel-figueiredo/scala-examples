package chapter05

import scala.math.max

object Exercise02 extends App {

  val account = new BankAccount
  account.deposit(100)
  account.withdraw(10)
  println(account.balance)

  class BankAccount {
    private var _balance: Int = _

    def deposit(amount: Int): Unit = _balance += amount

    def withdraw(amount:Int): Unit = _balance -= amount

    def balance: Int = _balance
  }
}
