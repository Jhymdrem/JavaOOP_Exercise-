package bank;

public class BankMain {
    public static void main(String[] args) {
        Bank bank = new Bank();

        System.out.println("""
                BANK
                ==========================
                """);
        bank.addAccount("RmenJhyd", 5000);
        bank.diplayAccount();
        System.out.println("------------------------------");

        bank.addAccount("JhymdrenMG", 5000);
        bank.diplayAccount();
        System.out.println("------------------------------");

        bank.deposit("RmenJhyd", 3000);
        bank.diplayAccount();
        System.out.println("------------------------------");

        bank.withdraw("JhymdrenMG", 3000);
        bank.diplayAccount();
        System.out.println("------------------------------");

        bank.removedAccount("RmenJhyd");
        bank.diplayAccount();
        System.out.println("------------------------------");

    }
}
