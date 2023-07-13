package Bai19;
import java.util.Comparator;

public class Student implements Comparable<Student> {
    private String lastName;
    private String firstName;
    private int birthYear;
    private float gpa;

    public Student(String lastName, String firstName, int birthYear, float gpa) {
        this.lastName = lastName;
        this.firstName = firstName;
        this.birthYear = birthYear;
        this.gpa = gpa;
    }

    public String getLastName() {
        return lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public int getBirthYear() {
        return birthYear;
    }

    public float getGpa() {
        return gpa;
    }

    @Override
    public String toString() {
        return String.format("%-20s%-20s%4d%8.2f", lastName + ", " + firstName, "", birthYear, gpa);
    }

    @Override
    public int compareTo(Student other) {
        int result = this.firstName.compareTo(other.firstName);
        if (result == 0) {
            result = this.lastName.compareTo(other.lastName);
        }
        return result;
    }

    public static Comparator<Student> compByGpaObj = new Comparator<Student>() {
        @Override
        public int compare(Student s1, Student s2) {
            if (s1.gpa < s2.gpa) {
                return -1;
            } else if (s1.gpa > s2.gpa) {
                return 1;
            } else {
                return 0;
            }
        }
    };

    public static Comparator<Student> compBybYearObj = new Comparator<Student>() {
        @Override
        public int compare(Student s1, Student s2) {
            if (s1.birthYear < s2.birthYear) {
                return -1;
            } else if (s1.birthYear > s2.birthYear) {
                return 1;
            } else {
                return 0;
            }
        }
    };
}