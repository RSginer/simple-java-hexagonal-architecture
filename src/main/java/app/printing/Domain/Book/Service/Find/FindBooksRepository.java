package app.printing.Domain.Book.Service.Find;

import app.printing.Domain.Book.Book;

import java.util.List;
import java.util.Optional;

public interface FindBooksRepository {
    Optional<List<Book>> find();
}
