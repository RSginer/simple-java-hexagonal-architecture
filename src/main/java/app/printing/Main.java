package app.printing;

import app.printing.Book.Application.FindBooks;
import app.printing.Book.Application.NotAvailableBooks;
import app.printing.Book.Domain.Book;
import app.printing.Book.Infrastructure.Find.InMemory.FindBooksInMemory;
import app.printing.Printer.Application.PrintBooks;
import app.printing.Printer.Infrastructure.Html.StandardOutputHtmlPrinter;

import app.printing.Book.Domain.Service.Find.BooksFinder;
import app.printing.Printer.Domain.Service.BookPrinter;

import javax.swing.*;
import java.util.List;

public class Main {

    public static final FindBooks finder = new FindBooks(
            new BooksFinder(new FindBooksInMemory())
    );

    public static final PrintBooks printer = new PrintBooks(
            new BookPrinter(new StandardOutputHtmlPrinter())
    );

    public static void main(String[] args) {
        int option = 0;

        try {
            option = Integer.parseInt(
                    JOptionPane.showInputDialog(
                            null,
                            " 1. Read books \n 2. Exit \n\n Choose an option",
                            JOptionPane.QUESTION_MESSAGE
                    )
            );
        } catch (NumberFormatException n) {
            System.out.println(n.getMessage());
        }

        if (option == 1) {
            try {
                List<Book> books = finder.findBooks();
                printer.print(books);
            } catch (NotAvailableBooks ex) {
                System.out.println(ex.getMessage());
            }
        }

    }
}
