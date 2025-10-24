package bank;

import java.util.ArrayList;

public class Bank {
    private ArrayList<Account> accounts = new ArrayList<>();
    private Account account;

    public void addAccount(String name, double balance) {
        account = new Account(name, balance);
        accounts.add(account);
        System.out.println("[ " + name +" account is succesfully added! ]");
    }

    public void removedAccount(String name) {
        for (Account acc : accounts) {
            if (name.equals(acc.getName())) {
                int index = accounts.indexOf(acc);
                accounts.remove(index);
                System.out.println("[ " + name + " successfully revoved the account! ]");
                return;
            }
        }
        System.out.println("[ Can't find that account! ]");
    }

    public void deposit(String name, double amount) {
        for (Account acc : accounts) {
            if (name.equals(acc.getName())) {
                acc.setBalance(amount);
                System.out.println("[ " + name + " is successfully deposit Php " + amount + " ]");
                amount += acc.getBalance();
                return;
            }
        }
        System.out.println("[ Can't find that account! ]");
    }

    public void withdraw(String name, double amount) {
        double newBalance;

        for (Account acc : accounts) {
            if (name.equals(acc.getName())) {
                newBalance = acc.getBalance() - amount;
                acc.setBalance(newBalance);
                System.out.println("[ " + name + " is successfully withdraw Php " + amount + " ]");
                return;
            }
        }
        System.out.println("[ Can't find that account! ]");
    }

    public void diplayAccount() {
        for (Account acc : accounts) {
            System.out.println("\nName: " + acc.getName() + "\nBalance: Php " + acc.getBalance());
        }
    }
}
