package Bai17;

public class Triangle extends Point implements Shape {
    private double a;
    private double b;
    private double c;

    public Triangle() {
        super();
        this.a = 0;
        this.b = 0;
        this.c = 0;
    }

    public Triangle(double x, double y, double a, double b, double c) {
        super(x, y);
        if (a < 0) {
            this.a = 0;
        } else {
            this.a = a;
        }
        if (b < 0) {
            this.b = 0;
        } else {
            this.b = b;
        }
        if (c < 0) {
            this.c = 0;
        } else {
            this.c = c;
        }
        if (!isTriangle()) {
            System.out.println("Không tạo được tam giác");
            this.a = 0;
            this.b = 0;
            this.c = 0;
        }
    }

    public boolean isTriangle() {
        if (a <= 0 || b <= 0 || c <= 0) {
            return false;
        }
        if (a + b <= c || a + c <= b || b + c <= a) {
            return false;
        }
        return true;
    }

    @Override
    public void draw(String color) {
        System.out.println("Đây là tam giác (" + a + ", " + b + ", " + c + ") màu " + color + ", được vẽ tại tọa độ " + this.toString());
    }

    @Override
    public double area() {
        double p = (a + b + c) / 2;
        return Math.sqrt(p * (p - a) * (p - b) * (p - c));
    }

    @Override
    public double perimeter() {
        return a + b + c;
    }

    public String getType() {
        if (a == b && b == c) {
            return "đều";
        } else if (a == b || b == c || c == a) {
            if (a * a + b * b == c * c || a * a + c * c == b * b || b * b + c * c == a * a) {
                return "vuông cân";
            } else {
                return "cân";
            }
        } else if (a * a + b * b == c * c || a * a + c * c == b * b || b * b + c * c == a * a) {
            return "vuông";
        } else {
            return "thường";
        }
    }

    @Override
    public String toString() {
        return "[" + super.toString() + ", " + a + ", " + b + ", " + c + "]";
    }
}