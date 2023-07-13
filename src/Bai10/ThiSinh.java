package Bai10;
import java.util.Scanner;

public class ThiSinh {
    private String hoTen;
    private String soBaoDanh;
    private float diemMon1;
    private float diemMon2;
    private float diemMon3;
    private boolean hocSinhGioi;
    private boolean doiTuongUuTien;

    public void nhapThongTin() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhập họ tên: ");
        hoTen = scanner.nextLine();

        System.out.print("Nhập số báo danh: ");
        soBaoDanh = scanner.nextLine();

        System.out.print("Nhập điểm môn 1: ");
        diemMon1 = scanner.nextFloat();

        System.out.print("Nhập điểm môn 2: ");
        diemMon2 = scanner.nextFloat();

        System.out.print("Nhập điểm môn 3: ");
        diemMon3 = scanner.nextFloat();

        System.out.print("Học sinh giỏi lớp 12 (có/không): ");
        hocSinhGioi = scanner.nextBoolean();

        System.out.print("Đối tượng ưu tiên (có/không): ");
        doiTuongUuTien = scanner.nextBoolean();
    }

    public float tinhDiemXetTuyen() {
        float diemXetTuyen = diemMon1 + diemMon2 + diemMon3;

        if (hocSinhGioi) {
            diemXetTuyen += 1;
        }

        if (doiTuongUuTien) {
            diemXetTuyen += 0.5;
        }

        return diemXetTuyen;
    }

    public boolean kiemTraDiemLiet() {
        if (diemMon1 == 0 || diemMon2 == 0 || diemMon3 == 0) {
            return true;
        } else {
            return false;
        }
    }

    public String getHoTen() {
        return hoTen;
    }
}