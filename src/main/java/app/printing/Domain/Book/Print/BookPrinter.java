package app.printing.Domain.Book.Print;

import app.printing.Domain.Book.Book;

public final class BookPrinter {
    public final Printer printer;

    public BookPrinter(Printer printer) {
        this.printer = printer;
    }

    public void printBook(Book book) {
        printer.print(book);
    }

}
