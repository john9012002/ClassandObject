package Bai12;
public class Bai12 {
    public static void main(String[] args) {
        Circle circle1 = new Circle(0, 0, 5, "Đỏ");
        circle1.draw();
        System.out.println("Diện tích: " + circle1.area());
        System.out.println("Chu vi: " + circle1.perimeter());

        Circle circle2 = new Circle(3, 4, 2.5, "Xanh");
        circle2.draw();
        System.out.println("Diện tích: " + circle2.area());
        System.out.println("Chu vi: " + circle2.perimeter());

        Circle circle3 = new Circle(-2, -2, 7, "Vàng");
        circle3.draw();
        System.out.println("Diện tích: " + circle3.area());
        System.out.println("Chu vi: " + circle3.perimeter());
    }
}
