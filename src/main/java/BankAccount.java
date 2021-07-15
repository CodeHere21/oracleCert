public abstract class BankAccount {
    private double balance;
    protected BankAccount(double balance){
        this.balance=balance;
    }
    public double withdraw(double amount){
      if (balance>=amount && amount >=0){
          balance-=amount;
      }
      return balance;
    }
}
