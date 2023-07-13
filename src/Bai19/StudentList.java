package Bai19;
import java.util.ArrayList;
import java.util.Collections;

public class StudentList {
    private ArrayList<Student> list;

    public StudentList() {
        list = new ArrayList<Student>();
    }

    public ArrayList<Student> getList() {
        return list;
    }

    public void setList(ArrayList<Student> list) {
        this.list = list;
    }

    public void add(Student stud) {
        list.add(stud);
    }

    public void output() {
        System.out.format("%-20s%-20s%-10s%-10s\n", "Last Name, First Name", "Birth Year", "GPA", "");
        for (Student stud : list) {
            System.out.println(stud);
        }
    }

    public void sortBybirthYear() {
        Collections.sort(list, Student.compBybYearObj);
    }

    public void sortByGpa() {
        Collections.sort(list, Student.compByGpaObj);
    }

    public void sortByName() {
        Collections.sort(list);
    }

    public Student getMaxGpa() {
        return Collections.max(list, Student.compByGpaObj);
    }

    public Student getMinGpa() {
        return Collections.min(list, Student.compByGpaObj);
    }
}
