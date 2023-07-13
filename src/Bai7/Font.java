package Bai7;
public class Font {
    private int fontsize;
    private String fontname;
    
    public Font(int fontsize, String fontname) {
        this.fontsize = fontsize;
        this.fontname = fontname;
    }
    
    public int getFontsize() {
        return this.fontsize;
    }
    
    public void setFontsize(int fontsize) {
        this.fontsize = fontsize;
    }
    
    public String getFontname() {
        return this.fontname;
    }
    
    public void setFontname(String fontname) {
        this.fontname = fontname;
    }
    
    public void output() {
        System.out.println("Fontsize: " + fontsize);
        System.out.println("Fontname: " + fontname);
    }
}

