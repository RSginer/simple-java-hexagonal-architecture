package app.printing.Domain.Book.Find;

import app.printing.Domain.Book.Book;

import java.util.List;
import java.util.Optional;

public class BooksFinder {
    private final FindBooksRepository finder;

    public BooksFinder(FindBooksRepository finder) {
        this.finder = finder;
    }

    public Optional<List<Book>> getBooks() {
        return this.finder.find();
    }
}
