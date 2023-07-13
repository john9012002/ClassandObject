package Bai14;
public class Bai14 {
    public static void main(String[] args) {
        Nguoi[] nguoiArray = new Nguoi[4];

        nguoiArray[0] = new HocSinh("Phú Hiền", 2005, "Hà Nội", 8.5);
        nguoiArray[1] = new HocSinh("Cát Hạnh", 2006, "Hải Phòng", 9.5);
        nguoiArray[2] = new SinhVien("Phú Hiền", 2003, "Hà Nội", 8.0, true);
        nguoiArray[3] = new SinhVien("Cát Hạnh", 2002, "Hải Phòng", 9.0, false);

        for (Nguoi nguoi : nguoiArray) {
            nguoi.nhap();
            nguoi.xuat();
            if (nguoi instanceof HocSinh) {
                ((HocSinh) nguoi).thongBaoKhenThuong();
            } else if (nguoi instanceof SinhVien) {
                ((SinhVien) nguoi).thongBaoKhenThuong();
            }
        }
    }
}