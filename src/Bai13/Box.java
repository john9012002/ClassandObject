package Bai13;
public class Box extends Rectangle {
    private double height;

    public Box() {
        super();
        this.height = 0;
    }

    public Box(double length, double width, double height) {
        super(length, width);

        if (height < 0) {
            this.height = 0;
        } else {
            this.height = height;
        }
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        if (height < 0) {
            this.height = 0;
        } else {
            this.height = height;
        }
    }

    @Override
    protected double area() {
        return 2 * (getLength() * getWidth() + getWidth() * getHeight() + getHeight() * getLength());
    }

    @Override
    public String toString() {
        return "(" + getLength() + "," + getWidth() + "," + height + ")";
    }

    public double volume() {
        return getLength() * getWidth() * height;
    }
}
