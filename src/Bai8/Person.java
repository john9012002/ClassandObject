package Bai8;

public class Person {
    private int id;
    private Name fullName;
    private String address;

    public Person(int id, Name fullName, String address) {
        this.id = id;
        this.fullName = fullName;
        this.address = address;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Name getFullName() {
        return fullName;
    }

    public void setFullName(Name fullName) {
        this.fullName = fullName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void output() {
        System.out.println("ID: " + id);
        fullName.output();
        System.out.println("Address: " + address);
    }
}
