package Bai25;
import java.util.ArrayList;

public class BankAccount {
    private String name;
    private double balance;
    private String accountNumber;

    public BankAccount(String name, double balance) throws Exception {
        if (balance < 0) {
            throw new Exception("Invalid balance");
        }
        this.name = name;
        this.balance = balance;
        this.accountNumber = generateAccountNumber();
    }

    private String generateAccountNumber() {
        String numberOfAccount = String.format("%08d", Bank.getNextAccountNumber());
        return "0081" + numberOfAccount;
    }

    public void output() {
        System.out.printf("%-15s%-20s%-10.2f\n", accountNumber, name, balance);
    }
}



    