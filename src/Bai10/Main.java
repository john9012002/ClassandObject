package Bai10;
public class Main {
    public static void main(String[] args) {
        ThiSinh thiSinh1 = new ThiSinh();
        thiSinh1.nhapThongTin();

        ThiSinh thiSinh2 = new ThiSinh();
        thiSinh2.nhapThongTin();

        ThiSinh thiSinh3 = new ThiSinh();
        thiSinh3.nhapThongTin();

        TruongDaiHoc truongHSU = new TruongDaiHoc("HSU", 15);
        truongHSU.xetTuyen(thiSinh1);

        TruongDaiHoc truongHUTECH = new TruongDaiHoc("HUTECH", 16);
        truongHUTECH.xetTuyen(thiSinh2);

        TruongDaiHoc truongSGU = new TruongDaiHoc("SGU", 15.5f);
        truongSGU.xetTuyen(thiSinh3);
    }
}
