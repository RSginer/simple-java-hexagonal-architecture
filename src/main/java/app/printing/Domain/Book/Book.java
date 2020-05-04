package app.printing.Domain.Book;

public class Book {
    private final String id;
    private final String title;
    private final String currentPage;

    public Book(String id, String title, String currentPage) {
        this.id = id;
        this.title = title;
        this.currentPage = currentPage;
    }

    public String getCurrentPage() {
        return this.currentPage;
    }

    public String getTitle() {
        return this.title;
    }

    public String getId() {
        return id;
    }
}