import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Book {
    private String title;
    private String author;
    private int yearPublished;
    private int numPages;

    public Book(String title, String author, int yearPublished, int numPages) {
        this.title = title;
        this.author = author;
        this.yearPublished = yearPublished;
        this.numPages = numPages;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public int getYearPublished() {
        return yearPublished;
    }

    public int getNumPages() {
        return numPages;
    }
}

public class BookInformation {
    public static void main(String[] args) {
        List<Book> books = new ArrayList<>();

        // Tạo dữ liệu cho 5 cuốn sách
        books.add(new Book("Sách 1", "Tác giả 1", 2020, 200));
        books.add(new Book("Sách 2", "Tác giả 2", 2019, 150));
        books.add(new Book("Sách 3", "Tác giả 3", 2021, 300));
        books.add(new Book("Sách 4", "Tác giả 4", 2018, 250));
        books.add(new Book("Sách 5", "Tác giả 5", 2022, 180));

        // Xuất thông tin của 5 cuốn sách ra màn hình
        System.out.println("Thông tin của 5 cuốn sách:");
        for (Book book : books) {
            System.out.println("Tên sách: " + book.getTitle());
            System.out.println("Tác giả: " + book.getAuthor());
            System.out.println("Năm xuất bản: " + book.getYearPublished());
            System.out.println("Số trang: " + book.getNumPages());
            System.out.println();
        }

        // Xuất thông tin của 5 cuốn sách theo thứ tự tăng dần số trang
        System.out.println("Thông tin của 5 cuốn sách theo thứ tự tăng dần số trang:");
        Collections.sort(books, Comparator.comparing(Book::getNumPages));
        for (Book book : books) {
            System.out.println("Tên sách: " + book.getTitle());
            System.out.println("Tác giả: " + book.getAuthor());
            System.out.println("Năm xuất bản: " + book.getYearPublished());
            System.out.println("Số trang: " + book.getNumPages());
            System.out.println();
        }

        // Tìm sách có năm xuất bản mới nhất
        int newestYear = Integer.MIN_VALUE;
        Book newestBook = null;
        for (Book book : books) {
            if (book.getYearPublished() > newestYear) {
                newestYear = book.getYearPublished();
                newestBook = book;
            }
        }

        if (newestBook != null) {
            System.out.println("Sách có năm xuất bản mới nhất:");
            System.out.println("Tên sách: " + newestBook.getTitle());
            System.out.println("Tác giả: " + newestBook.getAuthor());
            System.out.println("Năm xuất bản: " + newestBook.getYearPublished());
            System.out.println("Số trang: " + newestBook.getNumPages());
        }
    }
}

