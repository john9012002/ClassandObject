// HinhChuNhat.java

import java.util.Scanner;

public class HinhChuNhat {
    private double chieuDai;
    private double chieuRong;

    public HinhChuNhat() {
        // Constructor 0 tham số
    }

    public HinhChuNhat(double chieuDai, double chieuRong) {
        // Constructor 2 tham số
        this.chieuDai = chieuDai;
        this.chieuRong = chieuRong;
    }

    public void veHinhChuNhat() {
        for (int i = 0; i < chieuRong; i++) {
            for (int j = 0; j < chieuDai; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public double tinhChuVi() {
        return 2 * (chieuDai + chieuRong);
    }

    public double tinhDienTich() {
        return chieuDai * chieuRong;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // a. Vẽ hình chữ nhật và tính chu vi, diện tích
        System.out.print("Nhập chiều dài hình chữ nhật: ");
        double chieuDai = scanner.nextDouble();
        System.out.print("Nhập chiều rộng hình chữ nhật: ");
        double chieuRong = scanner.nextDouble();

        HinhChuNhat hcn = new HinhChuNhat(chieuDai, chieuRong);
        System.out.println("Hình chữ nhật:");
        hcn.veHinhChuNhat();
        System.out.println("Chu vi: " + hcn.tinhChuVi());
        System.out.println("Diện tích: " + hcn.tinhDienTich());

        // b. Tính tổng chu vi của 3 hình chữ nhật
        HinhChuNhat hcn1 = new HinhChuNhat(4, 5);
        HinhChuNhat hcn2 = new HinhChuNhat(3, 6);
        HinhChuNhat hcn3 = new HinhChuNhat(2, 7);

        double tongChuVi = hcn1.tinhChuVi() + hcn2.tinhChuVi() + hcn3.tinhChuVi();
        System.out.println("Tổng chu vi của 3 hình chữ nhật: " + tongChuVi);

        // c. Tính bình quân diện tích của 3 hình chữ nhật
        double trungBinhDienTich = (hcn1.tinhDienTich() + hcn2.tinhDienTich() + hcn3.tinhDienTich()) / 3;
        System.out.println("Bình quân diện tích của 3 hình chữ nhật: " + trungBinhDienTich);
    }
}