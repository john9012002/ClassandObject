package Bai11;
public class PhuongTrinhBacNhat {
    private double a;
    private double b;
    protected double x1;

    public PhuongTrinhBacNhat() {
    }

    public PhuongTrinhBacNhat(double a, double b) {
        this.a = a;
        this.b = b;
    }

    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }

    public double getB() {
        return b;
    }

    public void setB(double b) {
        this.b = b;
    }

    public int giai() {
        if (a == 0) {
            if (b == 0) {
                return 0; // VSN
            } else {
                return -1; // Vô nghiệm
            }
        } else {
            x1 = -b / a;
            return 1; // Có 1 nghiệm
        }
    }

    public void xuatNghiem() {
        int ketQua = giai();

        if (ketQua == 0) {
            System.out.println("Phương trình " + a + "x + " + b + " = 0 có vô số nghiệm");
        } else if (ketQua == -1) {
            System.out.println("Phương trình " + a + "x + " + b + " = 0 vô nghiệm");
        } else {
            System.out.println("Phương trình " + a + "x + " + b + " = 0 có 1 nghiệm x = " + x1);
        }
    }
}
