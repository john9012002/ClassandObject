package Bai15;
import java.util.Scanner;

public class Bai15 {
     public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Textpad textpad = null;

        int choice = 0;
        while (choice != 6) {
            System.out.println("1. New Textpad");
            System.out.println("2. Input Textpad");
            System.out.println("3. Save Textpad");
            System.out.println("4. Save as Textpad");
            System.out.println("5. Open Textpad");
            System.out.println("6. Exit");
            System.out.print("Vui lòng chọn chức năng số: ");
            choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    textpad = new Textpad();
                    System.out.println("Tạo mới Textpad thành công");
                    break;
                case 2:
                    if (textpad != null) {
                        textpad.inputContent();
                    } else {
                        System.out.println("Vui lòng tạo mới Textpad trước");
                    }
                    break;
                case 3:
                    if (textpad != null) {
                        textpad.save();
                        System.out.println("Lưu Textpad thành công");
                    } else {
                        System.out.println("Vui lòng tạo mới Textpad trước");
                    }
                    break;
                case 4:
                    if (textpad != null) {
                        System.out.print("Nhập tên mới: ");
                        String newName = scanner.nextLine();
                        textpad.saveAs(newName);
                        System.out.println("Lưu Textpad thành công với tên mới: " + newName);
                    } else {
                        System.out.println("Vui lòng tạo mới Textpad trước");
                    }
                    break;
                case 5:
                    if (textpad != null) {
                        textpad.open();
                    } else {
                        System.out.println("Vui lòng tạo mới Textpad trước");
                    }
                    break;
                case 6:
                    System.out.println("Chương trình kết thúc");
                    break;
                default:
                    System.out.println("Vui lòng chọn chức năng hợp lệ");
                    break;
            }
        }
    }
}
