package app.printing.Printer.Infrastructure.Html;

import app.printing.Printer.Domain.Printer;
import app.printing.Book.Domain.Book;

public final class StandardOutputHtmlPrinter implements Printer {
    public void print(Book book) {
        System.out.println("<div>" + book.getTitle() +"</div><div>" + book.getCurrentPage() + "</div><span>" + book.getId() + "</span>");
    }
}
