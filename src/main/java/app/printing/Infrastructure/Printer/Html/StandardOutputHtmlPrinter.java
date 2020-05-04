package app.printing.Infrastructure.Printer.Html;

import app.printing.Domain.Book.Print.Printer;
import app.printing.Domain.Book.Book;

public final class StandardOutputHtmlPrinter implements Printer {
    public void print(Book book) {
        System.out.println("<div>" + book.getTitle() +"</div><div>" + book.getCurrentPage() + "</div><span>" + book.getId() + "</span>");
    }
}
