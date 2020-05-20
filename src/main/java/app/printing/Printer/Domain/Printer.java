package app.printing.Printer.Domain;

import app.printing.Book.Domain.Book;

public interface Printer {
    void print(Book book);
}
