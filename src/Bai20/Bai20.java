package Bai20;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class Bai20 {
    private static ArrayList<Account> accounts = new ArrayList<>();

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Menu:");
            System.out.println("1. Create Account");
            System.out.println("2. Display Account info");
            System.out.println("3. Deposit");
            System.out.println("4. Withdraw");
            System.out.println("5. Sort Account by name Ascending");
            System.out.println("6. Sort Account by balance Descending");
            System.out.println("7. Exit");
            System.out.print("Nhap lua chon cua ban: ");
            int choice = Integer.parseInt(scanner.nextLine());
            switch (choice) {
                case 1:
                    Account account = Account.input();
                    accounts.add(account);
                    System.out.println("Tao tai khoan thanh cong");
                    break;
                case 2:
                    displayAccountInfo();
                    break;
                case 3:
                    deposit();
                    break;
                case 4:
                    withdraw();
                    break;
                case 5:
                    sortAccountByNameAscending();
                    break;
                case 6:
                    sortAccountByBalanceDescending();
                    break;
                case 7:
                    System.out.println("Tam biet!");
                    return;
                default:
                    System.out.println("Lua chon khong hop le");
            }
        }
    }

    private static void displayAccountInfo() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap so tai khoan: ");
        long accountNumber = Long.parseLong(scanner.nextLine());
        Account account = findAccount(accountNumber);
        if (account == null) {
            System.out.println("Tai khoan nay khong ton tai");
        } else {
            System.out.println(account);
        }
    }

    private static void deposit() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap so tai khoan: ");
        long accountNumber = Long.parseLong(scanner.nextLine());
        Account account = findAccount(accountNumber);
        if (account == null) {
            System.out.println("Tai khoan nay khong ton tai");
        } else {
            System.out.print("Nhap so tien muon nap: ");
            double amount = Double.parseDouble(scanner.nextLine());
            try {
                account.deposit(amount);
                System.out.println("Nap tien thanh cong");
            } catch (IllegalArgumentException e) {
                System.out.println(e.getMessage());
            }
        }
    }

    private static void withdraw() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap so tai khoan: ");
        long accountNumber = Long.parseLong(scanner.nextLine());
        Account account = findAccount(accountNumber);
        if (account == null) {
            System.out.println("Tai khoan nay khong ton tai");
        } else {
            System.out.print("Nhap so tien muon rut: ");
            double amount = Double.parseDouble(scanner.nextLine());
            try {
                account.withdraw(amount);
                System.out.println("Rut tien thanh cong");
            } catch (IllegalArgumentException e) {
                System.out.println(e.getMessage());
            }
        }
    }

    private static Account findAccount(long accountNumber) {
        for (Account account : accounts) {
            if (account.getAccountNumber() == accountNumber) {
                return account;
            }
        }
        return null;
    }

    private static void sortAccountByNameAscending() {
        Collections.sort(accounts, Comparator.comparing(Account::getName));
        System.out.println("Danh sach tai khoan da sap xep theo ten tang dan:");
        for (Account account : accounts) {
            System.out.println(account);
        }
    }

    private static void sortAccountByBalanceDescending() {
        Collections.sort(accounts, Comparator.comparing(Account::getBalance).reversed());
        System.out.println("Danh sach tai khoan da sap xep theo so du giam dan:");
        for (Account account : accounts) {
            System.out.println(account);
        }
    }
}
