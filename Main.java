package KitapListesi;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<Book> books = new ArrayList<>();
        books.add(new Book("1. Kitap", 50, "1.Yazar", 1910));
        books.add(new Book("2. Kitap", 70, "2.Yazar", 1920));
        books.add(new Book("3. Kitap", 80, "3.Yazar", 1930));
        books.add(new Book("4. Kitap", 90, "4.Yazar", 1940));
        books.add(new Book("5. Kitap", 100, "5.Yazar", 1950));
        books.add(new Book("6. Kitap", 600, "6.Yazar", 1960));
        books.add(new Book("7. Kitap", 700, "7.Yazar", 1970));
        books.add(new Book("8. Kitap", 800, "8.Yazar", 1980));
        books.add(new Book("9. Kitap", 900, "9.Yazar", 1990));
        books.add(new Book("10. Kitap", 1000, "10.Yazar", 2000));

        Map<String, String> bookAuthors = new HashMap<>();

        books.forEach(book -> bookAuthors.put(book.getBookName(), book.getAuthorName()));

        bookAuthors.forEach((name, author) -> System.out.println(name + " : " + author));

        bookAuthors.forEach((key, value) -> System.out.println(key + " : " + value));

        List<Book> o100 = books.stream().filter(book -> book.getBookPage() > 100).toList();

        o100.forEach(book -> System.out.println(book.getBookName() + " " + book.getAuthorName() + " " + book.getBookPage() + " " + book.getPublicationDate()));
    }
}


