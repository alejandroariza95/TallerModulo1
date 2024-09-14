public class Book {
    private String title;
    private String author;
    private String isbn;
    private boolean available;
    // Constructor for Book
    public Book(String title, String author, String isbn) {
        this.title = title;
        this.author = author;
        this.isbn = isbn;
        this.available = true;
    }
    // Get and return for Tittle of the book
    public String getTitle() {
        return title;
    }
    // Get and return for ISBN of the book
    public String getAuthor() {
        return author;
    }
    // Get and return for Author of the book
    public String getIsbn() {
        return isbn;
    }
    // Boolean function to check availability for loan of book
    public boolean isAvailable() {
        return available;
    }
    // Set availability status of the book
    private void setAvailable(boolean available) {
        this.available = available;
    }
    // Flag loaned books
    public void loan() {
        if (available) {
            setAvailable(false);
        } else {
            System.out.println("The book is already loaned.");
        }
    }
    // Flag returned books
    public void returnBook() {
        setAvailable(true);
    }
    @Override
    public String toString() {
        return "Book [Title=" + title + ", Author=" + author + ", ISBN=" + isbn + ", Available=" + available + "]";
    }
}