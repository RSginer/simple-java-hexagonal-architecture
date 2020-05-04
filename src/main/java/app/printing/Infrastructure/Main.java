package app.printing.Infrastructure;

import app.printing.Infrastructure.Controller.FindAndPrintAllBooksController;
import app.printing.Infrastructure.Book.Service.Find.InMemory.FindBooksInMemory;
import app.printing.Infrastructure.Printer.Html.StandardOutputHtmlPrinter;

import app.printing.Application.Book.FindAndPrintAllBooks;

import app.printing.Domain.Book.Service.Find.BooksFinder;
import app.printing.Domain.Book.Service.Print.BookPrinter;

import javax.swing.*;

public class Main {

    public static FindAndPrintAllBooksController findAndPrintAllBooksController = new FindAndPrintAllBooksController(
            new FindAndPrintAllBooks(
                    new BookPrinter(new StandardOutputHtmlPrinter()),
                    new BooksFinder(new FindBooksInMemory())
            )
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
            findAndPrintAllBooksController.findAndPrintAllBooks();
        }

    }
}
