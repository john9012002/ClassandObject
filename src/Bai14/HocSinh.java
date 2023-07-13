package Bai14;
import java.util.Scanner;

public class HocSinh extends Nguoi {
    private double diemTrungBinh;

    public HocSinh() {
        super();
        this.diemTrungBinh = 0;
    }

    public HocSinh(String hoTen, int namSinh, String diaChi, double diemTrungBinh) {
        super(hoTen, namSinh, diaChi);

        if (diemTrungBinh < 0) {
            this.diemTrungBinh = 0;
        } else {
            this.diemTrungBinh = diemTrungBinh;
        }
    }

    @Override
    public void nhap() {
        super.nhap();

        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhập điểm trung bình: ");
        diemTrungBinh = scanner.nextDouble();
    }

    @Override
    public void xuat() {
        super.xuat();
    }

    public boolean khenThuong() {
        return diemTrungBinh >= 9;
    }

    public void thongBaoKhenThuong() {
        if (khenThuong()) {
            System.out.println("Học sinh <" + super.hoTen + "> được khen thưởng");
        } else {
            System.out.println("Học sinh <" + super.hoTen + "> không được khen thưởng");
        }
    }
}