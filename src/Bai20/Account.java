package Bai20;
import java.util.Scanner;

public class Account {
    private static long nextAccountNumber = 81030000000L;
    private long accountNumber;
    private String name;
    private String cellphone;
    private double balance;

    public Account(String name, String cellphone, double balance) {
        this.accountNumber = nextAccountNumber++;
        this.name = name;
        this.cellphone = cellphone;
        this.balance = balance;
        if (balance < 0) {
            throw new IllegalArgumentException("So du khong the am");
        }
    }

    public long getAccountNumber() {
        return accountNumber;
    }

    public String getName() {
        return name;
    }

    public String getCellphone() {
        return cellphone;
    }

    public double getBalance() {
        return balance;
    }

    public void deposit(double amount) {
        if (amount <= 0) {
            throw new IllegalArgumentException("So tien khong hop le");
        }
        balance += amount;
    }

    public void withdraw(double amount) {
        if (amount <= 0) {
            throw new IllegalArgumentException("So tien khong hop le");
        }
        if (amount > balance) {
            throw new IllegalArgumentException("Tai khoan khong du tien");
        }
        balance -= amount;
    }

    public static Account input() {
        Scanner scanner = new Scanner(System.in);
        String name, cellphone;
        double balance;
        while (true) {
            System.out.print("Nhap ten chu tai khoan: ");
            name = scanner.nextLine();
            System.out.print("Nhap so dien thoai: ");
            cellphone = scanner.nextLine();
            System.out.print("Nhap so du: ");
            try {
                balance = Double.parseDouble(scanner.nextLine());
                if (balance < 0) {
                    throw new IllegalArgumentException("So du khong the am");
                }
                break;
            } catch (NumberFormatException e) {
                System.out.println("So du khong hop le");
            } catch (IllegalArgumentException e) {
                System.out.println(e.getMessage());
            }
        }
        return new Account(name, cellphone, balance);
    }

    @Override
    public String toString() {
        return "Account{" +
                "accountNumber=" + accountNumber +
                ", name='" + name + '\'' +
                ", cellphone='" + cellphone + '\'' +
                ", balance=" + balance +
                '}';
    }
}
