package app.printing.Book.Domain.Service.Find;

import app.printing.Book.Domain.Book;
import app.printing.Book.Domain.Service.Find.FindBooksRepository;

import java.util.List;
import java.util.Optional;

public class BooksFinder {
    private final FindBooksRepository finder;

    public BooksFinder(FindBooksRepository finder) {
        this.finder = finder;
    }

    public Optional<List<Book>> findBooks() {
        return this.finder.find();
    }
}
