public interface Manageable {
    //Loan book to user
    void loanBook(Book book, User user);
    //Return book from user
    void returnBook(Book book, User user);
}