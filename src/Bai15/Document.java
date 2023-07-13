package Bai15;
import java.time.LocalDateTime;

public abstract class Document {
    protected String fileName;
    protected LocalDateTime createdDate;
    protected LocalDateTime lastModifiedDate;
    protected String content;

    public Document() {
        this.fileName = "Document1";
        this.createdDate = LocalDateTime.now();
        this.lastModifiedDate = null;
    }

    public abstract void inputContent();

    public abstract void save();

    public abstract void saveAs(String newName);

    public abstract void open();
}

