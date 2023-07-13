package Bai7;
public class App {
    public static void main(String[] args) {
        Font font = new Font(12, "Arial");
        Webpage webpage = new Webpage("Example Webpage", "English", font);
        webpage.output();
    }

}
