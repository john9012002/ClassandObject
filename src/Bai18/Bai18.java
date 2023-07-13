package Bai18;
import java.util.ArrayList;
import java.util.TreeSet;

public class Bai18 {
    public static void main(String[] args) {
        ArrayList<Instructor> instructorList = new ArrayList<>();
        instructorList.add(new Instructor("001", "John", 4.5f));
        instructorList.add(new Instructor("002", "Alice", 4.2f));
        instructorList.add(new Instructor("003", "Bob", 4.8f));

        System.out.println("Instructor List:");
        Instructor.printTitle();
        for (Instructor instructor : instructorList) {
            instructor.printDetail();
        }

        TreeSet<Instructor> instructorSet = new TreeSet<>();
        instructorSet.add(new Instructor("001", "John", 4.5f));
        instructorSet.add(new Instructor("002", "Alice", 4.2f));
        instructorSet.add(new Instructor("003", "Bob", 4.8f));

        System.out.println("\nInstructor TreeSet:");
        Instructor.printTitle();
        for (Instructor instructor : instructorSet) {
            instructor.printDetail();
        }
    }
}
