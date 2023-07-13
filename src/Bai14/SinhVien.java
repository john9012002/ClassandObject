package Bai14;
import java.util.Scanner;

public class SinhVien extends HocSinh {
    private boolean nghienCuuKhoaHoc;

    public SinhVien() {
        super();
        this.nghienCuuKhoaHoc = false;
    }

    public SinhVien(String hoTen, int namSinh, String diaChi, double diemTrungBinh, boolean nghienCuuKhoaHoc) {
        super(hoTen, namSinh, diaChi, diemTrungBinh);
        this.nghienCuuKhoaHoc = nghienCuuKhoaHoc;
    }

    @Override
    public void nhap() {
        super.nhap();

        Scanner scanner = new Scanner(System.in);

        System.out.print("Có nghiên cứu khoa học hay không (true/false): ");
        nghienCuuKhoaHoc = scanner.nextBoolean();
    }

    @Override
    public void xuat() {
        super.xuat();
    }

    @Override
    public boolean khenThuong() {
        return super.khenThuong() && nghienCuuKhoaHoc;
    }

    public void thongBaoKhenThuong() {
        if (khenThuong()) {
            System.out.println("Sinh viên <" + super.hoTen + "> được khen thưởng");
        } else {
            System.out.println("Sinh viên <" + super.hoTen + "> không được khen thưởng");
        }
    }
}
