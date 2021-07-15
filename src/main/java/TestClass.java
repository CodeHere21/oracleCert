public class TestClass {
    public static void main (String[] args) {
       // System.out.println("Hello World");
        BankAccount lenaAccount= new SavingsAccount(100);

        System.out.println(lenaAccount.withdraw(15));
    }
}
