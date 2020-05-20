package app.printing.Printer.Infrastructure.Txt;

import app.printing.Printer.Domain.Printer;
import app.printing.Book.Domain.Book;

public final class StandardOutputPrinter implements Printer {
    public void print(Book book) {
        System.out.println(book);
    }
}
