package Bai17;
public class Rectangle  extends Point implements Shape {
    private double length;
    private double width;

    public Rectangle() {
        super();
        this.length = 0;
        this.width = 0;
    }

    public Rectangle(double x, double y, double length, double width) {
        super(x, y);
        if (length < 0) {
            this.length = 0;
        } else {
            this.length = length;
        }
        if (width < 0) {
            this.width = 0;
        } else {
            this.width = width;
        }
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        if (length < 0) {
            this.length = 0;
        } else {
            this.length = length;
        }
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        if (width < 0) {
            this.width = 0;
        } else {
            this.width = width;
        }
    }

    @Override
    public void draw(String color) {
        System.out.println("Đây là hình chữ nhật (" + length + ", " + width + ") màu " + color + ", được vẽ tại tọa độ " + this.toString());
    }

    @Override
    public double area() {
        return length * width;
    }

    @Override
    public double perimeter() {
        return 2 * (length + width);
    }

    @Override
    public String toString() {
        return "[" + super.toString() + ", " + length + ", " + width + "]";
    }
}