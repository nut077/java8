package test;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Book {
    private String title;
    private int page;
    private boolean avaliable;
    private double price;

    public static Function<Book, Advertisment> makeAd = Advertisment::new;
    public static Predicate<Book> isAvaliable = Book::isAvaliable;
    public static Supplier<Book> newBookDraft = Book::new;
    public static Consumer<Book> impression = b -> System.out.println("Very good " + b);

    public static Predicate<Book> isAvaliableAndCheap = isAvaliable.and(book -> book.getPrice() > 200);

    public void shortInfo() {
        System.out.println("Short in about the " + getTitle());
    }

    public static Book discount(Book book) {
        book.price = 10;
        return book;
    }
}
