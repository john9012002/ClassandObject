package Bai12;
public class Point {
    private int x;
    private int y;
    public Point() {
    }

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public void move(int newX, int newY) {
        x = newX;
        y = newY;
    }

    @Override
    public String toString() {
        return "(" + x + "," + y + ")";
    }
}
