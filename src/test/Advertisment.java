package test;

import lombok.NoArgsConstructor;

@NoArgsConstructor
public class Advertisment {
    private String content = "Very interresting review of the:";
    private Book book = null;

    public Advertisment(Book book) {
        this.book = book;
    }

    @Override
    public String toString() {
        return content + "\n" + book + "\n";
    }
}
