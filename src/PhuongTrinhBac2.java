// PhuongTrinhBac2.java
public class PhuongTrinhBac2 {
    private double a;
    private double b;
    private double c;

    public PhuongTrinhBac2(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public void giai() {
        double delta = b * b - 4 * a * c;
        if (delta > 0) {
            double x1 = (-b + Math.sqrt(delta)) / (2 * a);
            double x2 = (-b - Math.sqrt(delta)) / (2 * a);
            System.out.println("Phuong trinh co 2 nghiem phan biet:");
            System.out.println("x1 = " + x1);
            System.out.println("x2 = " + x2);
        } else if (delta == 0) {
            double x = -b / (2 * a);
            System.out.println("Phuong trinh co nghiem kep:");
            System.out.println("x = " + x);
        } else {
            System.out.println("Phuong trinh vo nghiem.");
        }
    }
    public static void main(String[] args) {
        PhuongTrinhBac2 pt1 = new PhuongTrinhBac2(2, -5, 7);
        System.out.println("Phuong trinh 1:");
        pt1.giai();

        PhuongTrinhBac2 pt2 = new PhuongTrinhBac2(5, 8, 9);
        System.out.println("Phuong trinh 2:");
        pt2.giai();
    }
}