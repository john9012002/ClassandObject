package Bai24;
import java.util.ArrayList;
import java.util.Collections;

public class Bai24 {
     public static void main(String[] args) {
        int n = 3;
        ArrayList<Student> students = new ArrayList<Student>();
        for (int i = 0; i < n; i++) {
            String id = Student.inputId();
            String name = Student.inputName();
            try {
                Student student = new Student(id, name);
                students.add(student);
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
        System.out.println("Danh sach sinh vien:");
        System.out.printf("%-15s%-20s%-20s%-30s\n", "ID", "Last Name", "First Name", "Email");
        for (Student student : students) {
            student.output();
        }
        Collections.sort(students);
        System.out.println("Danh sach sinh vien sap xep theo ID giam dan:");
        System.out.printf("%-15s%-20s%-20s%-30s\n", "ID", "Last Name", "First Name", "Email");
        for (Student student : students) {
            student.output();
        }
        Collections.sort(students, Student.nameComparator);
        System.out.println("Danh sach sinh vien sap xep theo ten va ho tang dan:");
        System.out.printf("%-15s%-20s%-20s%-30s\n", "ID", "Last Name", "First Name", "Email");
        for (Student student : students) {
            student.output();
        }
    }
}
