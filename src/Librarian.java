public class Librarian extends Person implements Manageable {
    private String employeeId;
    // Constructor of Librarian
    public Librarian(String firstName, String lastName, String employeeId) {
        super(firstName, lastName);
        this.employeeId = employeeId;
    }
    // Get and return of ID of the Employee
    public String getEmployeeId() {
        return employeeId;
    }
    @Override
    public void showDetails() {
        System.out.println("Librarian: " + getFirstName() + " " + getLastName() + ", Employee ID: " + employeeId);
    }
    @Override
    public void loanBook(Book book, User user) {
        if (book.isAvailable() && user.canLoanBook()) {
            book.loan();
            user.incrementLoans();
            System.out.println("Book loaned to " + user.getFirstName() + ".");
        } else {
            System.out.println("Cannot loan the book.");
        }
    }
    // Returned books from user and update user loan count
    @Override
    public void returnBook(Book book, User user) {
        book.returnBook();
        user.decrementLoans();
        System.out.println("Book returned by " + user.getFirstName() + ".");
    }
}