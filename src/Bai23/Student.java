package Bai23;
import java.util.regex.Pattern;

public class Student {
    private String id;
    private String name;

    public Student(String id, String name) throws Exception {
        if (!isValidID(id)) {
            throw new Exception("Invalid ID");
        }
        if (!isValidName(name)) {
            throw new Exception("Invalid Name");
        }
        this.id = id;
        this.name = name;
    }

    public String getFirstName() {
        String[] arr = name.split("\\s+");
        return arr[arr.length - 1];
    }

    public String getLastName() {
        String firstName = getFirstName();
        return name.substring(0, name.length() - firstName.length());
    }

    public String getEmail() {
        String lastName = getLastName();
        String firstChar = Character.toString(lastName.charAt(0));
        String lastFourChars = id.substring(5);
        return getFirstName().toLowerCase() + "." + firstChar.toLowerCase() + lastFourChars + "@sinhvien.hoasen.edu.vn";
    }

    private boolean isValidID(String id) {
        return Pattern.matches("[a-zA-Z]{2}[0-9]{7}", id);
    }

    private boolean isValidName(String name) {
        return name.split("\\s+").length >= 2;
    }

    public String getId() {
        return null;
    }
}

