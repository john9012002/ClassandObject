package Bai12;
public class Circle extends Point {
    private double radius;
    private String color;

    public Circle() {
    }

    public Circle(int x, int y, double radius, String color) {
        super(x, y);
        this.radius = radius;
        this.color = color;
    }

    public void draw() {
        System.out.println("Hình tròn có bán kính " + radius + ", màu " + color + ", được vẽ tại tọa độ " + toString());
    }

    public double area() {
        return Math.PI * radius * radius;
    }

    public double perimeter() {
        return 2 * Math.PI * radius;
    }
}
