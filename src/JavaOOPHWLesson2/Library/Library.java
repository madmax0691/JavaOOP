package JavaOOPHWLesson2.Library;

import java.util.ArrayList;

public class Library {
    private final ArrayList<Book> library = new ArrayList<>();

    public void addBook(Book book) {
        library.add(book);
    }

    public ArrayList<Book> searchByAuthor(String author) {
        ArrayList<Book> byAuthor = new ArrayList<>();
        for (Book book :
                library) {
            if (book.getAuthor().equals(author)) {
                byAuthor.add(book);
            }
        }
        return byAuthor;
    }

    public ArrayList<Book> searchByPublisher(String publisher) {
        ArrayList<Book> byPublisher = new ArrayList<>();
        for (Book book :
                library) {
            if (book.getPublishingHouse().equals(publisher)) {
                byPublisher.add(book);
            }
        }
        return byPublisher;
    }

    public ArrayList<Book> searchByYears(int year) {
        ArrayList<Book> byYear = new ArrayList<>();
        for (Book book :
                library) {
            if (book.getYearOfPublishing() >= year) {
                byYear.add(book);
            }
        }
        return byYear;
    }

    public ArrayList<String> names(ArrayList<Book> book) {
        ArrayList<String> names = new ArrayList<>();
        for (Book bookExample :
                book) {
            names.add(bookExample.getName());
        }
        return names;
    }
}
