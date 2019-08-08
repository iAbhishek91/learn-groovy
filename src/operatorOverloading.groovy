class Account {
  BigDecimal balance
  String type

  public Account(Object a) {
    this.type = a.type
    this.balance = 0
  }

  BigDecimal deposit (amount) {
    balance += amount
  }

  BigDecimal withdraw (amount) {
    balance -= amount
  }

  BigDecimal plus (Account a) {
    this.balance + a.balance
  }
}

def abhiAccount = new Account(type: "abhi")
abhiAccount.deposit(500)
def suAccount = new Account(type: "Su")
suAccount.deposit(800)

println abhiAccount + suAccount