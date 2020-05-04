package app.printing;

import app.printing.Domain.Book.Find.BooksFinder;
import app.printing.Application.Book.Find.FindAndPrintAllBooks;
import app.printing.Domain.Book.Print.BookPrinter;
import app.printing.Infrastructure.Services.Book.Find.InMemory.FindBooksInMemory;
import app.printing.Infrastructure.Controller.FindAndPrintAllBooksController;
import app.printing.Infrastructure.Printer.Html.StandardOutputHtmlPrinter;

import javax.swing.*;

public class Main {
    // This should be inyected by Dependency Inyection system. That's just for the example.
    public static FindAndPrintAllBooksController findAndPrintAllBooksController = new FindAndPrintAllBooksController(
            new FindAndPrintAllBooks(
                    new BookPrinter(new StandardOutputHtmlPrinter())
                    , new BooksFinder(new FindBooksInMemory()))
    );

    public static void main(String[] args) {
        int option = 0;

        try {
            option = Integer.parseInt(JOptionPane.showInputDialog(null, " 1. Read books \n 2. Exit \n\n Choose an option", JOptionPane.QUESTION_MESSAGE));
        } catch (NumberFormatException n) {
            System.out.println(n.getMessage());
        }

        if (option == 1) {
            findAndPrintAllBooksController.findAndPrintAllBooks();
        }
    }
}
