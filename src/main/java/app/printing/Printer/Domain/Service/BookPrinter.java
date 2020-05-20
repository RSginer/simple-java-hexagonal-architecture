package app.printing.Printer.Domain.Service;

import app.printing.Book.Domain.Book;
import app.printing.Printer.Domain.Printer;

public final class BookPrinter {
    public final Printer printer;

    public BookPrinter(Printer printer) {
        this.printer = printer;
    }

    public void printBook(Book book) {
        printer.print(book);
    }

}
