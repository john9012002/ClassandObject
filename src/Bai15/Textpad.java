package Bai15;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Textpad extends Document {
    private int words;
    private int size;

    public Textpad() {
        super();
        this.fileName = "NoName.txt";
        this.words = 0;
        this.size = 0;
    }

    public int getWords() {
        String[] arr = content.trim().split("\\s+");
        return arr.length;
    }

    public int getSize() {
        return content.length();
    }

    @Override
    public void inputContent() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập nội dung: ");
        content = scanner.nextLine();
    }

    @Override
    public void save() {
        words = getWords();
        size = getSize();
        lastModifiedDate = LocalDateTime.now();
    }

    @Override
    public void saveAs(String newName) {
        fileName = newName;
        words = getWords();
        size = getSize();
        lastModifiedDate = LocalDateTime.now();
    }

    @Override
    public void open() {
        System.out.println("Tên file: " + fileName);
        System.out.println("Nội dung: " + content);
        System.out.println("Ngày tạo: " + createdDate.format(DateTimeFormatter.ofPattern("dd/MM/yyyy")));
        System.out.println("Ngày cập nhật cuối: " + lastModifiedDate.format(DateTimeFormatter.ofPattern("dd/MM/yyyy")));
        System.out.println("Số từ: " + words);
        System.out.println("Số ký tự: " + size);
    }
}
