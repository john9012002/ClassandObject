package Bai19;
public class Bai19 {
    public static void main(String[] args) {
        StudentList list = new StudentList();
        list.add(new Student("Nguyen", "Van", 2000, 3.5f));
        list.add(new Student("Tran", "Thi", 2001, 3.2f));
        list.add(new Student("Le", "Hoang", 1999, 3.8f));
        list.add(new Student("Pham", "Anh", 2002, 3.0f));

        System.out.println("Sort by name:");
        list.sortByName();
        list.output();

        System.out.println("Sort by GPA:");
        list.sortByGpa();
        list.output();

        Student maxGpa = list.getMaxGpa();
        Student minGpa = list.getMinGpa();
        System.out.println("Student with max GPA: " + maxGpa);
        System.out.println("Student with min GPA: " + minGpa);
    }
}
