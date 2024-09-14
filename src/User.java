public class User extends Person {
    private String id;
    private static final int MAX_LOANS = 3; // Max number of books a user can loan
    private int booksLoaned; // Number of books currently loaned by the user
    // Constructor of User
    public User(String firstName, String lastName, String id) {
        super(firstName, lastName);
        this.id = id;
        this.booksLoaned = 0;
    }
    // Get and return for the ID of user
    public String getId() {
        return id;
    }
    // Check the availability if the user can loan more books
    public boolean canLoanBook() {
        return booksLoaned < MAX_LOANS;
    }
    // Increase count of books loaned by user
    public void incrementLoans() {
        booksLoaned++;
    }
    // Decrease count of books loaned by user
    public void decrementLoans() {
        booksLoaned--;
    }
    @Override
    public void showDetails() {
        System.out.println("User: " + getFirstName() + " " + getLastName() + ", ID: " + id);
    }
}