import java.util.Scanner;

public class Bai21 {
    public static void main(String[] args ){
        Scanner scanner = new Scanner(System.in);
        int number = 0;
        boolean isValid = false;
        while (!isValid) {
            try {
                System.out.print("Nhap so nguyen tu 50 den 100: ");
                number = Integer.parseInt(scanner.nextLine());
                if (number >= 50 && number <= 100) {
                    isValid = true;
                } else {
                    System.out.println("So nhap vao khong hop le");
                }
            } catch (NumberFormatException e) {
                System.out.println("Nhap sai dinh dang so nguyen");
            }
        }
        System.out.println("So nhap vao la: " + number);
    }
}
