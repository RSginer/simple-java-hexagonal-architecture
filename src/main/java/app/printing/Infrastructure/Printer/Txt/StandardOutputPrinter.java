package app.printing.Infrastructure.Printer.Txt;

import app.printing.Domain.Book.Service.Print.Printer;
import app.printing.Domain.Book.Book;

public final class StandardOutputPrinter implements Printer {
    public void print(Book book) {
        System.out.println(book);
    }
}
