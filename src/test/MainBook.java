package test;

import java.util.*;

public class MainBook {
    public static void main(String[] args) {
        List<Book> bookList = Arrays.asList(
            new Book("a", 30, true, 300),
            new Book("b", 20, true, 200),
            new Book("c", 10, false, 100),
            new Book("d", 40, true, 400)
        );

        /*bookList.stream().filter(Book::isAvaliable)
            .sorted(Comparator.comparing(Book::getPage).reversed())
            .forEach(System.out::println);*/

        /*Advertisment ad = Book.makeAd.apply(bookList.get(1));
        System.out.println(ad);

        System.out.println(Book.isAvaliable.test(bookList.get(1)));

        Book darft = Book.newBookDraft.get();
        Book.impression.accept(bookList.get(0));*/
        /*bookList.stream()
            .filter(Book.isAvaliableAndCheap)
            .forEach(System.out::print);*/

        /*bookList.stream().forEach(Book::shortInfo);*/

        /*bookList.stream().map(Book::discount)
            .forEach(System.out::print);*/

        bookList.stream()
            .sorted(Comparator.comparing(Book::getPage))
            .forEach(System.out::print);

    }
}
