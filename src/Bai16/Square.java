package Bai16;
public class Square  implements Shape {
    private double edge;

    public Square(double edge) {
        this.edge = edge;
    }

    @Override
    public double area() {
        return edge * edge;
    }

    @Override
    public double perimeter() {
        return 4 * edge;
    }

    @Override
    public void draw(String color) {
        System.out.println("Đây là hình vuông màu " + color + ", có cạnh " + edge);
    }
}
