package chapter08

object Exercise02 extends App {

  val account = new SavingsAccount(0)
  account.deposit(10)
  account.withdraw(1)
  account.withdraw(1)
  account.withdraw(1)
  account.earnMonthlyInterest
  account.withdraw(1)

  println(account.currentBalance)

  class SavingsAccount(initialBalance: Double) extends BankAccount(initialBalance) {
    private var transactionCount = 0
    val interestRateYear: Double = 0.01

    private def tax: Int = if(transactionCount > 2) 1 else 0

    def earnMonthlyInterest: Unit = {
      transactionCount = 0
      super.deposit(currentBalance * interestRateYear / 12)
    }

    override def deposit(amount: Double): Unit = {
      super.deposit(amount - tax)
      transactionCount += 1
    }

    override def withdraw(amount: Double): Unit = {
      super.withdraw(amount + tax)
      transactionCount += 1
    }
  }

  class BankAccount(initialBalance: Double) {
    private var balance = initialBalance

    def currentBalance = balance

    def deposit(amount: Double): Unit = balance += amount

    def withdraw(amount: Double): Unit = balance -= amount
  }
}
