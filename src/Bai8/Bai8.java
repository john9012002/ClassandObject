package Bai8;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Bai8 {
    public static void main(String[] args) {
            // Tạo danh sách chứa 5 đối tượng Person
            List<Person> people = new ArrayList<>();
    
            // Tạo các đối tượng Person
            Name name1 = new Name("John", "Doe", "Smith");
            Person person1 = new Person(1, name1, "123 Main Street");
            people.add(person1);
    
            Name name2 = new Name("Alice", "Johnson", "Marie");
            Person person2 = new Person(2, name2, "456 Elm Street");
            people.add(person2);
    
            Name name3 = new Name("David", "Smith", "James");
            Person person3 = new Person(3, name3, "789 Oak Street");
            people.add(person3);
    
            Name name4 = new Name("Emily", "Brown", "Grace");
            Person person4 = new Person(4, name4, "321 Pine Street");
            people.add(person4);
    
            Name name5 = new Name("Michael", "Davis", "Robert");
            Person person5 = new Person(5, name5, "654 Cedar Street");
            people.add(person5);
    
            // Sắp xếp danh sách theo firstName
            Collections.sort(people, Comparator.comparing(p -> p.getFullName().getFirstName()));
    
            // Xuất danh sách đã sắp xếp
            for (Person person : people) {
                person.output();
                System.out.println();
            }
        }
}
