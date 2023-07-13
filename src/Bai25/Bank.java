package Bai25;
public class Bank {
    private static int nextAccountNumber = 1;

    public static int getNextAccountNumber() {
        return nextAccountNumber++;
    }
}