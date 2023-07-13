package Bai11;
public class Bai11 {
    public static void main(String[] args) {
        PhuongTrinhBacNhat pt1 = new PhuongTrinhBacNhat(2, 3);
        pt1.xuatNghiem();

        PhuongTrinhBacNhat pt2 = new PhuongTrinhBacNhat(8, 0);
        pt2.xuatNghiem();

        PhuongTrinhBacHai pt3 = new PhuongTrinhBacHai(2, -1, 2);
        pt3.xuatNghiem();

        PhuongTrinhBacHai pt4 = new PhuongTrinhBacHai(0, 5, 0);
        pt4.xuatNghiem();
    }
}
