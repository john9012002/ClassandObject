package Bai16;
public class Bai16 {
    public static void main(String[] args) {
        Shape[] shapes = new Shape[4];

        shapes[0] = new Circle(5);
        shapes[1] = new Circle(3);
        shapes[2] = new Square(4);
        shapes[3] = new Square(6);

        for (Shape shape : shapes) {
            shape.draw("đỏ");
            System.out.println("Diện tích: " + shape.area());
            System.out.println("Chu vi: " + shape.perimeter());
        }
    }
}
