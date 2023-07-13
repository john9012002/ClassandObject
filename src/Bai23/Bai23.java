package Bai23;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class Bai23 {
    public static void main(String[] args) {
        int n = 3; // Set the number of students you want to create

        ArrayList<Student> studentList = new ArrayList<>();

        try {
            // Creating students using constructor
            Student student1 = new Student("ab1234567", "John Smith");
            Student student2 = new Student("cd9876543", "Emma Watson");
            Student student3 = new Student("xy5432198", "Peter Parker");

            // Adding students to the list
            studentList.add(student1);
            studentList.add(student2);
            studentList.add(student3);
        } catch (Exception e) {
            System.out.println("Some students could not be created: " + e.getMessage());
        }

        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < n; i++) {
            System.out.println("Enter details for student " + (i + 1) + ":");
            try {
                Student student = inputStudent(scanner);
                studentList.add(student);
            } catch (Exception e) {
                System.out.println("Student could not be created: " + e.getMessage());
                i--;
            }
        }

        scanner.close();

        System.out.println("Student List:");
        outputStudentList(studentList);

        Collections.sort(studentList, new Comparator<Student>() {
            public int compare(Student s1, Student s2) {
                return s2.getId().compareTo(s1.getId());
            }
        });

        System.out.println("\nStudent List (Sorted by ID in descending order):");
        outputStudentList(studentList);

        Collections.sort(studentList, new Comparator<Student>() {
            public int compare(Student s1, Student s2) {
                return s1.getFirstName().compareTo(s2.getFirstName());
            }
        });

        System.out.println("\nStudent List (Sorted by Name and Last Name in ascending order):");
        outputStudentList(studentList);
    }

    public static Student inputStudent(Scanner scanner) throws Exception {
        System.out.print("Enter ID: ");
        String id = scanner.nextLine();

        System.out.print("Enter Name: ");
        String name = scanner.nextLine();

        return new Student(id, name);
    }

    public static void outputStudentList(ArrayList<Student> studentList) {
        for (Student student : studentList) {
            System.out.printf("ID: %-10s Last Name: %-15s First Name: %-15s Email: %s\n",
                    student.getId(), student.getLastName(), student.getFirstName(), student.getEmail());
        }
    }
}
