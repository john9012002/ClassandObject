package Bai11;
public class PhuongTrinhBacHai extends PhuongTrinhBacNhat {
    private double c;
    private double x2;

    public PhuongTrinhBacHai() {
    }

    public PhuongTrinhBacHai(double a, double b, double c) {
        super(a, b);
        this.c = c;
    }

    public double getC() {
        return c;
    }

    public void setC(double c) {
        this.c = c;
    }

    @Override
    public int giai() {
        if (getA() == 0) {
            return super.giai();
        } else {
            double delta = getB() * getB() - 4 * getA() * getC();

            if (delta > 0) {
                x1 = (-getB() + Math.sqrt(delta)) / (2 * getA());
                x2 = (-getB() - Math.sqrt(delta)) / (2 * getA());
                return 2; // Có 2 nghiệm phân biệt
            } else if (delta == 0) {
                x1 = -getB() / (2 * getA());
                x2 = x1;
                return 1; // Có 1 nghiệm kép
            } else {
                return -1; // Vô nghiệm
            }
        }
    }

    @Override
    public void xuatNghiem() {
        int ketQua = giai();

        if (getA() == 0) {
            super.xuatNghiem();
        } else {
            if (ketQua == -1) {
                System.out.println("Phương trình " + getA() + "x^2 + " + getB() + "x + " + getC() + " vô nghiệm");
            } else if (ketQua == 1) {
                System.out.println("Phương trình " + getA() + "x^2 + " + getB() + "x + " + getC() + " có 1 nghiệm kép x1 = x2 = " + x1);
            } else {
                System.out.println("Phương trình " + getA() + "x^2 + " + getB() + "x + " + getC() + " có 2 nghiệm phân biệt x1 = " + x1 + " và x2 = " + x2);
            }
        }
    }
}
