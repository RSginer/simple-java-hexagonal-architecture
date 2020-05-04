package app.printing.Application.Book.Find;

import app.printing.Domain.Book.Find.BooksFinder;
import app.printing.Domain.Book.Print.BookPrinter;
import app.printing.Domain.Book.Book;

import java.util.List;
import java.util.Optional;

public final class FindAndPrintAllBooks {
    private final BooksFinder booksFinder;
    private final BookPrinter bookPrinter;

    public FindAndPrintAllBooks(BookPrinter bookPrinter, BooksFinder booksFinder) {
        this.booksFinder = booksFinder;
        this.bookPrinter = bookPrinter;
    }

    public void findAndPrintAllBooks() {
        Optional<List<Book>> books = booksFinder.findBooks();
        if (books.isPresent()) {
            for (Book book : books.get()) {
                this.bookPrinter.printBook(book);
            }
        }
    }
}
