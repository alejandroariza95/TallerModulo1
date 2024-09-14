# Library Management System
## Overview
This project models a basic library management system using Java. It includes classes to represent users, librarians, and books. The system allows for managing book loans and returns, and provides functionality to display details of users and librarians.

## Classes
`Person`
An abstract class representing a person with the following attributes and methods:

 - **Attributes**:
	- `private String firstName`: The first name of the person.
	- `private String lastName`: The last name of the person.
- **Constructor**:
	- `Person(String firstName, String lastName)`: Initializes the first and last names.
- **Methods**:
	- `public String getFirstName()`: Returns the first name.
	-`public String getLastName()`: Returns the last name.
	- `public abstract void showDetails()`: Abstract method for displaying details of the person.
`User` (extends Person)
Represents a library user with additional functionality for managing book loans.

- **Attributes**:
	- `private String id`: The user ID.
	- `private static final int MAX_LOANS`: Maximum number of books a user can loan.
	 - `private int booksLoaned`: Number of books currently loaned by the user.
- **Constructor**:
	- `User(String firstName, String lastName, String id)`: Initializes the user with first name, last name, and ID.
- **Methods**:
	- `public String getId()`: Returns the user ID.
	- `public boolean canLoanBook()`: Checks if the user can loan more books.
	- `public void incrementLoans()`: Increases the count of books loaned by the user.
	- `public void decrementLoans()`: Decreases the count of books loaned by the user.
	- `@Override public void showDetails()`: Displays the user's details.

`Book`
Represents a book in the library with methods for managing its availability.

- **Attributes**:
	- `private String title`: The title of the book.
	- `private String author`: The author of the book.
	- `private String isbn`: The ISBN of the book.
	- `private boolean available`: Availability status of the book.
- **Constructor**:
	-`Book(String title, String author, String isbn)`: Initializes the book with title, author, and ISBN.
- **Methods**:
	- `public String getTitle()`: Returns the title of the book.
	- `public String getAuthor()`: Returns the author of the book.
	- `public String getIsbn()`: Returns the ISBN of the book.
	- `public boolean isAvailable()`: Checks if the book is available.
	- `public void loan()`: Marks the book as loaned.
	- `public void returnBook()`: Marks the book as returned.
	- `@Override public String toString(`): Returns a string representation of the book.

`Librarian` (extends `Person` implements `Manageable`)
Represents a librarian who manages the loaning and returning of books.

 - **Attributes**:
	 `private String employeeId`: The employee ID of the librarian.
 - **Constructor**:
	-	`Librarian(String firstName, String lastName, String employeeId)`: Initializes the librarian with first name, last name, and employee ID.
 - **Methods**:
	- `public String getEmployeeId()`: Returns the employee ID.
	- `@Override public void showDetails()`: Displays the librarian's details.
	- `@Override public void loanBook(Book book, User user)`: Handles the loaning of a book to a user.
	- `@Override public void returnBook(Book book, User user)`: Handles the returning of a book from a user.
 - `Manageable`
	- An interface defining methods for managing book loans and returns.

 - `Methods`:
	- `void loanBook(Book book, User user)`: Method to loan a book to a user.
	- `void returnBook(Book book, User user)`: Method to return a book from a user.
