package app.printing.Book.Application;

import app.printing.Book.Domain.Book;
import app.printing.Book.Domain.Service.Find.BooksFinder;

import java.util.List;

public class FindBooks {

    private final BooksFinder booksFinder;

    public FindBooks(BooksFinder booksFinder) {
        this.booksFinder = booksFinder;
    }

    public List<Book> findBooks() {
        return this.booksFinder.findBooks().orElseThrow(NotAvailableBooks::new);
    }

}
