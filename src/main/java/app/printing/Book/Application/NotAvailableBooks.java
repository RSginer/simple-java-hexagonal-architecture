package app.printing.Book.Application;

public class NotAvailableBooks extends RuntimeException{
    public NotAvailableBooks(){
        super("Books not found");
    }
}
