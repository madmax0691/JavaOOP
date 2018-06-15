package JavaOOPHWLesson4.Messenger;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class Message {
    private final String author;
    private final LocalDateTime date;
    private final Text content;

    public Message(String author, LocalDateTime date, Text content) {
        this.author = author;
        this.date = date;
        this.content = content;
    }

    public String getAuthor() {
        return author;
    }

    public LocalDateTime getDate() {
        return date;
    }

    public String getContent() {
        return content.getText();
    }
}
