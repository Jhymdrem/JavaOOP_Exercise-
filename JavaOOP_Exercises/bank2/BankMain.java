package bank2;

public class BankMain {
    public static void main(String[] args) {
        System.out.println("""
                BANK ACCOUNT SYSTEM
                =========================================
                """);

        SavingsAccount account = new SavingsAccount("12345", "JhymdrenMG", 1000, 5);
        account.deposit(500);
        account.withdraw(200);
        account.applyInterest();
        account.displayInfo();
    }
}
