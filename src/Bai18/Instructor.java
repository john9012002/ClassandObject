package Bai18;
public class Instructor implements Comparable<Instructor> {
    private String code;
    private String name;
    private float feedback;
    private String email;
    private static String course = "OOP-Java";

    public Instructor(String code, String name, float feedback) {
        this.code = code;
        this.name = name;
        this.feedback = feedback;
        this.email = getEmail();
    }

    public String getCode() {
        return code;
    }

    public String getName() {
        return name;
    }

    public float getFeedback() {
        return feedback;
    }

    public String getEmail() {
        return code + "@abc.com";
    }

    public static void printTitle() {
        System.out.println("COURSE\tNAME\tCODE\tFEEDBACK\tEMAIL");
    }

    public void printDetail() {
        System.out.printf("%-7s%-7s%-7s%-10.1f%-15s\n", course, name, code, feedback, email);
    }

    @Override
    public String toString() {
        return code + ", " + name + ", " + feedback;
    }

    @Override
    public int compareTo(Instructor other) {
        if (this.feedback < other.feedback) {
            return -1;
        } else if (this.feedback > other.feedback) {
            return 1;
        } else {
            return 0;
        }
    }
}
