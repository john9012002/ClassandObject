package Bai17;
public class Bai17 {
    public static void main(String[] args) {
        Shape[] shapes = new Shape[4];

        shapes[0] = new Rectangle(0, 0, 5, 3);
        shapes[1] = new Rectangle(2, 4, -2, 6);
        shapes[2] = new Triangle(1, 1, 3, 4, 5);
        shapes[3] = new Triangle(2, 2, 2, 2, 3);

        for (Shape shape : shapes) {
            shape.draw("đỏ");
            System.out.println("Diện tích: " + shape.area());
            System.out.println("Chu vi: " + shape.perimeter());
            if (shape instanceof Triangle) {
                System.out.println("Loại tam giác: " + ((Triangle) shape).getType());
            }
        }
    }
}
