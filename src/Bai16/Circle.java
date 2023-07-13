package Bai16;
public class Circle implements Shape {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double area() {
        return PI * radius * radius;
    }

    @Override
    public double perimeter() {
        return 2 * PI * radius;
    }

    @Override
    public void draw(String color) {
        System.out.println("Đây là hình tròn màu " + color + ", có bán kính " + radius);
    }
}
