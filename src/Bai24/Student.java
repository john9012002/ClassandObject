package Bai24;
import java.util.Comparator;
import java.util.Scanner;

public class Student implements Comparable<Student> {
    private String id;
    private String name;

    public Student(String id, String name) throws Exception {
        setId(id);
        setName(name);
    }

    public void setId(String id) throws Exception {
        if (!id.matches("[a-zA-Z]{2}[0-9]{7}")) {
            throw new Exception("Invalid id");
        }
        this.id = id;
    }

    public void setName(String name) throws Exception {
        if (name.split("\\s+").length < 2) {
            throw new Exception("Invalid name");
        }
        this.name = name;
    }

    public String getFirstName() {
        String[] arr = name.split("\\s+");
        return arr[arr.length - 1];
    }

    public String getLastName() {
        String firstName = getFirstName();
        return name.substring(0, name.length() - firstName.length()).trim();
    }

    public String getEmail() {
        String firstName = getFirstName();
        String lastName = getLastName();
        String idSuffix = id.substring(5);
        return firstName + "." + lastName.charAt(0) + idSuffix + "@sinhvien.hoasen.edu.vn";
    }

    public static String inputId() {
        Scanner scanner = new Scanner(System.in);
        String id;
        while (true) {
            System.out.print("Nhap id: ");
            id = scanner.nextLine();
            try {
                new Student(id, "");
                break;
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
        return id;
    }

    public static String inputName() {
        Scanner scanner = new Scanner(System.in);
        String name;
        while (true) {
            System.out.print("Nhap ten: ");
            name = scanner.nextLine();
            try {
                new Student("", name);
                break;
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
        return name;
    }

    public static Student input() {
        String id = inputId();
        String name = inputName();
        try {
            return new Student(id, name);
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return null;
        }
    }

    @Override
    public String toString() {
        return String.format("%-15s%-20s%-20s%-30s", id, getLastName(), getFirstName(), getEmail());
    }

    public void output() {
        System.out.println(toString());
    }

    @Override
    public int compareTo(Student other) {
        return other.id.compareTo(this.id);
    }

    public static Comparator<Student> nameComparator = new Comparator<Student>() {
        @Override
        public int compare(Student s1, Student s2) {
            String name1 = s1.getLastName() + s1.getFirstName();
            String name2 = s2.getLastName() + s2.getFirstName();
            return name1.compareTo(name2);
        }
    };
}