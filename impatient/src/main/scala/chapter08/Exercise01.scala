package chapter08

object Exercise01 extends App {

  val account = new CheckedAccount(0)
  account.deposit(10)
  account.withdraw(1)

  println(account.currentBalance)

  class CheckedAccount(initialBalance: Double) extends BankAccount(initialBalance) {
    override def deposit(amount: Double): Unit = super.deposit(amount - 1)

    override def withdraw(amount: Double): Unit = super.withdraw(amount + 1)
  }

  class BankAccount(initialBalance: Double) {
    private var balance = initialBalance

    def currentBalance = balance

    def deposit(amount: Double): Unit = balance += amount

    def withdraw(amount: Double): Unit = balance -= amount
  }
}
