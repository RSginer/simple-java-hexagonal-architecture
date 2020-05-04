package app.printing.Infrastructure.Swing.Controller;

import app.printing.Application.Book.FindAndPrintAllBooks;

public final class FindAndPrintAllBooksSwingController {
    private final FindAndPrintAllBooks findAndPrintAllBooksService;

    public FindAndPrintAllBooksSwingController(FindAndPrintAllBooks findAndPrintAllBooksService) {
        this.findAndPrintAllBooksService = findAndPrintAllBooksService;
    }

    public void findAndPrintAllBooks() {
        this.findAndPrintAllBooksService.findAndPrintAllBooks();
    }

}
