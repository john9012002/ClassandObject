package Bai25;
import java.util.ArrayList;

public class Bai25 {
    public static void main(String[] args) {
        int n = 3;
        ArrayList<BankAccount> accounts = new ArrayList<BankAccount>();
        for (int i = 0; i < n; i++) {
            String name = "Account " + (i + 1);
            double balance = i * 1000;
            try {
                BankAccount account = new BankAccount(name, balance);
                accounts.add(account);
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
        System.out.println("Danh sach tai khoan ngan hang:");
        System.out.printf("%-15s%-20s%-10s\n", "Account Number", "Name", "Balance");
        for (BankAccount account : accounts) {
            account.output();
        }
    }
}
