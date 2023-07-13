package Bai7;
public class Webpage {
    private String title;
    private String language;
    private Font fontwebpage;
    
    public Webpage(String title, String language, Font fontwebpage) {
        this.title = title;
        this.language = language;
        this.fontwebpage = fontwebpage;
    }
    
    public void output() {
        System.out.println("Title: " + title);
        System.out.println("Language: " + language);
        fontwebpage.output();
    }
}