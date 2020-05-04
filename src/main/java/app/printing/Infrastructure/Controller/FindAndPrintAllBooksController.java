package app.printing.Infrastructure.Controller;

import app.printing.Application.Book.Find.FindAndPrintAllBooks;

public final class FindAndPrintAllBooksController {
    private final FindAndPrintAllBooks findAndPrintAllBooksService;

    public FindAndPrintAllBooksController(FindAndPrintAllBooks findAndPrintAllBooksService) {
        this.findAndPrintAllBooksService = findAndPrintAllBooksService;
    }

    public void findAndPrintAllBooks() {
        this.findAndPrintAllBooksService.findAndPrintAllBooks();
    }
}
