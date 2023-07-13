package Bai10;
public class TruongDaiHoc {
    private String tenTruong;
    private float diemChuan;

    public TruongDaiHoc(String tenTruong, float diemChuan) {
        this.tenTruong = tenTruong;
        this.diemChuan = diemChuan;
    }

    public void xetTuyen(ThiSinh thiSinh) {
        float diemXetTuyen = thiSinh.tinhDiemXetTuyen();
        boolean diemLiet = thiSinh.kiemTraDiemLiet();

        System.out.print("Kết quả xét tuyển của thí sinh " + thiSinh.getHoTen() + " vào trường " + tenTruong + ": ");

        if (diemXetTuyen >= diemChuan && !diemLiet) {
            System.out.println("Chúc mừng bạn " + thiSinh.getHoTen() + " đã trúng tuyển");
        } else {
            System.out.println("Rất tiếc, bạn " + thiSinh.getHoTen() + " chưa đủ điều kiện trúng tuyển");
        }
    }
}