package app.printing.Printer.Application;

import app.printing.Book.Domain.Book;
import app.printing.Printer.Domain.Service.BookPrinter;

import java.util.List;

public class PrintBooks {

    final BookPrinter bookPrinter;

    public PrintBooks(BookPrinter bookPrinter) {
        this.bookPrinter = bookPrinter;
    }

    public void print(List<Book> books) {
        for (Book book : books) {
            this.bookPrinter.printBook(book);
        }
    }
}
