package app.printing.Book.Infrastructure.Find.InMemory;

import app.printing.Book.Domain.Book;
import app.printing.Book.Domain.Service.Find.FindBooksRepository;

import java.util.*;

public class FindBooksInMemory implements FindBooksRepository {
    private final List<Book> books;

    public FindBooksInMemory() {
        this.books = new ArrayList<>(Arrays.asList(
                new Book(UUID.randomUUID().toString(), "Clean Code", "Read this shit."),
                new Book(UUID.randomUUID().toString(), "Clean Architecture", "Read this shit."))
        );
    }

    public Optional<List<Book>> find() {
        return Optional.ofNullable(this.books);
    }

}
