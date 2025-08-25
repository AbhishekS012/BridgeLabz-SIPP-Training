
// Collections - Moderate: Library Book Filter using Streams
import java.util.*;
import java.util.stream.*;

class Book {
    String title;
    int year;
    double rating;
    Book(String title, int year, double rating) {
        this.title = title; this.year = year; this.rating = rating;
    }
}

public class LibraryBookFilter {
    public static void main(String[] args) {
        List<Book> books = Arrays.asList(
            new Book("Book A", 2016, 4.7),
            new Book("Book B", 2010, 4.8),
            new Book("Book C", 2018, 4.3),
            new Book("Book D", 2020, 4.9)
        );

        books.stream()
             .filter(b -> b.year > 2015 && b.rating > 4.5)
             .forEach(b -> System.out.println(b.title + " (" + b.year + ") Rating: " + b.rating));
    }
}
