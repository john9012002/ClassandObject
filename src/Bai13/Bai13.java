package Bai13;
public class Bai13 {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle(10, 3);
        System.out.println("Chu vi hình chữ nhật " + rectangle.toString() + " là " + rectangle.perimeter());
        System.out.println("Diện tích hình chữ nhật " + rectangle.toString() + " là " + rectangle.area());

        Box box = new Box(2, 4, 6);
        System.out.println("Diện tích hình hộp " + box.toString() + " là " + box.area());
        System.out.println("Thể tích hình hộp " + box.toString() + " là " + box.volume());
    }
}
