public abstract class Person {
    private String firstName;
    private String lastName;
    // Constructor for Person
    public Person(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }
    // Get and return for the First Name of the person
    public String getFirstName() {
        return firstName;
    }
    // Get and return for the Last Name of the person
    public String getLastName() {
        return lastName;
    }
    public abstract void showDetails(); // Abstract method to display the details of the person
}