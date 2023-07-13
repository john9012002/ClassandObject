import java.util.Scanner;

public class Employee {
    private String name;
    private int yearOfBirth;
    private String address;

    public Employee(String name, int yearOfBirth, String address) {
        setName(name);
        setYearOfBirth(yearOfBirth);
        setAddress(address);
    }

    public void setYearOfBirth(int yearOfBirth) {
        if (yearOfBirth <= 0) {
            throw new IllegalArgumentException("Invalid year of birth");
        }
        this.yearOfBirth = yearOfBirth;
    }

    public void setAddress(String address) {
        if (address == null || address.length() > 50) {
            throw new IllegalArgumentException("Invalid address");
        }
        this.address = address;
    }

    public static Employee input() {
        Scanner scanner = new Scanner(System.in);
        String name, address;
        int yearOfBirth;
        while (true) {
            System.out.print("Nhap ten: ");
            name = scanner.nextLine();
            System.out.print("Nhap nam sinh: ");
            try {
                yearOfBirth = Integer.parseInt(scanner.nextLine());
                if (yearOfBirth <= 0) {
                    throw new IllegalArgumentException("Invalid year of birth");
                }
                break;
            } catch (NumberFormatException e) {
                System.out.println("Nam sinh khong hop le");
            } catch (IllegalArgumentException e) {
                System.out.println(e.getMessage());
            }
        }
        while (true) {
            System.out.print("Nhap dia chi: ");
            address = scanner.nextLine();
            try {
                if (address == null || address.length() > 50) {
                    throw new IllegalArgumentException("Invalid address");
                }
                break;
            } catch (IllegalArgumentException e) {
                System.out.println(e.getMessage());
            }
        }
        return new Employee(name, yearOfBirth, address);
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", yearOfBirth=" + yearOfBirth +
                ", address='" + address + '\'' +
                '}';
    }

    public void output() {
        System.out.println(toString());
    }

    public void setName(String name) {
        this.name = name;
    }

    public static void main(String[] args) {
        Employee employee1 = new Employee("John Smith", 1980, "123 Main St, Anytown USA");
        Employee employee2 = new Employee("Jane Doe", 0, "123456789012345678901234567890123456789012345678901");
        Employee employee3 = Employee.input();

        employee1.output();
        try {
            employee2.setYearOfBirth(-1);
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        }
        try {
            employee2.setAddress("123456789012345678901234567890123456789012345678901");
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        }
        employee2.output();
        employee3.output();
    }
}