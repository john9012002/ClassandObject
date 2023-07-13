package Bai14;
import java.util.Scanner;

public class Nguoi {
    protected String hoTen;
    private int namSinh;
    private String diaChi;

    public Nguoi() {
    }

    public Nguoi(String hoTen, int namSinh, String diaChi) {
        this.hoTen = hoTen;
        this.namSinh = namSinh;
        this.diaChi = diaChi;
    }

    public void nhap() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhập họ tên: ");
        hoTen = scanner.nextLine();

        System.out.print("Nhập năm sinh: ");
        namSinh = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Nhập địa chỉ: ");
        diaChi = scanner.nextLine();
    }

    public void xuat() {
        System.out.println(hoTen + ", " + namSinh + ", " + diaChi);
    }
}
