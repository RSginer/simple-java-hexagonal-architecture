package app.printing.Book.Domain.Service.Find;

import app.printing.Book.Domain.Book;

import java.util.List;
import java.util.Optional;

public interface FindBooksRepository {
    Optional<List<Book>> find();
}
